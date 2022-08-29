package nursingSystem_Page_Tests;

import java.io.IOException;
//import java.util.Properties;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunction.BaseClass;
import initializerFunction.CommonStaticDM;
import nursingSystem_Page_Actions.AdmisionDetails_Action;
import nursingSystem_Page_Actions.ContactDetails_Action;
import nursingSystem_Page_Actions.HealthDetails_Action;
import nursingSystem_Page_Actions.PersonalDetails_Page_Action;
//import nursingSystem_Page_Actions.ContactDetails_Action;
//import nursingSystem_Page_Actions.HealthDetails_Action;
//import nursingSystem_Page_Actions.NursingSystem_Admision_Details_Action;
import nursingSystem_Page_Actions.NursingSystem_PageOne_Action;

public class NursingSystem_PageOne_Test extends BaseClass{
	/*@Test(priority=1 , description= "user should enter patient name, allowing characters only")
	public void TC1() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC1 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=2 , description= "user should enter patient name, numbers  are not allowed")
	public void TC2() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME1"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC2 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=3 , description= "user should enter patient name, special characters are not allowed except space")
	public void TC3() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME2"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC3 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=4 , description= "user should enter patient Age,only numbers are allowed")
	public void TC4() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC4 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=5 , description= "user should enter patient Age, characters are not allowed")
	public void TC5() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE1"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC5 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=6 , description= "user should enter patient Age, no special characters are allowed")
	public void TC6() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE2"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC6 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	//USER IS ABLE TO ADD DATE OF BIRTH OF PATIENT
	
	@Test(priority=7 , description= "user should enter patient DOB, numbers are allowed")
	public void TC7() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC7 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=8 , description= "user should enter patient DOB, characters are not allowed")
	public void TC8() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB1"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC8 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=9 , description= "user should enter patient DOB, Special characters are not allowed Except / ")
	public void TC9() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB2"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC9 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=10 , description= "user should enter patient DOB, date format should be DD/MM/YYYY")
	public void TC10() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB3"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC10 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=11 , description= "user should enter patient DOB, Past Dates should be allowed")
	public void TC11() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB4"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC11 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=12 , description= "user should enter patient Age, Future Dates should not allowed")
	public void TC12() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB5"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC12 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=13 , description= "user should enter patient Age, User should be able to select date from calender")
	public void TC13() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB6"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC13 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=24 , description= "user should select patient Gender , User should be able to select gender from dropdown")
	public void TC24() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC24 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=25 , description= "user should select patient Gender , User should be able to select only one gender from dropdown")
	public void TC25() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER1"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC25 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=26 , description= "user should select patient Gender , verify the field is mandatory")
	public void TC26() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER2"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC26 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	//user is able to select religion
	@Test(priority=27 , description= "user should select patient Gender , User should be able to select religion from dropdown")
	public void TC27() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC27 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=28 , description= "user should enter nationality ")
	public void TC28() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC29 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=30 , description= "user should enter nationality ")
	public void TC30() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC30 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	//user is able to add gardian
	@Test(priority=31 , description= "user is able to enter gardian ")
	public void TC31() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC31 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=32 , description= "user is able to add gardian, numbers are not allowed ")
	public void TC32() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN1"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC32 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	//user is able to add relation with gardian
	@Test(priority=33 , description= "user is able to add relation with gardian")
	public void TC33() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC33 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}	
	@Test(priority=34 , description= "user is able to add relation with gardian, numbers are not allowed ")
	public void TC34() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN1"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC34 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	//user is able to select marrital status drom dropdown
	@Test(priority=35 , description= "user is able to select marital status drom dropdown, select it from given options only ")
	public void TC35() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN1"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC35 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=36 , description= "user is able to select marital status from dropdown")
	public void TC36() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN1"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS1"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC36 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=37 , description= "user is able to click on next button")
	public void TC37() throws IOException {
		
		try {
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY1"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN1"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS1"));
			
			admisionDA.clicknxtbtn();
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC37 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
	*/
	
	
	
	
	@Test
	public void loginPage() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			
			admisionDA.entername(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NAME"));
			admisionDA.enterAge(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AGE"));
			admisionDA.enterdateOfBirth(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DOB"));
			admisionDA.selectGenderOption(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GENDER"));
			//Thread.sleep(5000);
			admisionDA.selectreligion(
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "RELIGION"));
			
			admisionDA.enterNationality(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "NATIONALITY"));
			admisionDA.enterGuardian(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIAN"));
			admisionDA.enterGuardianRelation(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "GARDIANRELATION"));
			admisionDA.selectgetmaritalStatus(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "MARITALSTATUS"));
			//admisionDA.selectGender();
			//admisionDA.selectreligion();
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
			contactDA.clickbtnContactNext();
			
			//contactDA.contactDetailsCommonMethod(
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "CONTACTNO"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ALTCONTACTNO"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "ADDRESS"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "DISTRICT"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "PINCODE"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POLICESTATION"),
					//PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "POSTOFFICE"));
			
			
			
			
			
			HealthDetails_Action HealthDA = new HealthDetails_Action(driver,reporterLogger);
			
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
			
			
			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY"));
			//Thread.sleep(5000);			
			admissionDetailsPA.enterUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "underdoctor1"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "case"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "test passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}

	
	
		
}	




