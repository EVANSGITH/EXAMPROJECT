package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryDuplicateValidationPage {

WebDriver driver;
	
	public AddCategoryDuplicateValidationPage (WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "categorydata") WebElement CATEGORY_FIELD_LOCATOR;
     @FindBy(how =How.XPATH,using="//*[@id=\"extra\"]/input[2]")WebElement ADDCATEGORY_FIELD_LOCATOR;
	
	
	//Interactive Methods
	public void AddCategory(String WORK) {
		CATEGORY_FIELD_LOCATOR.sendKeys(WORK);
	}

	public void clickOnAddcategory() {
		ADDCATEGORY_FIELD_LOCATOR.click();
		
	}

}
