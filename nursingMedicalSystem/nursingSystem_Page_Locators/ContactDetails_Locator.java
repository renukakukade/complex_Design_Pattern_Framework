package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetails_Locator {
	
	public WebDriver driver= null;
	public ContactDetails_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(id = "Contact")
	@FindBy(xpath="//input[@id = 'Contact']")
	private WebElement contactNo;
	public WebElement getcontactNo() {
		return contactNo;
	}
	@FindBy(name="AltContact")
	private WebElement AltContact;
	public WebElement getAltContact() {
		return AltContact;
	}
	//@FindBy(xpath = "//label[@for='Address']")
	@FindBy(id="Address")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}
	@FindBy(id="District")
	private WebElement District;
	public WebElement getDistrict() {
		return District;
	}
	@FindBy(id="Pincode")
	private WebElement Pincode;
	public WebElement getPincode() {
		return Pincode;
	}
	@FindBy(name="PoliceStation")
	private WebElement PoliceStation;
	public WebElement getPoliceStation() {
		return PoliceStation;
	}
	@FindBy(id="PostOffice")
	private WebElement postoffice;
	public WebElement getpostoffice() {
		return postoffice;
	}
	@FindBy(id="btnContactNext")
	private WebElement btnContactNext;
	public WebElement getbtnContactNext() {
		return btnContactNext;
	}
	@FindBy(id="SaveBtn")
	private WebElement adpatientbtn;
	public WebElement getadpatientbtn() {
		return adpatientbtn;
	}

}
