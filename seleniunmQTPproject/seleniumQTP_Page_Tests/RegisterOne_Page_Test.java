package seleniumQTP_Page_Tests;
import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunction.BaseClass;
import initializerFunction.CommonStaticDM;
import seleniumQTP_Page_Actions.RegisterOne_Page_Action;

public class RegisterOne_Page_Test extends BaseClass{
	
		@Test
		public void registrationPageOne() throws IOException{
			try {
				RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver,reporterLogger);
				regOnePA.enterDataPageOne(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"), 
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "confPassword"));
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed.");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage().substring(1, 50));
			}
		}
		
		@Test
		public void registrationPage2() throws IOException{
			RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver,reporterLogger);
			regOnePA.enterDataPageOne(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),
	 				PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"), 
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "confpassword"));
		}
	}


