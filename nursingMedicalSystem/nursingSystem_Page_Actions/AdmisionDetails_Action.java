package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebDropDown;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import nursingSystem_Page_Locators.AdmisionDetails_Locator;

public class AdmisionDetails_Action {
	
	public WebDriver driver = null;
	ExtentTest reporterLogger = null;
	AdmisionDetails_Locator admisionDetailsLA = null;
	public AdmisionDetails_Action(WebDriver driver, ExtentTest reporterLogger) {
		this.driver = driver;
		this.reporterLogger =  reporterLogger;
		admisionDetailsLA = new AdmisionDetails_Locator(driver);
		
	}
	
	public void clickPatientManagement() {
		if (admisionDetailsLA.getPatientManagement() != null) {
			WebButton.buttonClick(admisionDetailsLA.getPatientManagement());
			reporterLogger.log(LogStatus.PASS, "patient managment clicked succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "patient managment not clicked");
			}
		}
	
	public void clickInPatientRegistration() {
		if(admisionDetailsLA.getinPatientRegistration()!=null) {
			WebButton.buttonClick(admisionDetailsLA.getinPatientRegistration());
			reporterLogger.log(LogStatus.PASS, "in patient registration clicked succesfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "in patient registration not clicked");
		}
	}
	
	public void clickAdmisionDetails() {
		if(admisionDetailsLA.getadmissionDetails()!=null) {
			WebButton.buttonClick(admisionDetailsLA.getadmissionDetails());
			reporterLogger.log(LogStatus.PASS, "Admision Details clicked succesfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Admision Details not clicked");
		}
	}
	public void entername(String name){
		if(admisionDetailsLA.getname()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getname())) {
				WebTextBox.sendInput(admisionDetailsLA.getname(), name);
				reporterLogger.log(LogStatus.PASS,"name entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "name not entered");
			}
		}
	}
	public void enterAge(String age){
		if(admisionDetailsLA.getAge()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getAge())) {
				WebTextBox.sendInput(admisionDetailsLA.getAge(), age);
				reporterLogger.log(LogStatus.PASS,"age entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "age not entered");
			}
		}
	}
	public void enterdateOfBirth(String Date) {
		if(admisionDetailsLA.getdateOfBirth()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getdateOfBirth())) {
				WebTextBox.sendInput(admisionDetailsLA.getdateOfBirth(), Date);
				reporterLogger.log(LogStatus.PASS, "date of birth entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "date of birth not entered");
			}
		}
	}

	/*public void selectGender() {
		if(admisionDetailsLA.getGender()!= null) {
				WebButton.buttonClick(admisionDetailsLA.getGender());
				reporterLogger.log(LogStatus.PASS, "gender selected succesfully");
			
		} else {
			reporterLogger.log(LogStatus.FAIL, "gender not selected");
		}
	}*/
	
		public void selectGenderOption(String value) {
			if(admisionDetailsLA.getGender()!=null) {
				WebDropDown.dropDown(admisionDetailsLA.getGender(), value);
				reporterLogger.log(LogStatus.PASS, "Gender Value Selected Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Gender Value not Selected");
			}
		}

		
		
		public void selectreligion(String religion) {
			if(admisionDetailsLA.getreligion()!= null) {
				WebDropDown.dropDown(admisionDetailsLA.getreligion(), religion);
				reporterLogger.log(LogStatus.PASS, "religion selected succesfully");
				
			} else {
				reporterLogger.log(LogStatus.FAIL, "religion not selected");
			}
		}


	
	public void enterNationality(String nationality){
		if(admisionDetailsLA.getNationality()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getNationality())) {
				WebTextBox.sendInput(admisionDetailsLA.getNationality(), nationality);
				reporterLogger.log(LogStatus.PASS,"nationality entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "nationality not entered");
			}
			
		}
		
	}
	
	public void enterGuardian(String gardian){
		if(admisionDetailsLA.getGuardian()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getGuardian())) {
				WebTextBox.sendInput(admisionDetailsLA.getGuardian(), gardian);
				reporterLogger.log(LogStatus.PASS,"gardian entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "gardian not entered");
			}
			
		}
		
	}
	
	public void enterGuardianRelation(String gardianRelation){
		if(admisionDetailsLA.getGuardianRelation()!= null) {
			if(WebElementCommon.isClickable(admisionDetailsLA.getGuardianRelation())) {
				WebTextBox.sendInput(admisionDetailsLA.getGuardianRelation(), gardianRelation);
				reporterLogger.log(LogStatus.PASS,"gardianRelation entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "gardianRelation not entered");
			}
			
		}
		
	}
	public void selectgetmaritalStatus(String maritalstatus){
		if(admisionDetailsLA.getmaritalStatus()!= null) {
			WebDropDown.dropDown(admisionDetailsLA.getmaritalStatus(), maritalstatus);
			reporterLogger.log(LogStatus.PASS,"maritalStatus entered succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "maritalStatus not entered");
			}
			
		}
	public void clicknxtbtn(){
		if(admisionDetailsLA.getnxtbtn()!= null) {
			WebButton.buttonClick(admisionDetailsLA.getnxtbtn());
			reporterLogger.log(LogStatus.PASS,"next button clicked succesfully" );
			}else {
				reporterLogger.log(LogStatus.FAIL, "next button not clicked");
			}
			
		}
	
	
		
	}
	
