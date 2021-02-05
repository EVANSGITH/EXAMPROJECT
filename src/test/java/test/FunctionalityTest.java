package test;








import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.FunctionalityPage;
import util.BrowserFactory;

public class FunctionalityTest  {
	WebDriver driver;

		
	
	@Test
	public void login(){
		driver=BrowserFactory.init();
		//FunctionalityPage FunctionalityPage=new FunctionalityPage();
		FunctionalityPage FunctionalityPage1=PageFactory.initElements(driver, FunctionalityPage.class);
		FunctionalityPage1.toggleAll();
		FunctionalityPage1.remove();
		FunctionalityPage1.removeAndToggleAll();
	
	}
	}


