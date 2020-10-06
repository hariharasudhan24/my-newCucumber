package cucumberPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoachSelection extends LocatorsClass {
	@Given("user is on choosing coach price")
	public void user_is_on_choosing_coach_price() throws InterruptedException {

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
		LocatorsClass.dropDownSelector("Cooktown", 1);
		LocatorsClass.click(destinationButton);
		LocatorsClass.dropDownSelector("Cairns", 2);
		LocatorsClass.click(findFlights);

	}

	@When("user selects the coach")
	public void user_selects_the_coach() throws InterruptedException {
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.cssSelector(
				"button[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(e).click().build().perform();
		LocatorsClass.click(startinfromButton);
		LocatorsClass.click(selectButton);
		Thread.sleep(3000);

	}

	@Then("user can continue booking")
	public void user_can_continue_booking() {
		LocatorsClass.click(continueButton2);
	}

}
