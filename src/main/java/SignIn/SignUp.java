package SignIn;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import mySel.Baseclass;

public class SignUp{
	
	public WebDriver driver;
	
	    @FindBy(xpath="//a[@class=\"login\"]")
	     WebElement login;
	    
	    public SignUp(WebDriver driver2) { 
			  this.driver=driver2;
			  PageFactory.initElements(driver, this);
			  }
		 

	public WebElement getLogin() {
			return login;
		}
	
	/*
	 * public void setLogin(WebElement login) { this.login = login; }
	 */

		/*
	 * @FindBy(how=How.ID,using="email_create") WebElement emailId;
	 * 
	 * @FindBy(id="SubmitCreate") WebElement Submit_button;
	 * 
	 * 
	 * @FindBy(how=How.XPATH,using=("(//input[@name='id_gender'])[2]")) WebElement
	 * gender1;
	 */
	/*
	 * public void signUp() { //login.click(); clicks(login);
	 * //emailId.sendKeys(mailId); //sendkeys(emailId,mailId); }
	 */
	/*
	 * @FindBy(how=How.XPATH,using=("//input[@id=\"customer_firstname\"]"))
	 * WebElement gender;
	 */
		
		//input[@name='id_gender'])[2]

}
