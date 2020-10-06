package cucumberPack;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LocatorsClass {

	@Before
	public void beforeMethod() {
		LocatorsClass.setDriver();
		LocatorsClass.launch("https://www.skytrans.com.au/");
	}
	
	@After
	public  void aftermethod() {
		
		LocatorsClass.driverQuit();
	}

}
