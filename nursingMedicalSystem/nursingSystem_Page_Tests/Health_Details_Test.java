package nursingSystem_Page_Tests;
import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunction.BaseClass;
import initializerFunction.CommonStaticDM;
import nursingSystem_Page_Actions.AdmisionDetails_Action;
import nursingSystem_Page_Actions.HealthDetails_Action;
import nursingSystem_Page_Actions.NursingSystem_PageOne_Action;
public class Health_Details_Test extends BaseClass{
	@Test(priority=1 , description= " User should enter Weight in integer / Whole number")
	public void TC10() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC10 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
	@Test(priority=2 , description= "User should not enter zero and negative number in Weight Field")
	public void TC11() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT1"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC11 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=3 , description= "User should also enter decimal  number in Weight Field")
	public void TC12() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT2"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC12 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=4 , description= "Weight should be in KG(Killo Gram)")
	public void TC13() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT3"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC13 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=5 , description= "Weight field should not accept alphabates, White Space and special characters except . ")
	public void TC14() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT4"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC14 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=6 , description= "Verify, if user do not enter Weight then also form should get submitted")
	public void TC15() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			//Thread.sleep(2000);
			//HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC15 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}	
	@Test(priority=7 , description= "Verify, User should enter Height in integer / Whole number")
	public void TC16() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC16 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=8 , description= "Verify, User should not enter zero and negative number in Height Field")
	public void TC17() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT1"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC17 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}	
	@Test(priority=9 , description= "Verify, User should not enter decimal number in Height Field")
	public void TC18() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT2"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC18 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=10 , description= "Height should be in Centimeter")
	public void TC19() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT3"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC19 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=11 , description= "Height field should not accept alphabates and special characters")
	public void TC20() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT4"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC20 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=12 , description= "Verify, if user do not enter Height then also form should get submitted")
	public void TC21() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			//Thread.sleep(2000);			
			//HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=13 , description= "Verify, User should enter Blood Pressure in integer / Whole number")
	public void TC22() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC22 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=14 , description= "Verify, User should not enter zero and negative number in Blood Pressure Field")
	public void TC23() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP1"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC23 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=15 , description= "Verify, User should not enter decimal  number in Blood Pressure Field")
	public void TC24() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP2"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC24 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=16 , description= "Blood Pressure field should not accept alphabates")
	public void TC25() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP3"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC25 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=17 , description= "Verify, if user do not enter Blood Pressure then also form should get submitted")
	public void TC26() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			//HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC26 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=18 , description= " Verify, User should enter Pulse Rate in integer / Whole number")
	public void TC27() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC27 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=19 , description= " Verify, User should not enter zero and negative number in Pulse Rate Field")
	public void TC28() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE1"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC28 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=20 , description= " Verify, User should not enter decimal  number in Pulse Rate Field")
	public void TC29() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE2"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC29 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=21 , description= "Pulse Rate field should not accept alphabates and special characters")
	public void TC30() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE3"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC30 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=22 , description= "Verify, if user do not enter Pulse Rate then also form should get submitted")
	public void TC31() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			//HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE4"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC31 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=23 , description= "Verify, User should enter spO2 in integer / Whole number")
	public void TC32() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC32 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=23 , description= "Verify, User should not enter zero and negative number in spO2 Field")
	public void TC33() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO21"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC33 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=24 , description= "Verify, User should not enter decimal number in spO2 Field")
	public void TC34() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO22"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC34 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=25 , description= "spO2 field should not accept alphabates ")
	public void TC35() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO23"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC35 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=26 , description= "spO2 value should be <=100%")
	public void TC36() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO24"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC36 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=27 , description= "verify, spO2 should be in % percentage")
	public void TC37() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO25"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC37 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=28 , description= "Verify, if user do not enter spO2 then also form should get submitted")
	public void TC38() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			//HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC38 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=29 , description= "Verify, if user do not enter Provisional Diagnosis then also form should get submitted")
	public void TC39() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			//HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS1"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC39 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=30 , description= "Verify, User should select only one insurance company")
	public void TC40() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC40 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=30 , description= "Verify, User can search insurance company name  and Select")
	public void TC41() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY1"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC41 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=31 , description= "Verify, if user do not select insurance company then also form should get submitted")
	public void TC42() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			//Thread.sleep(5000);
			//HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC42 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=32 , description= "Verify, User should enter only one TPA")
	public void TC43() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC43 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=33 , description= "Verify, User can search TPA and Select")
	public void TC44() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA1"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC44 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=34 , description= "Verify, if user do not select TPA then also form should get submitted")
	public void TC45() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			//Thread.sleep(5000);
			//HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC45 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=35 , description= "Verify, User should enter claim No.")
	public void TC46() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC46 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=36 , description= "Verify, User should enter Policy No.")
	public void TC47() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC47 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=37 , description= "Verify, if user clicked on  \"Add Patient\" Button  then data should be submitted in to DB ")
	public void TC48() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickaddpatientbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC48 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}@Test(priority=38 , description= "Verify, if user clicked on Clear All  Button then all fields should get clear")
	public void TC50() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickclearallbtn();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC50 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=39 , description= "Verify, if user clicked on  Next Button then it should navigate to Admission Details form ")
	public void TC52() throws IOException {
		
		try {  
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			HealthDA.clickhealthTab();
			Thread.sleep(2000);
			HealthDA.enterWeight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "WEIGHT"));
			Thread.sleep(2000);			
			HealthDA.enterheight(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "HEIGHT"));
			HealthDA.enterBP(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "BP"));
			HealthDA.enterpulse(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PULSE"));
			HealthDA.entergetSPO2(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "SPO2"));
			HealthDA.enterProvisionalDiagnosis(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DIAGNOSIS"));
			Thread.sleep(5000);
			HealthDA.enterinsuranceCompany(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "INSURANCECOMPANY"));
			Thread.sleep(5000);
			HealthDA.enterTPA(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "TPA"));
			Thread.sleep(5000);
			HealthDA.enterclaimNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CLAIMNO"));
			HealthDA.enterPolicyNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICYNO"));
			HealthDA.clickNextBtnHealth();
			
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC52 passed");
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
}
