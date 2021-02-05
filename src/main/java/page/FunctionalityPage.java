package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FunctionalityPage {
	WebDriver driver;
	
public FunctionalityPage(WebDriver driver) {
	this.driver=driver;	
	}
	 
	//element library
	
	WebElement TOGGLE_ALL_LOCATOR_WEBELEMENT=driver.findElement(By.name("input[name='allbox']"));
	By TOGGLE_ALL_FIELD_LOCATOR=By.name("input[name='allbox']");
	
	@FindBy(how=How.NAME, using="allbox") WebElement TOGGLE_ALL_LOCATOR;
	@FindBy(how=How.XPATH, using="//input[@type=\\\"submit\\\"and@value=\\\"Remove\\\" ]") WebElement REMOVE_LOCATOR;
	@FindBy(how=How.NAME, using="input[type=\\\"checkbox\\\" ] +input[ value=\\\"Remove\\\"]") WebElement REMOVE_AND_TOGGLE_ALL;
	
	
	//Interactive Methods
	public void toggleAll() {
		TOGGLE_ALL_LOCATOR.click();
	}
	
	public void remove() {
		
		REMOVE_LOCATOR.click();	
	}
	
public void removeAndToggleAll() {
	
	 REMOVE_AND_TOGGLE_ALL.click();
}
}

