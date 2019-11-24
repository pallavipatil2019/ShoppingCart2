
package basicsetup;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement ;



public class BaseClass {
	private static final String JavascriptExecutor = null;
	Actions action;
	
	public void performMouseHower(WebElement element ,WebDriver driver) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
		
	}
	
	public void setText(String text,WebElement element) {
	element.sendKeys(text);
	}

	public void selectByVisibleText(WebElement selectsize, String text) {
		
		Select s =new Select (selectsize);
		s.selectByVisibleText(text);		
	}
   public void clickingJavaScriptExecutor(WebElement element,WebDriver driver) {
	   JavascriptExecutor executor= (JavascriptExecutor)driver;
	   executor.executeScript("argument[0].click()",element);
   }
   
   public void refersh(WebDriver driver) {
	   driver.navigate().refresh();
   }

   public boolean validateText(WebDriver driver ,WebElement element, String expectedText) {
	   String observedText =element.getText();
	   System.out.println(observedText);
	   if (observedText.equals(expectedText)) {
		   return true;
	   }
	   return false;
   }
}

	

