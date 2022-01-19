package SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class create_ac_form {
	public WebDriver driver;
	
	  @FindBy(id="id_gender2")
	  WebElement gender1;
	  
	  	  
	  @FindBy(id="customer_firstname")
	  	  
	  private WebElement first_name1;
	  
	  @FindBy(id="customer_lastname")
  	  
	  private WebElement last_name1;
	  
      @FindBy(id="passwd")
  	  
	  private WebElement passwd;
      
      @FindBy(id="days")
  	  
	  private WebElement days;
      
      @FindBy(id="months")
  	  
	  private WebElement months;
      
      @FindBy(id="years")
  	  
	  private WebElement years;
      
      @FindBy(name="company")
      private WebElement company;
      
      @FindBy(name="address1")
      private WebElement address1;
      
      @FindBy(name="address2")
      private WebElement address2;
      
      @FindBy(name="city")
      private WebElement city;
      
      @FindBy(id="id_state")
      private WebElement state;
      
      @FindBy(name="postcode")
      private WebElement post;
      
      @FindBy(id="id_country")
      private WebElement country;
      
      @FindBy(name="phone_mobile")
      private WebElement phone;
      
      
      @FindBy(name="alias")
      private WebElement email2;
      
      @FindBy(name="submitAccount")
      private WebElement submit_ac;
      
      

	public create_ac_form(WebDriver driver2) {
		 this.driver=driver2;
		  PageFactory.initElements(driver, this);
	}

	public WebElement getGender1() {
		return gender1;
	}


	public WebElement getFirst_name1() {
		return first_name1;
	}

	public WebElement getLast_name1() {
		return last_name1;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail2() {
		return email2;
	}

	public WebElement getSubmit_ac() {
		return submit_ac;
	}
	
	

	
}
