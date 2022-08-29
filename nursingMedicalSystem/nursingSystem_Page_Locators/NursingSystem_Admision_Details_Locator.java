package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NursingSystem_Admision_Details_Locator {
	
	public WebDriver driver = null;
	public NursingSystem_Admision_Details_Locator(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements( driver , this);

	}
	/*
	@FindBy(linkText = "Patient Management")
	private WebElement PatientManagement;
	
	public WebElement getPatientManagement() {
		return PatientManagement;
	}
	
	
	@FindBy(xpath ="//a[@href='/Patient/Create']")
	private WebElement inPatientRegistration;
	
	public WebElement getinPatientRegistration() {
		return inPatientRegistration;
	}
	
	@FindBy(xpath ="//a[@href='#admission']")
	private WebElement admissionDetails;
	
	public WebElement getadmissionDetails() {
		return admissionDetails;
	}
	*/
	@FindBy(name = "AdmissionDate")
	private WebElement admisiondate;
	
	public WebElement getadmisiondate() {
		return admisiondate;
	}
	
	@FindBy(id = "AdmissionTime")
	private WebElement admisiontime;
	
	public WebElement getadmisiontime() {
		return admisiontime;
	}
	
	
	@FindBy (xpath = "//input[@id='ReferredBy']")
	private WebElement refby;
	
	public WebElement getrefby() {
		return refby;
		
	}
	
	
	@FindBy (xpath = "//select[@id='DoctorID']")
	private WebElement underDoctor;
	
	public WebElement getunderDoctor() {
		return underDoctor;
	}
	
	
	@FindBy(id = "Case")
	private WebElement Case;
	
	public WebElement getCase() {
		return Case;
	}
	
	@FindBy(id = "FIR")
	private WebElement firNo;
	
	public WebElement getfirNo() {
		return firNo;
	}
	
	@FindBy(xpath="//select[@id='RoomID']")
	//@FindBy(id ="RoomID")
	private WebElement roomSelect;
	
	public WebElement getroomSelect() {
		return roomSelect;
	}
	
	@FindBy(id = "BedID")
	private WebElement selectBed;
	
	public WebElement getselectBed() {
		return selectBed;
	}
	
	@FindBy(id = "SaveBtn")
	private WebElement addPatientBtn;
	
	public WebElement getaddPatientBtn() {
		return addPatientBtn;
	}
	

}// End Class
