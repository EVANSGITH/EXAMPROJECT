package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToAddCategory() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		AddCategoryPage addCategory = PageFactory.initElements(driver,AddCategoryPage.class);
		 addCategory.AddCategory("HOBBY");
		 addCategory .clickOnAddcategory();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

		//BrowserFactory.tearDown();
	}

}
