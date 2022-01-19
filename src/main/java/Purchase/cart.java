package Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {
	public WebDriver driver;
	 @FindBy(xpath="//a[@title=\"Women\"]")
	  private WebElement women_category;
	  
	  @FindBy(xpath="//a[@title=\"T-shirts\"]")
	  private WebElement tshirt_cat;
	  
	  @FindBy(xpath="//img[@title=\"Faded Short Sleeve T-shirts\"]")
	  private WebElement img;
	  
	  @FindBy(xpath="//a[@class=\"quick-view\"]")
	  private WebElement view;
	  
	  @FindBy(xpath="//iframe[@class=\"fancybox-iframe\"]")
	  private WebElement frame;
	  
	  public WebElement getWomen_category() {
		return women_category;
	}


	public WebElement getTshirt_cat() {
		return tshirt_cat;
	}


	public WebElement getImg() {
		return img;
	}


	public WebElement getView() {
		return view;
	}


	public WebElement getFrame() {
		return frame;
	}


	public WebElement getPlus() {
		return plus;
	}


	public WebElement getSize() {
		return size;
	}


	public WebElement getColor() {
		return color;
	}


	public WebElement getSubmit_item() {
		return submit_item;
	}


	@FindBy(xpath="//i[@class=\"icon-plus\"]")
	  private WebElement plus;
	  
	  @FindBy(id="group_1")
	  private WebElement size;
	  
	  @FindBy(id="color_14")
	  private WebElement color;
	  
	  @FindBy(name="Submit")
	  private WebElement submit_item;
	  
	  
	public cart(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
