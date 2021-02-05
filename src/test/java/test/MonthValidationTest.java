package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.MonthValidationPage;
import util.BrowserFactory;

public class MonthValidationTest  {

	
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToSeeAllTwelveMonth() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		MonthValidationPage validatemonth = PageFactory.initElements(driver, MonthValidationPage.class);
		 validatemonth.clickONDUEMONTH();
		 validatemonth.clickOnJAN();
		
		 validatemonth.clickOnFeb();
		
		 validatemonth.clickOnMar();
		
		 validatemonth.clickOnApril();
		 
		 validatemonth.clickOnMay();
		
		 validatemonth.clickOnJun();
		
		 validatemonth.clickOnJul();
		
		 validatemonth.clickOnAug();
		
		 validatemonth.clickOnSep();


		 validatemonth.clickOnOct();
		
		 validatemonth.clickOnNov();
		 
		 validatemonth.clickOnDec();
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	}
}
