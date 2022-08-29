package nursingSystem_Page_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunction.BaseClass;
import initializerFunction.CommonStaticDM;
import nursingSystem_Page_Actions.AdmisionDetails_Action;
import nursingSystem_Page_Actions.NursingSystem_PageOne_Action;
import nursingSystem_Page_Actions.PersonalDetails_Page_Action;

public class Admision_Details_Test extends BaseClass{
	@Test(priority=1 , description= "verify user can add date in the format dd/mm/yyyy")
	public void TC11() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC11 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=2 , description= "verify user can not add character in date field")
	public void TC12() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD1"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC12 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=3 , description= "verify by default it should take current date")
	public void TC13() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD2"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC13 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=4 , description= "verify it should not take past dates ")
	public void TC14() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD3"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC14 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=5 , description= "verify it should  allow future dates ")
	public void TC15() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD4"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC15 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=6 , description= "verify if date field should not be blank")
	public void TC16() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD5"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC16 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=7 , description= "verify user can add time in the format HH:MM AM/PM")
	public void TC17() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC17 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=8 , description= "verify user can not add special characters except : in time field")
	public void TC18() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT1"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC18 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=9 , description= "verify user should add one white space IN BETWEEN HH:MM & AM/PM ")
	public void TC19() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT2"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC19 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=10 , description= "verify user can not enter zero or more than one white space")
	public void TC20() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT3"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC20 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=11 , description= "verify by default it should take current time")
	public void TC21() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT4"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
	@Test(priority=12 , description= "verify it should  allow future time")
	public void TC22() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT5"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC22 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=13 , description= "verify user should  not   allow past time")
	public void TC23() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT4"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC23 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=14 , description= "verify user should not keep this field as empty")
	public void TC24() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT6"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC24 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=15 , description= "verify user can add the name of the doctor who refered patient in Refered By field")
	public void TC25() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT4"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC25 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=16 , description= "verify user can not add numeric value or any special character except . ")
	public void TC26() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT4"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY1"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC26 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=17 , description= "Verify, if user do not added anything in referedby field then also form should get submitted")
	public void TC27() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			//admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY2"));
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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC27 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=18 , description= "Verify, User can search doctor name clicking random words  and Select")
	public void TC28() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC28 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=19 , description= "Verify, under doctor  field is mandatory")
	public void TC29() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY"));
			//Thread.sleep(5000);			
			admissionDetailsPA.enterUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "underdoctor11"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "case"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC29 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=20 , description= "verify, user can add case")
	public void TC230() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC230 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=21 , description= "verify Case field can be empty")
	public void TC31() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY"));
			//Thread.sleep(5000);			
			admissionDetailsPA.enterUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "underdoctor1"));
			//Thread.sleep(5000);
			//admissionDetailsPA.entergetCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "case"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC31 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=22 , description= "verify if user can add any alphanumeric  characters")
	public void TC32() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY"));
			//Thread.sleep(5000);			
			admissionDetailsPA.enterUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "underdoctor1"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "case1"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC32 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=23 , description= "verify if user can  add any special characters")
	public void TC33() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

			PersonalDetails_Page_Action admissionDetailsPA = new PersonalDetails_Page_Action(driver, reporterLogger);
			
			
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dateD"));
			Thread.sleep(5000);
			admissionDetailsPA.enterAdmisionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "timeT"));
			admissionDetailsPA.enterRefBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "REFBY"));
			//Thread.sleep(5000);			
			admissionDetailsPA.enterUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "underdoctor1"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "case2"));
			//Thread.sleep(5000);
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC33 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=24 , description= "Verify  user can add FIR. No in this field")
	public void TC234() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=25 , description= "fir field ,verify if user can add alphabet, number")
	public void TC35() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno1"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=26 , description= "verify  FIR NO. field can be empty")
	public void TC36() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			//admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC21 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=27 , description= "verify user can add any special character in FIR No field")
	public void TC37() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno2"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC37 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=28 , description= "verify if user can select Room")
	public void TC38() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC38 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
	@Test(priority=29 , description= "Verify, User can search doctor room clicking random words  and Select")
	public void TC39() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC39 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=30 , description= "Verify, Room field is Mandatory")
	public void TC40() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room1"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC40 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=31 , description= "verify, User can select only one name from the dropdown")
	public void TC41() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC41 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=32 , description= "verify if user can select Bed required")
	public void TC42() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetfirNo(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "firno2"));
			admissionDetailsPA.entergetroomSelect(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC42 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=33 , description= "Verify, if user do not added/selected anything from bed dropdown ")
	public void TC43() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed1"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC43 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	@Test(priority=34 , description= "Verify, Bed field is Mandatory")
	public void TC44() throws IOException {
		try {
			
			NursingSystem_PageOne_Action nurSysPA =  new NursingSystem_PageOne_Action(driver, reporterLogger);
			
			nurSysPA.enterDataPageOne(
					
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),                     //username is key in  properties file
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
			
			
			
			
			AdmisionDetails_Action admisionDA = new AdmisionDetails_Action(driver , reporterLogger);
			
			admisionDA.clickPatientManagement();
			admisionDA.clickInPatientRegistration();
			admisionDA.clickAdmisionDetails();

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
			admissionDetailsPA.entergetselectBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed1"));
			admissionDetailsPA.entergetaddPatientBtn();
			//System.out.println(REFBY);
			
			reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver)) + "TC37 passed");
			
		}
		catch (Exception e ){
			reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver)) + e.getMessage());
			
		}
	}
	
}
