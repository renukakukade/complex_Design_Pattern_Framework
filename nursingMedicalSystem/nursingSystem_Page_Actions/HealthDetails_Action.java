package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebDropDown;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import nursingSystem_Page_Locators.HealthDetails_Locator;

public class HealthDetails_Action {
	public WebDriver driver=null;
	public HealthDetails_Locator HealthDetails_LA = null;
	public ExtentTest reporterLogger =null;
	public HealthDetails_Action(WebDriver driver,ExtentTest reporterLogger) {
		this.driver=driver;
		this.reporterLogger = reporterLogger;
		HealthDetails_LA = new HealthDetails_Locator(driver);
	}
	public void clickhealthTab() {
		if(HealthDetails_LA.gethealthTab()!= null) {
			WebButton.buttonClick(HealthDetails_LA.gethealthTab());
			reporterLogger.log(LogStatus.PASS, "health tab clicked");
			}else {
				reporterLogger.log(LogStatus.FAIL, "health tab not clicked");
			}
			
		}
	
	public void enterWeight(String weight) {
		if(HealthDetails_LA.getweight()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getweight())) {
				WebTextBox.sendInput(HealthDetails_LA.getweight(), weight);
				reporterLogger.log(LogStatus.PASS, "weight entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "weight not entered");
			}
			
		}
	}
	public void enterheight(String height) {
		if(HealthDetails_LA.getweight()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getheight())) {
				WebTextBox.sendInput(HealthDetails_LA.getheight(), height);
				reporterLogger.log(LogStatus.PASS, "height entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "height not entered");
			}
			
		}
	}
	public void enterBP(String bp) {
		if(HealthDetails_LA.getBP()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getBP())) {
				WebTextBox.sendInput(HealthDetails_LA.getBP(), bp);
				reporterLogger.log(LogStatus.PASS, "BP entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "BP not entered");
			}
			
		}
	}
	public void enterpulse(String pulse) {
		if(HealthDetails_LA.getpulse()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getpulse())) {
				WebTextBox.sendInput(HealthDetails_LA.getpulse(), pulse);
				reporterLogger.log(LogStatus.PASS, "pulse rate entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "pulse rate not entered");
			}
			
			
		}
	}
	public void entergetSPO2(String SPO2) {
		if(HealthDetails_LA.getSPO2()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getSPO2())) {
				WebTextBox.sendInput(HealthDetails_LA.getSPO2(), SPO2);
				reporterLogger.log(LogStatus.PASS, "sp02  entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "spo2 not entered");
			}
			
			
		}
	}
	public void enterProvisionalDiagnosis(String diag) {
		if(HealthDetails_LA.getProvisionalDiagnosis()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getProvisionalDiagnosis())) {
				WebTextBox.sendInput(HealthDetails_LA.getProvisionalDiagnosis(), diag);
				reporterLogger.log(LogStatus.PASS, "provisional diagnosis field entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "provisional diagnosis field not entered");
			}
		}
	}
	public void enterinsuranceCompany(String insCom) {
		if(HealthDetails_LA.getinsuranceCompany()!= null) {
			//HealthDetails_LA.getinsuranceCompany().clear();
			WebDropDown.dropDown(HealthDetails_LA.getinsuranceCompany(), insCom);
			reporterLogger.log(LogStatus.PASS, "insurance company field entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "insurance company field not entered");
			}
			
			
		}

	public void enterTPA(String tpa) {
		if(HealthDetails_LA.getTPA()!= null) {
			//HealthDetails_LA.getTPA().clear();
			WebDropDown.dropDown(HealthDetails_LA.getTPA(), tpa);
			reporterLogger.log(LogStatus.PASS, "tpa  field entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "tpa  field not entered");
			}
			
			
		}
	
	public void enterclaimNo(String claimNo) {
		if(HealthDetails_LA.getclaimNo()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getclaimNo())) {
				WebTextBox.sendInput(HealthDetails_LA.getclaimNo(), claimNo);
				reporterLogger.log(LogStatus.PASS, "claim no. entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "claim no. not entered");
			}
			
		}
	}
	public void enterPolicyNo(String PolicyNo) {
		if(HealthDetails_LA.getPolicyNo()!= null) {
			if(WebElementCommon.isClickable(HealthDetails_LA.getPolicyNo())) {
				WebTextBox.sendInput(HealthDetails_LA.getPolicyNo(), PolicyNo);
				reporterLogger.log(LogStatus.PASS, "policy no entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "policy no not entered");
			}
			
			
		}
	}
	public void clickNextBtnHealth() {
		if(HealthDetails_LA.getbtnHealthNext()!= null) {
			WebButton.buttonClick(HealthDetails_LA.getbtnHealthNext());
			reporterLogger.log(LogStatus.PASS, "next btn clicked");
		}else {
			reporterLogger.log(LogStatus.FAIL, "next btn not clicked");
		}
		
	}
	public void clickaddpatientbtn() {
		if(HealthDetails_LA.getaddpatientbtn()!= null) {
			WebButton.buttonClick(HealthDetails_LA.getaddpatientbtn());
			reporterLogger.log(LogStatus.PASS, "next btn clicked");
		}else {
			reporterLogger.log(LogStatus.FAIL, "next btn not clicked");
		}
	}
	public void clickclearallbtn() {
		if(HealthDetails_LA.getclearallbtn()!= null) {
			WebButton.buttonClick(HealthDetails_LA.getclearallbtn());
			reporterLogger.log(LogStatus.PASS, "clear all btn clicked");
		}else {
			reporterLogger.log(LogStatus.FAIL, "clear all btn not clicked");
		}
	}
}
