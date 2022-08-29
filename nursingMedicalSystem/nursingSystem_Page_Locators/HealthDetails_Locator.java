package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthDetails_Locator {
	
	public WebDriver driver = null;
	public HealthDetails_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="healthTab")
	private WebElement healthTab;
	public WebElement gethealthTab() {
		return healthTab;
	}
	
	@FindBy(id="Weight")
	private WebElement weight;
	public WebElement getweight() {
		return weight;
	}
	//@FindBy(xpath="//label[@for='Height']")
	@FindBy(id="Height")
	private WebElement height;
	public WebElement getheight() {
		return height;
	}
	@FindBy(id="BP")
	private WebElement BP;
	public WebElement getBP() {
		return BP;
	}
	@FindBy(id="Pulse")
	private WebElement pulse;
	public WebElement getpulse() {
		return pulse;
	}
	@FindBy(id="SPO2")
	private WebElement SPO2;
	public WebElement getSPO2() {
		return SPO2;
	}
	@FindBy(id="ProvisionalDiagnosis")
	private WebElement ProvisionalDiagnosis;
	public WebElement getProvisionalDiagnosis() {
		return ProvisionalDiagnosis;
	}
	
	@FindBy(xpath="//select[@name='InsurenceCompanyID']")
	private WebElement insuranceCompany;
	public WebElement getinsuranceCompany() {
		return insuranceCompany;
	}
	@FindBy(xpath="//select[@id='HealthCardId']")
	private WebElement TPA;
	public WebElement getTPA() {
		return TPA;
	}
	
	@FindBy(id="HealthCardNo")
	private WebElement claimNo;
	public WebElement getclaimNo() {
		return claimNo;
	}
	@FindBy(id="PolicyNo")
	private WebElement PolicyNo;
	public WebElement getPolicyNo() {
		return PolicyNo;
	}
	@FindBy(id="btnHealthNext")
	private WebElement btnHealthNext;
	public WebElement getbtnHealthNext() {
		return btnHealthNext;
	}
	@FindBy(id="SaveBtn")
	private WebElement addpatientbtn;
	public WebElement getaddpatientbtn() {
		return addpatientbtn;
	}
	@FindBy(linkText="Clear All")
	private WebElement clearallbtn;
	public WebElement getclearallbtn() {
		return clearallbtn;
	}
}
