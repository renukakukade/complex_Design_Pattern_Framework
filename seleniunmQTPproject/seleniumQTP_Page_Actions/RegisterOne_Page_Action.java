package seleniumQTP_Page_Actions;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import seleniumQTP_Page_Locators.RegisterOne_Page_Locator;
public class RegisterOne_Page_Action {
	
	
		public WebDriver driver = null;
		public ExtentTest reporterLogger = null;
		RegisterOne_Page_Locator regOnePL = null;
		
		public RegisterOne_Page_Action(WebDriver driver, ExtentTest logger){
			this.driver = driver;
			reporterLogger = logger;
			regOnePL = new RegisterOne_Page_Locator(driver);
		}
		
		public void enterUserName(String user){
			if(regOnePL.getUserName()!=null){
				if(WebElementCommon.isClickable(regOnePL.getUserName())){
					WebTextBox.sendInput(regOnePL.getUserName(), user);                               //user is string we defined/assigned
					reporterLogger.log(LogStatus.PASS, "User Name entered Succesfully.");
				}else{
					reporterLogger.log(LogStatus.FAIL, "User Name not entered.");
				}
			}
		}
		public void enterPassword(String pass){
			if(regOnePL.getPassword()!=null){
				if(WebElementCommon.isClickable(regOnePL.getPassword())){
					WebTextBox.sendInput(regOnePL.getPassword(), pass);
					reporterLogger.log(LogStatus.PASS, "Password entered Succesfully.");
				}else{
					reporterLogger.log(LogStatus.FAIL, "Password not entered.");
				}
			}
		}	
		public void enterConfirmPassword(String confpass){
			if(regOnePL.getConfirmPassword()!=null){
				if(WebElementCommon.isClickable(regOnePL.getConfirmPassword())){
					WebTextBox.sendInput(regOnePL.getConfirmPassword(), confpass);
					reporterLogger.log(LogStatus.PASS, "Confirm password entered Succesfully.");
				}else{
					reporterLogger.log(LogStatus.FAIL, "Confirm Password not entered.");
				}
			}
		}	
		public void clickLoginlink(){
			if(regOnePL.getLoginLink()!=null){
				WebButton.buttonClick(regOnePL.getLoginLink());
				reporterLogger.log(LogStatus.PASS, "Login Link clicked Succesfully.");
			}else{
				reporterLogger.log(LogStatus.FAIL, "Login link not clicked.");
			}
		}
		
		public void enterDataPageOne(String user, String pass, String confPass){
			enterUserName(user);
			enterPassword(pass);
			enterConfirmPassword(confPass);
			clickLoginlink();
		}
	}
	/*
	 * Action is a class which has implementation on all locators from locator file
	 */


