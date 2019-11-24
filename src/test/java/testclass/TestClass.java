

package testclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.AddToShoppingCartPage;


public class TestClass {
	
	WebDriver driver;
	AddToShoppingCartPage page;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver" , "D:\\pallaviproj\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		page=new AddToShoppingCartPage(driver);
		
	}

	@Test 
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToShoppingCartPage(driver));
	}
}

