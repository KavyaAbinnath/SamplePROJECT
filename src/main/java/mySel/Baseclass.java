package mySel;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
 public static WebDriver driver;
 
 public static WebDriver BrowserLaunch(String type){
	 if(type.equalsIgnoreCase("chrome")){
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
	 }else if(type.equalsIgnoreCase("edge")) {
		 
		 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
			driver.manage().window().maximize();
		 
			}
	return driver;
	 		
	
	}
 
 public static void scroll(WebElement w) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",w);
		
	}

	 public static void launchurl() {
		 driver.get("http://automationpractice.com/index.php");
	 }
	 
	public static void waits(WebElement w,String type)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		if(type.equalsIgnoreCase("click")) {
			wait.until(ExpectedConditions.elementToBeClickable(w));
		}
		else if(type.equalsIgnoreCase("visibility")) {
			wait.until(ExpectedConditions.visibilityOf(w));
		}
	}
	 public static  void clicks(WebElement w) {
			w.click();
		
		}
	public static  void sendkeys(WebElement w,String s) {
		w.sendKeys(s);
	
	}
	
	public static void selects(WebElement w,String Value) {
		Select ss=new Select(w);
		ss.selectByValue(Value);
		
	}
	public static  void takeScreenShot(String fileName) throws IOException {
		//.take screenshot
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2.Copy screenshot
		FileUtils.copyFile(file,new File("C:\\Users\\User\\eclipse-workspace\\mySel\\Screenshot\\"+fileName+".png"));
	}
	public static void actions(WebElement target) {
		Actions Action = new Actions(driver);
		Action.moveToElement(target).perform();
	}
	public static String excel(int rows,int cells) throws Throwable {
		
		File f = new File("C:\\Users\\User\\Documents\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(rows);
		Cell cell=row.getCell(cells);
		String testData = null;
		for(int j=0;j<row.getPhysicalNumberOfCells();j++){
			CellType cellType = row.getCell(j).getCellType();
			if(row.getCell(j)!=null) {
				if(cellType==cellType.BOOLEAN)
				{
					testData=Boolean.toString(row.getCell(j).getBooleanCellValue());
				}
				if(cellType==cellType.NUMERIC) {
					double numericCellValue=row.getCell(j).getNumericCellValue();
					Integer values=(int)(numericCellValue);
					
					testData=values.toString();
				}
				if(cellType==cellType.STRING){
					testData=row.getCell(j).getStringCellValue();
					
					
				}
			}
		
			
		}
		return testData;
		
		
		
		
	}

}
