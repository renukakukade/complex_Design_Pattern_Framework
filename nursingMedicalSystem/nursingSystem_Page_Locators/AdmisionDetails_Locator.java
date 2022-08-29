package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmisionDetails_Locator {
	
	public WebDriver driver = null;
	public AdmisionDetails_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
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
	
	
	@FindBy(id = "Name")
	private WebElement name;
	
	public WebElement getname() {
		return name;
	}
	
	@FindBy(name="Age")
	private WebElement Age;
	public WebElement getAge() {
		return Age;
	}
	
	@FindBy(id="Nationality")
	private WebElement Nationality;
	public WebElement getNationality() {
		return Nationality;
	}
	
	@FindBy(id="Guardian")
	private WebElement Guardian;
	public WebElement getGuardian() {
		return Guardian;
	}
	@FindBy (id= "GuardianRelation")
	private WebElement GuardianRelation;
	public WebElement getGuardianRelation() {
		return GuardianRelation;
	}
	
	@FindBy (xpath= ("//select[@id='MaritalStatus']"))
	private WebElement maritalStatus;
	public WebElement getmaritalStatus() {
		return maritalStatus;
	}
	
	@FindBy(id="Gender")
	//@FindBy(xpath= "//option[@value= 'Female']")
	private WebElement Gender;
	public WebElement getGender() {
		return Gender;
	}
	@FindBy(name="DOB")
	private WebElement dateOfBirth;
	public WebElement getdateOfBirth() {
		return dateOfBirth;
	}
	@FindBy(xpath ="//select[@id='Religion']")
	private WebElement religion;
	public WebElement getreligion() {
		return religion;
	}
	@FindBy(id ="btnPersonalNext")
	private WebElement nxtbtn;
	public WebElement getnxtbtn() {
		return nxtbtn;
	}
	
	
	
}  // class end
