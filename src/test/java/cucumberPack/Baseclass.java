package cucumberPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor jse;
	public static Select select;

	public static void setDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\HariharasudhanPOM\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void launch(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}

	public static String javascripttypeText(WebElement element, String data) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value', '" + data + "');", element);
		return data;
	}

	public static String typeText(WebElement element, String value) {
		element.sendKeys(value);
		return value;
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static String getText(WebElement element) {
		String mes = element.getText();
		return mes;

	}

	public static String getAttribute(WebElement element, String attribute) {
		String s = element.getAttribute(attribute);
		return s;

	}

	public static void javascriptClick(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);

	}

	public static void javascriptScroll(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void moveTo(WebElement target) {
		act = new Actions(driver);
		act.moveToElement(target).perform();

	}

	public static void actionsClick(WebElement target) {
		act = new Actions(driver);
		act.click().perform();

	}

	public static void actionsContextClick(WebElement target) {
		act = new Actions(driver);
		act.contextClick(target).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(source, target).perform();

	}

	public static void doubleClick(WebElement target) {
		act = new Actions(driver);
		act.doubleClick(target);

	}

	public static String selectbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		return value;
	}
	public static String selectbyVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		return value;
	}
	
	

	public static Integer selectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		return index;
	}

	public static String deselectbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		return value;
	}

	public static Integer deselectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		return index;
	}

	public static List optionsList(WebElement element, List options) {
		Select select = new Select(element);
		select.getOptions();
		return options;
	}

	public static List selectedOptions(WebElement element, List options) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
		return options;
	}

	public static void driverQuit() {
		driver.quit();
	}

	public static void datePicker(String monthName, int date, WebElement month, WebElement next) {

		while (true) {
			String text = month.getText();
			if (text.equalsIgnoreCase(monthName)) {

				WebElement e =driver.findElement(By.xpath("//table//td//a[text()='"+date +"']"));
				e.click();
				System.out.println(e.getText());

				break;
			} else {
				next.click();

			}

		}
	}
	
	public static void dropDownSelector(String text, int dropDownNo) {
		
		driver.findElement(By.xpath("(//button[starts-with(text(), '"+text+"')])["+dropDownNo+"]")).click();
	}
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	

}
