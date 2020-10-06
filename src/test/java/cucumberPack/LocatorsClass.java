package cucumberPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocatorsClass extends Baseclass {
	public static void main(String args) {
		PageFactory.initElements(driver, LocatorsClass.class);

	}

	@FindBy(how = How.XPATH, using = "(//a[text()='FLIGHTS'])[1]")
	static WebElement flight;

	@FindBy(how = How.XPATH, using = "(//select)[1]")
	static WebElement from;

	@FindBy(how = How.XPATH, using = "(//select)[2]")
	static WebElement to;

	@FindBy(how = How.XPATH, using = "//span[@class='ui-datepicker-month']")
	static WebElement monthName;

	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	static WebElement nextButton;

	@FindBy(how = How.ID, using = "departure")
	static WebElement departure;

	@FindBy(how = How.XPATH, using = "(//button[text()='Continue'])[1]")
	static WebElement continueButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='airport-group-addon fa fa-angle-down'])[1]")
	static WebElement fromDropDown;

	@FindBy(how = How.XPATH, using = "(//span[@class='airport-group-addon fa fa-angle-down'])[2]")
	static WebElement toDropDown;

	@FindBy(how = How.XPATH, using = "//button[text()='Find Flights']")
	static WebElement findFlights;

	@FindBy(how = How.XPATH, using = "//label[text()='Destination']")
	static WebElement destinationButton;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-info fareSelectionBtn ng-star-inserted']")
	static WebElement startinfromButton;

	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary'])[1]")
	static WebElement selectButton;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	static WebElement continueButton2;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='ui-button-icon-left ui-clickable pi pi-caret-down'])[1]")
	static WebElement titleDropdown;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='ui-button-icon-left ui-clickable pi pi-caret-down'])[3]")
	static WebElement provinceDropdown;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Mr']")
	static WebElement mr ;
	
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]")
	static WebElement fName ;

	@FindBy(how = How.CSS, using = "input#lastName_0")
	static WebElement lName ;

	@FindBy(how = How.ID, using = "email_0")
	static WebElement email ;

	@FindBy(how = How.ID, using = "phoneNumber_0")
	static WebElement phNo ;

	@FindBy(how = How.ID, using = "mobileNumber_0")
	static WebElement mbNo ;

	@FindBy(how = How.ID, using = "address1_0")
	static WebElement address ;

	@FindBy(how = How.ID, using = "address2_0")
	static WebElement address2 ;

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[9]")
	static WebElement country ;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'South Australia')]")
	static WebElement province ;

	@FindBy(how = How.ID, using = "city_0")
	static WebElement city ;

	@FindBy(how = How.ID, using = "postalCode_0")
	static WebElement postal ;
	
	@FindBy(how= How.XPATH, using ="//span[contains(text(),'South Australia')]")
	static WebElement sOZ;
	
	//button[text()='Next']
	@FindBy(how= How.XPATH, using ="//button[text()='Next']")
	static WebElement next;
	

}
