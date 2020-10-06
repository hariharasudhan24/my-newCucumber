package cucumberPack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateReport(String jsonFile) {
	File file = new File("C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Reports");
	List<String> list = new ArrayList<String>();
	list.add(jsonFile);
	Configuration con = new Configuration(file, "Skytran-Automation");
	con.addClassifications("OperatingSystem", "Windows10");
	con.addClassifications("JDK", "1.8");
	con.addClassifications("SeleniumWebDriver", "3.141.59");
	con.addClassifications("Framework", "BBD");
	con.addClassifications("Tool", "Cucumber");
	ReportBuilder builder = new ReportBuilder(list, con);
	builder.generateReports();
}
	
	
}
