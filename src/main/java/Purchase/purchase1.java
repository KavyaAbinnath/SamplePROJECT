package Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchase1 {
	
	
	public WebDriver driver;
	
	  @FindBy(xpath="//a[@class=\"logout\"]")
	  private WebElement logout;
	  
	  @FindBy(xpath="//a[@class=\"login\"]")
	  private WebElement login;
	  
	  @FindBy(id="email")
	  private WebElement mail;
	  
	  @FindBy(id="passwd")
	  private WebElement passwd;
	  
	  @FindBy(id="SubmitLogin")
	  private WebElement submit_login;
	


	public WebElement getLogout() {
		return logout;
	}



	public WebElement getLogin() {
		return login;
	}



	public WebElement getMail() {
		return mail;
	}



	public WebElement getPasswd() {
		return passwd;
	}



	public WebElement getSubmit_login() {
		return submit_login;
	}



	public purchase1(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
