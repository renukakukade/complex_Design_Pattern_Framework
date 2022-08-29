package nursingSystem_Page_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunction.BaseClass;
import initializerFunction.CommonStaticDM;
import nursingSystem_Page_Actions.AdmisionDetails_Action;
import nursingSystem_Page_Actions.ContactDetails_Action;
import nursingSystem_Page_Actions.NursingSystem_PageOne_Action;

public class Contact_Test extends BaseClass{
	
	@Test(priority=1 , description= "user should enter contact no, allowing numbers  only")
	public void TC1() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			admisionDA.clicknxtbtn();
			ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
			Thread.sleep(2000);
			
			contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
			contactDA.enteradpatientbtn();
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC1 passed- 10 numbers accepted");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=2 , description= "user should enter contact no, user should not allow characters")
	public void TC2() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			admisionDA.clicknxtbtn();
			ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
			Thread.sleep(2000);
			
			contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO1"));
			contactDA.enteradpatientbtn();
			
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC2 passed- User should not allow alphabates ");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
	@Test(priority=3 , description= "user should not enter/accept contact no below 10")
	public void TC3() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			admisionDA.clicknxtbtn();
			ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
			Thread.sleep(2000);
			
			contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO2"));
			contactDA.enteradpatientbtn();
			
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC3- User should not allow below 10 numbers ");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=4 , description= "user should enter contact no, no special characters are allowed")
	public void TC4() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			admisionDA.clicknxtbtn();
			ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
			Thread.sleep(2000);
			
			contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO3"));
			Thread.sleep(2000);
			contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO2"));
			Thread.sleep(2000);
			contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

			contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
			contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
			contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
			contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
			contactDA.enteradpatientbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC4 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=5 , description= "the field is mandatory, the field should not be empty")
	public void TC5() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			admisionDA.clicknxtbtn();
			ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
			Thread.sleep(2000);
			
			contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO4"));
			contactDA.enteradpatientbtn();
			
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC5 passed - The field is mandatory ");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
		// TO VALIDATE THE ALT CONTACT NO FIELD
		@Test(priority=6 , description= "User is able to enter alt contact no,only numbers are allowed")
		public void TC6() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC6 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		@Test(priority=7 , description= "User is able to enter alt contact no,characters are not allowed")
		public void TC7() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO1"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC7 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		@Test(priority=8 , description= "User is able to enter alt contact no,Special characters are not allowed")
		public void TC8() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO2"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC8 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		
		@Test(priority=9 , description= "User is able to enter alt contact no,number should not be less than 10")
		public void TC9() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO3"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC9 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		//USER IS ABLE TO ENTER ADDRESS
		@Test(priority=10 , description= "User is able to enter address,characters are allowed")
		public void TC10() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC10 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		@Test(priority=11 , description= "User is able to enter address,numbers are allowed")
		public void TC11() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS1"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC11 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		@Test(priority=12 , description= "User is able to enter address,special characters are allowed")
		public void TC12() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS2"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC12 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		//user is able to enter district (TC starts from 13)
		@Test(priority=13 , description= "User is able to enter address, characters are allowed")
		public void TC13() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC13 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		
		@Test(priority=14 , description= "User is able to enter address,numbers are allowed")
		public void TC14() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT1"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC14 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		@Test(priority=15 , description= "User is able to enter address,special characters are allowed")
		public void TC15() throws IOException {
			
			try {  
				NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
				nurSysPA.enterDataPageOne(
						
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
				
				AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				
				admisionDA.clickPatientManagement();
				admisionDA.clickInPatientRegistration();
				//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
				admisionDA.clicknxtbtn();
				ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
				Thread.sleep(2000);
				
				contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
				Thread.sleep(2000);
				contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

				contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT2"));
				contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
				contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
				contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
				contactDA.enteradpatientbtn();
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC15 passed");
			}
			catch (Exception e ){
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
				
			}
		}
		//user is able to enter pincode
				@Test(priority=16 , description= "User is able to enter pin code, numbers are allowed")
				public void TC16() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC16 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				
				@Test(priority=17 , description= "User is able to enter pin code,characters are  not allowed")
				public void TC17() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS1"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE1"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC17 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				@Test(priority=18 , description= "User is able to enter address,special characters are not allowed")
				public void TC18() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE2"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC18 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				@Test(priority=19 , description= "User is able to enter pin code, pin code should be 6 in number, more than 6 and less than 6 nos are not allowed")
				public void TC19() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE3"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC19 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				//user is able to enter police station field
				@Test(priority=20 , description= "User is able to enter address, characters are allowed")
				public void TC20() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC20 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				
				@Test(priority=21 , description= "User is able to enter address,numbers are allowed")
				public void TC21() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION1"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				@Test(priority=22 , description= "User is able to enter address,special characters are allowed")
				public void TC22() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS2"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION2"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC22 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				//user is able to enter post office field
				@Test(priority=23 , description= "User is able to enter address, characters are allowed")
				public void TC23() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC23 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				
				@Test(priority=24 , description= "User is able to enter address,numbers are allowed")
				public void TC24() throws IOException {
					
					try {  
						NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
						nurSysPA.enterDataPageOne(
								
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
								PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
						
						AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						
						admisionDA.clickPatientManagement();
						admisionDA.clickInPatientRegistration();
						//AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
						admisionDA.clicknxtbtn();
						ContactDetails_Action contactDA = new ContactDetails_Action(driver, reporterLogger); 
						Thread.sleep(2000);
						
						contactDA.entercontactNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAltContact(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"));
						Thread.sleep(2000);
						contactDA.enterAddress(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"));

						contactDA.enterDistrict(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"));
						contactDA.enterpinCode(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"));
						contactDA.enterPoliceStation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION1"));
						contactDA.enterpostoffice(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE1"));
						contactDA.enteradpatientbtn();
						reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC24 passed");
					}
					catch (Exception e ){
						reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
						
					}
				}
				
}


