
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basicsetup.BaseClass;

public class AddToShoppingCartPage {
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement itemImage;
	
	@FindBy(xpath ="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
	WebElement btnMore;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	WebElement txtQuantity;
	
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement selectsize;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	WebElement btnaddTocart;
	
	 @FindBy(css="div#layer_cart a > span")
	WebElement checkoutcart;
	
	/*public static void checkoutcart(WebDriver driver) {
		
	driver.findElement(By.xpath("//*[@id=\"product\"]")).click();
		}*/
		
	
	@FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")
	WebElement cartText;

	BaseClass selenium;
	
	public AddToShoppingCartPage(WebDriver driver){
	PageFactory.initElements(driver,this);
	selenium=new BaseClass();
	}

	public boolean validateAddToShoppingCartPage(WebDriver driver){
	selenium.performMouseHower(itemImage,driver);
	selenium.click(btnMore);
	selenium.clear(txtQuantity);
	
	selenium.setText("2",txtQuantity);
	selenium.selectByVisibleText(selectsize, "M");
	selenium.click(btnaddTocart);
		
	selenium.clickingJavaScriptExecutor(checkoutcart,driver);
	
	selenium.refersh(driver);
	

	return selenium.validateText(driver, cartText, "2");
	
	}
}