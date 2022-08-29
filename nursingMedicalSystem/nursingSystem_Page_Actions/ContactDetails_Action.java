package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebElementCommon;
import commonFunctionWeb.WebTextBox;
import nursingSystem_Page_Locators.ContactDetails_Locator;

public class ContactDetails_Action {
	public WebDriver driver= null;
	public ExtentTest reporterLogger = null;
	public ContactDetails_Locator ContactDetails_LA = null;
	
	public ContactDetails_Action(WebDriver driver, ExtentTest reporterLogger) {
		this.driver=driver;
		this.reporterLogger = reporterLogger;  
		ContactDetails_LA = new ContactDetails_Locator(driver) ;
	}
	// contact 1
	public void entercontactNo(String contactno) {
		if (ContactDetails_LA.getcontactNo()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getcontactNo())) {
				WebTextBox.sendInput(ContactDetails_LA.getcontactNo(), contactno);
				reporterLogger.log(LogStatus.PASS, "Contact no entered");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Contact no not entered");
			}
		}
	}
	
	
	
	public void enterAltContact(String altContactNo) {
		if (ContactDetails_LA.getAltContact()!= null) {
			if(WebElementCommon.isClickable(ContactDetails_LA.getAltContact())) {
				WebTextBox.sendInput(ContactDetails_LA.getAltContact(), altContactNo);
				reporterLogger.log(LogStatus.PASS, "AltContactno entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "AltContactno not entered");
			
			}
			
		}
	}
	public void enterAddress(String address) {
		if(ContactDetails_LA.getAddress()!= null) {
			if(WebElementCommon.isClickable(ContactDetails_LA.getAddress())) {
				WebTextBox.sendInput(ContactDetails_LA.getAddress(), address);
				reporterLogger.log(LogStatus.PASS, "address entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "address not entered");
			}
		}
	}
	public void enterDistrict(String district) {
		if(ContactDetails_LA.getDistrict()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getDistrict())){
				WebTextBox.sendInput(ContactDetails_LA.getDistrict(),district);
				reporterLogger.log(LogStatus.PASS, "district entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "district not entered");
			}
		}
	}
	public void enterpinCode(String pin) {
		if(ContactDetails_LA.getPincode()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getPincode())){
				WebTextBox.sendInput(ContactDetails_LA.getPincode(),pin);
				reporterLogger.log(LogStatus.PASS, "pincode entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "pincode not entered");
			}
		}
	}
	public void enterPoliceStation(String PoliceStation) {
		if(ContactDetails_LA.getPoliceStation()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getPoliceStation())){
				WebTextBox.sendInput(ContactDetails_LA.getPoliceStation(),PoliceStation);
				reporterLogger.log(LogStatus.PASS, "PoliceStation entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "PoliceStation not entered");
			}
		}
	}
	public void enterpostoffice(String postOffice) {
		if(ContactDetails_LA.getpostoffice()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getpostoffice())){
				WebTextBox.sendInput(ContactDetails_LA.getpostoffice(),postOffice);
				reporterLogger.log(LogStatus.PASS, "postoffice entered succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "postoffice not entered");
			}
		}
	}
	public void clickbtnContactNext() {
		if(ContactDetails_LA.getbtnContactNext()!= null) {
			WebButton.buttonClick(ContactDetails_LA.getbtnContactNext());
			reporterLogger.log(LogStatus.PASS, "Next btn clicked");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Next btn not clicked");
			}
		}
	public void enteradpatientbtn() {
		if (ContactDetails_LA.getadpatientbtn()!= null) {
			if (WebElementCommon.isClickable(ContactDetails_LA.getcontactNo())) {
				WebButton.buttonClick(ContactDetails_LA.getadpatientbtn());
				
				reporterLogger.log(LogStatus.PASS, "add patient btn clicked succesfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "add patient btn not clicked");
			}
		}
	}
	public void contactDetailsCommonMethod (String contactno,String altContactNo , String address , String district , String pin ,
			                                     String PoliceStation , String postOffice) {
		entercontactNo(contactno);
		enterAltContact(altContactNo);
		enterAddress(address);
		enterDistrict(district);
		enterpinCode(pin);
		enterPoliceStation(PoliceStation);
		enterpostoffice(postOffice);
		clickbtnContactNext();
	}
}



