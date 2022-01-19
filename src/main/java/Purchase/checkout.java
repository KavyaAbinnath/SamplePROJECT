package Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
	public WebDriver driver;
	 @FindBy(xpath="//a[@class=\"btn btn-default button button-medium\"]")
	  private WebElement checkout_1;
	 
	 @FindBy(xpath="//a[@class=\"button btn btn-default standard-checkout button-medium\"]")
	  private WebElement checkout_2;
	 
	 @FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]")
	  private WebElement checkout_3;
	 
	 @FindBy(xpath="//div[@id=\"uniform-cgv\"]")
	  private WebElement check_box;
	 
	 @FindBy(xpath="//button[@name=\"processCarrier\"]")
	  private WebElement carrier;
	 
	 @FindBy(xpath="//a[@class=\"cheque\"]")
	  private WebElement pay;
	 
	 @FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]")
	  private WebElement checked_out;
	 
	 @FindBy(id="center_column")
	  private WebElement confirm;
	 
	 
	 
	public WebElement getCheckout_1() {
		return checkout_1;
	}



	public WebElement getCheckout_2() {
		return checkout_2;
	}



	public WebElement getCheckout_3() {
		return checkout_3;
	}



	public WebElement getCheck_box() {
		return check_box;
	}



	public WebElement getCarrier() {
		return carrier;
	}



	public WebElement getPay() {
		return pay;
	}



	public WebElement getChecked_out() {
		return checked_out;
	}

	public WebElement getConfirm() {
		return confirm;
	}


	public checkout(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
