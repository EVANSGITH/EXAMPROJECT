package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {
	
WebDriver driver;
	
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.NAME, using = "categorydata") WebElement CATEGORY_FIELD_LOCATOR;
     @FindBy(how =How.XPATH,using="//*[@id=\"extra\"]/input[2]")WebElement ADDCATEGORY_FIELD_LOCATOR;
	
	
	
	public void AddCategory(String HOBBY) {
		CATEGORY_FIELD_LOCATOR.sendKeys(HOBBY);
	}

	public void clickOnAddcategory() {
		ADDCATEGORY_FIELD_LOCATOR.click();
		
	}

}



