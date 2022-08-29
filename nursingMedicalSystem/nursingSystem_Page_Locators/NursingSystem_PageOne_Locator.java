package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NursingSystem_PageOne_Locator {
	
	public WebDriver driver = null;                                  //constructor
	
	public NursingSystem_PageOne_Locator(WebDriver driver) {       //constructor
		
		this.driver = driver;                                     //constructor
		PageFactory.initElements(driver, this);                  //constructor
		
	}
	
	@FindBy(id = "Username")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id="Password")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath = "//input[@value = 'Login']")
	private WebElement loginbtn;
	
	public WebElement getloginbtn() {
		return loginbtn;
		
	}
	
	

}
