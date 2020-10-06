package cucumberPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitionClass extends LocatorsClass {
	@Given("user is on home page")
	public void user_is_on_home_page() {
		LocatorsClass.launch("https://www.skytrans.com.au/");
		PageFactory.initElements(driver, LocatorsClass.class);
	}

	@When("user enters {string} , {string} , {string} and {int}")
	public void user_enters_traveling_location_and_date(String fromplace, String toplace, String month, int date) {
		String window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			if (!windows.equals(s))
				driver.switchTo().window(s);
			LocatorsClass.click(departure);
			LocatorsClass.selectbyVisibleText(from, fromplace);
			LocatorsClass.selectbyVisibleText(to, toplace);
			LocatorsClass.datePicker(month, date, monthName, nextButton);

		}
	}

	@Then("user can able to find flights")
	public void user_can_able_to_find_flights() {
		LocatorsClass.click(continueButton);
	}

}
