package SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{
	public WebDriver driver;
	
	  @FindBy(id="email_create")
 private WebElement emailId;
	  
	  @FindBy(id="SubmitCreate")
	  
private WebElement Submit_button;
	  public login(WebDriver driver) { 
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
		  }

	public WebElement getEmailId() {
		return emailId;
	}
	
	  public WebElement getSubmit_button() {
		  return Submit_button; 
		  }
	  
	


}
