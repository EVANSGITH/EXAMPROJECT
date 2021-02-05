package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class AddCategoryDuplicateValidationTest {
	
	public static WebDriver driver;

	@Test
	public void UserShouldNotBeAbleToAddDuplicateCategory()  {
		
		driver = BrowserFactory.init();

		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		AddCategoryDuplicateValidationTest addCategory = PageFactory.initElements(driver,AddCategoryDuplicateValidationTest.class);
		 
		// addCategory.clickOnAddCategory();
		

}
	}
