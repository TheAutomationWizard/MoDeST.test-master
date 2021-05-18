package scenarios;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import app_utility.Business_utility;
import common_utility.baseTest;
import modest.coreUtility.Common_Utility;
import modest.reporting.modestReporting;




@Listeners(modestReporting.class)
public class TestCaseOne extends baseTest {
	
	
	Common_Utility util = new Common_Utility();
	Business_utility bl	= new Business_utility(60000);
	
	

	@Test
	public void Testcaseone() throws Exception {
		
		
		System.out.println("This is a dummy test script and won't work. Use this as a reference to script yours.");
		
		Assert.assertTrue(bl.login("username", "password"), " Failed to login");
			util.stepPrinter("Successfully logged in", "PASS");
		
	}

	
	
	
	
}
