package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MonthValidationPage extends BasePage{

WebDriver driver;


	
public MonthValidationPage (WebDriver driver) {
		
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']") WebElement DUE_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[2]") WebElement JAN_MONTH_FIELD_FIELD_LOCATOR; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[3]") WebElement FEB_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[4]") WebElement MAR_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[5]") WebElement APRIL_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[6]") WebElement MAY_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[7]") WebElement JUN_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[8]") WebElement JUL_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[9]") WebElement AUG_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[10]") WebElement SEP_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[11]") WebElement OCT_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[12]") WebElement NOV_MONTH_FIELD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[13]") WebElement DEC_MONTH_FIELD_FIELD_LOCATOR;
	//Interactive Methods
	public void clickONDUEMONTH() {
		DUE_MONTH_FIELD_FIELD_LOCATOR.click();
	}
public void clickOnJAN() {
	JAN_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnFeb() {
	FEB_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnMar() {
	MAR_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnApril() {
	APRIL_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnMay() {
	MAY_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnJun() {
	JUN_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnJul() {
	JUL_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnAug() {
	AUG_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnSep() {
	SEP_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnOct() {
	OCT_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnNov() {
	NOV_MONTH_FIELD_FIELD_LOCATOR.click();
}
public void clickOnDec() {
	DEC_MONTH_FIELD_FIELD_LOCATOR.click();
}
	
	
}
