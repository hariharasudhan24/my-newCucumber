package cucumberPack;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features= {"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\Coach.feature",
"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\Cucumber.feature",
"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\FindingFlights.feature",
"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\Personalinfo.feature"
},
//glue= {"cucumberPack"},

monochrome= true,
plugin= {"pretty","json:target//cucumber-json-report.json"}

 )
public class CRunnerClass   {
	@AfterClass
	public static void aftermethod() {
		JVMReport.generateReport("C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\target\\cucumber-json-report.json");
	}
}
