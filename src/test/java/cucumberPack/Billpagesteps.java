package cucumberPack;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Billpagesteps extends LocatorsClass {
	
	@Given("user is on Passengers Info page")
	public void user_is_on_Passengers_Info_page() throws InterruptedException {

		PageFactory.initElements(driver, LocatorsClass.class);
			LocatorsClass.click(departure);
			LocatorsClass.selectbyVisibleText(from, "Cooktown");
			LocatorsClass.selectbyVisibleText(to, "Kowanyama");
			LocatorsClass.datePicker("December", 7, monthName, nextButton);
			LocatorsClass.click(continueButton);
			Thread.sleep(12000);
			String window = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String s : windows) {
				
					driver.switchTo().window(s);
			}
			LocatorsClass.click(fromDropDown);
			LocatorsClass.dropDownSelector("Cooktown",1);
			LocatorsClass.click(destinationButton);
			LocatorsClass.dropDownSelector("Cairns",2);
			LocatorsClass.click(findFlights);
			Thread.sleep(5000);
			WebElement e = driver.findElement(By.cssSelector("button[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']"));
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.moveToElement(e).click().build().perform();
			LocatorsClass.click(startinfromButton);
			LocatorsClass.click(selectButton);
			Thread.sleep(3000);
			LocatorsClass.click(continueButton2);
	   
	}

	@When("user enters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_enters_phNo_mbNo_and_postalCode(String firstName, String lastName, String emailId, String phoneNo, String mobileNo, String addressl1, String addressl2, String cityName, String postalcode, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> list = dataTable.asMaps();
		Thread.sleep(3000);
		LocatorsClass.click(titleDropdown);
		LocatorsClass.click(mr);
		LocatorsClass.typeText(fName, list.get(0).get("firstname"));
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LocatorsClass.moveTo(lName);
		LocatorsClass.actionsClick(lName);
		LocatorsClass.typeText(lName, list.get(0).get("lastname"));
		LocatorsClass.moveTo(email);
		LocatorsClass.actionsClick(email);
		LocatorsClass.typeText(email, list.get(0).get("emailid"));
		LocatorsClass.moveTo(phNo);
		LocatorsClass.actionsClick(phNo);
		LocatorsClass.typeText(phNo, list.get(0).get("phoneNo"));
		LocatorsClass.moveTo(mbNo);
		LocatorsClass.actionsClick(mbNo);
		LocatorsClass.typeText(mbNo, list.get(0).get("mobileNo"));
		LocatorsClass.moveTo(address);
		LocatorsClass.actionsClick(address);
		LocatorsClass.typeText(address, list.get(0).get("address"));
		LocatorsClass.moveTo(address2);
		LocatorsClass.actionsClick(address2);
		LocatorsClass.typeText(address2, list.get(0).get("address2"));
		LocatorsClass.moveTo(provinceDropdown);
		LocatorsClass.actionsClick(provinceDropdown);
		LocatorsClass.click(provinceDropdown);
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(province));
		LocatorsClass.moveTo(province);
		LocatorsClass.actionsClick(province);
		LocatorsClass.javascriptScroll(next);
		LocatorsClass.moveTo(city);
		LocatorsClass.actionsClick(city);
		LocatorsClass.typeText(city, list.get(0).get("city"));
		LocatorsClass.moveTo(postal);
		LocatorsClass.actionsClick(postal);
		LocatorsClass.typeText(postal, list.get(0).get("postal"));
		
		
	}
	

	@Then("User can able to know the total fare")
	public void user_can_able_to_know_the_total_fare() {
		LocatorsClass.moveTo(next);
		LocatorsClass.actionsClick(next);
		LocatorsClass.click(next);
	}

}
