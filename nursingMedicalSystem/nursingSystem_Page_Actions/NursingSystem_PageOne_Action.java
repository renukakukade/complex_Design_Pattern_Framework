package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import nursingSystem_Page_Locators.NursingSystem_PageOne_Locator;

public class NursingSystem_PageOne_Action {
	
	public WebDriver driver = null;                          //7 line of constructor
	public ExtentTest reporterLogger = null;
	NursingSystem_PageOne_Locator nursingPL = null;
	public NursingSystem_PageOne_Action(WebDriver driver,ExtentTest logger) {
		this.driver = driver;
		this.reporterLogger = logger;
		nursingPL = new NursingSystem_PageOne_Locator(driver);     //constructor
		
	}
	
	public void enterUserName (String user) {
		
		if(nursingPL.getUserName()!= null) {
			if(WebElementCommon.isClickable(nursingPL.getUserName())) {
				WebTextBox.sendInput(nursingPL.getUserName(), user);
				reporterLogger.log(LogStatus.PASS , "username entered succesfully");
				
			}else{
				reporterLogger.log(LogStatus.FAIL, "username not entered");
			}
		}
	}
	
	public void enterPassword(String password) {
		if(nursingPL.getPassword()!= null){
			if(WebElementCommon.isClickable(nursingPL.getPassword())) {
				WebTextBox.sendInput(nursingPL.getPassword(), password);    //key=password
				reporterLogger.log(LogStatus.PASS, "Password entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Password not entered");
			}
		}
	}
	
	public void clickLoginBtn() {
		
		if((nursingPL.getloginbtn()!= null)){
			WebButton.buttonClick(nursingPL.getloginbtn());
			reporterLogger.log(LogStatus.PASS, "login button clicked succesfully");
			
		}else {
			reporterLogger.log(LogStatus.ERROR, "login button not clicked");
		}
		
		
		
		
	}
	
	public void enterDataPageOne(String user, String password) {
		enterUserName(user);
		enterPassword(password);
		clickLoginBtn();
	}
	


}
