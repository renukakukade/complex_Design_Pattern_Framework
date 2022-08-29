package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebDropDown;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import nursingSystem_Page_Locators.NursingSystem_Admision_Details_Locator;

public class PersonalDetails_Page_Action {
	
	public WebDriver driver = null;
	public ExtentTest reporterLogger = null;
	
	NursingSystem_Admision_Details_Locator admisionDL = null;
	
	public PersonalDetails_Page_Action(WebDriver driver,ExtentTest reporterlogger){
		admisionDL = new NursingSystem_Admision_Details_Locator(driver);

		this.driver = driver;
		this.reporterLogger = reporterlogger;   // assign for line no 21
	}
	
	/*public void clickPatientManagement() {
		if (admisionDL.getPatientManagement() != null) {
			WebButton.buttonClick(admisionDL.getPatientManagement());
			reporterLogger.log(LogStatus.PASS, "patient managment clicked succesfully");
				
			}else {
				reporterLogger.log(LogStatus.FAIL, "patient managment not clicked");
				
				
			}
		}
	
	
	
	public void clickInPatientRegistration() {
		if(admisionDL.getinPatientRegistration()!=null) {
			WebButton.buttonClick(admisionDL.getinPatientRegistration());
			reporterLogger.log(LogStatus.PASS, "in patient registration clicked succesfully");
			
		}else {
			reporterLogger.log(LogStatus.FAIL, "in patient registration not clicked");
		}
		
		
	}
	
	public void clickAdmisionDetails() {
		if(admisionDL.getadmissionDetails()!=null) {
			WebButton.buttonClick(admisionDL.getadmissionDetails());
			reporterLogger.log(LogStatus.PASS, "Admision Details clicked succesfully");
			
		}else {
			reporterLogger.log(LogStatus.FAIL, "Admision Details not clicked");
		}
		
		
	}
	
	*/
	public void enterAdmisionDate(String date) {
		if(admisionDL.getadmisiondate()!= null) {
			admisionDL.getadmisiondate().clear();
			if(WebElementCommon.isClickable(admisionDL.getadmisiondate())) {
				WebTextBox.sendInput(admisionDL.getadmisiondate(),date);
			
				reporterLogger.log(LogStatus.PASS, "admission date entered successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "admission date not entered");
				}
		}
	}
	
	public void enterAdmisionTime(String time) {
		if(admisionDL.getadmisiontime()!= null) {
			admisionDL.getadmisiontime().clear();			
			if(WebElementCommon.isClickable(admisionDL.getadmisiontime())) {
				WebTextBox.sendInput(admisionDL.getadmisiontime(),time);
				reporterLogger.log(LogStatus.PASS, "admision time entered successfully");
				} else{
					reporterLogger.log(LogStatus.FAIL, "admission time not entered");
					}
			}
	}
	
	public void enterRefBy(String reffby) {
		if(admisionDL.getrefby()!= null) {
			if(WebElementCommon.isClickable(admisionDL.getrefby())) {
				WebTextBox.sendInput(admisionDL.getrefby(),reffby );
				reporterLogger.log(LogStatus.PASS, "ref by field entered successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "ref by field not entered");
			}
		}
	}
	
	public void enterUnderDoctor(String underdoctor) {
		if(admisionDL.getunderDoctor()!= null) {
			WebDropDown.dropDown(admisionDL.getunderDoctor(), underdoctor);
			reporterLogger.log(LogStatus.PASS, "under doctor field entered successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "under doctor field not entered");
				}
			
	}
	
	public void entergetCase(String getcase) {
		if(admisionDL.getCase()!= null) {
			if(WebElementCommon.isClickable(admisionDL.getCase())) {
				WebTextBox.sendInput(admisionDL.getCase(), getcase );
				reporterLogger.log(LogStatus.PASS, "getCase field entered successfully");
			} else{
				reporterLogger.log(LogStatus.FAIL, "getCase field not entered");
			}
		}
	}
	public void entergetfirNo(String getfirno) {
		if(admisionDL.getfirNo()!= null) {
			if(WebElementCommon.isClickable(admisionDL.getfirNo())) {
				WebTextBox.sendInput(admisionDL.getfirNo(), getfirno );
				reporterLogger.log(LogStatus.PASS, "getfirNo field entered successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "getfirNo field not entered");
			}
		}
	}
	
	public void entergetroomSelect(String getroomSelect) {
		if(admisionDL.getroomSelect()!= null) {
			WebDropDown.dropDown(admisionDL.getroomSelect(), getroomSelect);
			reporterLogger.log(LogStatus.PASS, "getroomSelect field entered successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "getroomSelect field not entered");
				}
		
	}

	
	public void entergetselectBed(String getselectBed) {
		if(admisionDL.getselectBed()!= null) {
			WebDropDown.dropDown(admisionDL.getselectBed(), getselectBed);
			reporterLogger.log(LogStatus.PASS, "selectBed field entered successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "selectBed field not entered");
				}
			
	}
	public void entergetaddPatientBtn() {
		if(admisionDL.getaddPatientBtn()!= null) {
			WebButton.buttonClick(admisionDL.getaddPatientBtn());
			reporterLogger.log(LogStatus.PASS, "add PatientBtn clicked  successfully");
			}else{
				reporterLogger.log(LogStatus.FAIL, "add PatientBtn not clicked ");
				}
	}
	

	
	
}// End Class
	
	


