package cucumberPack;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightSelectionSteps extends LocatorsClass {
	@Given("user is on findingflights page")
	public void user_is_on_findingflights_page() {

		PageFactory.initElements(driver, LocatorsClass.class);
		LocatorsClass.click(departure);
		LocatorsClass.selectbyVisibleText(from, "Cooktown");
		LocatorsClass.selectbyVisibleText(to, "Kowanyama");
		LocatorsClass.datePicker("December", 7, monthName, nextButton);
		LocatorsClass.click(continueButton);
	}

	@When("user provides {string} and {string}")
	public void user_provides_and(String string, String string2, io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> list = dataTable.asMaps();

		Thread.sleep(12000);
		String window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {

			driver.switchTo().window(s);
		}
		LocatorsClass.click(fromDropDown);
		LocatorsClass.dropDownSelector(list.get(2).get("origin"), 1);
		LocatorsClass.click(destinationButton);
		LocatorsClass.dropDownSelector(list.get(2).get("destination"), 2);

	}

	@Then("user can able into flight booking page")
	public void user_can_able_into_flight_booking_page() {
		LocatorsClass.findFlights.click();
	}

}
