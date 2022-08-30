package in.swiggy.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfterTest extends ToolsT {
		@Before
		public void setUp(Scenario scenario) {
			DriverT.init();
			driver.manage().window().maximize();
			driver.get("http://www.swiggy.com");
				
			}
		@After
		public void tearDown() {
		driver.quit();
		}
}
