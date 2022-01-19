package automationPractice;
import org.testng.annotations.Test;

import Purchase.cart;
import Purchase.checkout;
import Purchase.purchase1;
import mySel.Baseclass;
import SignIn.SignUp;
import SignIn.create_ac_form;
import SignIn.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class EcomTest extends Baseclass {
	WebDriver driver=Baseclass.BrowserLaunch("chrome");
	
	SignUp sign=new SignUp(driver);
	
	login loginnew=new login(driver);
	
	create_ac_form form=new create_ac_form(driver);
	
	purchase1 purchase=new purchase1(driver);
	
	cart cart1=new cart(driver);
	
	checkout check=new checkout(driver);
    
	@BeforeClass
	public void launch() {
		launchurl();
		
	}



	@Test(priority=1)
	public void signUp() throws Throwable {
		
	    clicks(sign.getLogin());
	    waits(loginnew.getEmailId(),"visibility");
		sendkeys(loginnew.getEmailId(),(excel(0, 1)));
		clicks(loginnew.getSubmit_button());
		waits(form.getGender1(),"click");
		form.getGender1().click();
		form.getFirst_name1().sendKeys(excel(1, 1));
		sendkeys(form.getLast_name1(),(excel(2, 1)));
		sendkeys(form.getPasswd(),(excel(3, 1)));
	    selects(form.getDays(),"20");
	    selects(form.getMonths(),"4");
	    selects(form.getYears(),"2017");
		sendkeys(form.getCompany(),(excel(4, 1)));
		sendkeys(form.getAddress1(),(excel(5, 1)));
		sendkeys(form.getAddress2(),(excel(6, 1)));
		sendkeys(form.getCity(),(excel(7, 1)));
		selects(form.getState(),"5");
		sendkeys(form.getPost(),(excel(8, 1)));
		selects(form.getCountry(),"21");
		sendkeys(form.getPhone(),(excel(9, 1)));
		sendkeys(form.getEmail2(),(excel(10, 1)));
		clicks(form.getSubmit_ac());
		
		//AssertJUnit.assertEquals(false,true);
	
	
	System.out.println("SignIn Completed");
	
	}
	
      @Test(priority=2)
	    public void WomenCatlogTest() throws Throwable {
		//waits(purchase.getLogout(),"click");
		//if first tc is enabled
		//clicks(purchase.getLogout());
		//if first tc is disabled
		clicks(purchase.getLogin());
		waits(purchase.getMail(),"click");
		sendkeys(purchase.getMail(),(excel(0, 1)));
		sendkeys(purchase.getPasswd(),(excel(3, 1)));
		clicks(purchase.getSubmit_login());
		waits(cart1.getWomen_category(),"click");
		actions(cart1.getWomen_category());
		clicks(cart1.getTshirt_cat());
		clicks(cart1.getImg());
		driver.switchTo().frame(cart1.getFrame());
		for (int i=1; i<3; i++){
			clicks(cart1.getPlus());
		}
		selects(cart1.getSize(),"3");
		clicks(cart1.getColor());
		clicks(cart1.getSubmit_item());
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    //System.out.println("switched to parent1");
	    waits(check.getCheckout_1(),"click");
	    //System.out.println("switched to parent2");
	    clicks(check.getCheckout_1());
	    waits(check.getCheckout_2(),"click");
	    clicks(check.getCheckout_2());
	    clicks(check.getCheckout_3());
	    clicks(check.getCheck_box());
	    clicks(check.getCarrier());
	    clicks(check.getPay());
	    clicks(check.getChecked_out());
        scroll(check.getConfirm());
	   
	 
		
		
	}
    /*  
	    @AfterClass
	    public static void afterclassMethod() {
	    	driver.close();
	    	driver.quit();
	    	
	    }
	    
	  */  
	
	


	
}
