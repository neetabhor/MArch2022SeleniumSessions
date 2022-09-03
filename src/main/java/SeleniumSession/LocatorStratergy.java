package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStratergy {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		//create a webelement (by using locator)+ action (click, sendkeys, double-click, rightclick, gettext, isdisplayed)
		
		//1.id
		//1st approach
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Neeta");
//		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Bhor");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("bhorneeta@gmail.com");
		
		//2nd approach
//		WebElement fname = driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement lname = driver.findElement(By.id("Form_submitForm_LastName"));
//		WebElement Email = driver.findElement(By.id("Form_submitForm_Email"));
//		
//		fname.sendKeys("Neeta");
//		lname.sendKeys("Bhor");
//		Email.sendKeys("bhorneeta@gmail.com");
		
		//3rd approach : by locator 
//		By fname =By.id("Form_submitForm_FirstName");
//		By lname = By.id("Form_submitForm_LastName");
//		By Email = By.id("Form_submitForm_Email");
//		
//		WebElement fname_ele = driver.findElement(fname);
//		WebElement lname_ele = driver.findElement(lname);
//		WebElement Email_ele = driver.findElement(Email);
//		
//		fname_ele.sendKeys("Neeta");
//		lname_ele.sendKeys("Bhor");
//		Email_ele.sendKeys("bhorneeta@gmail.com");
		
		
		//4.By locator with a generic function:
//		By fname =By.id("Form_submitForm_FirstName");
//		By lname = By.id("Form_submitForm_LastName");
//		By Email = By.id("Form_submitForm_Email");	
//		
//		
//		getElement(fname).sendKeys("Neeta");
//		getElement(lname).sendKeys("Bhor");
//		getElement(Email).sendKeys("bhorneeta@gmail.com");
		

		//5.By locator with a generic function of webelement and action
//		By fname =By.id("Form_submitForm_FirstName");
//		By lname = By.id("Form_submitForm_LastName");
//		By Email = By.id("Form_submitForm_Email");	
//		
//		doSendkeys(fname, "Neeta");
//		doSendkeys(lname, "Bhor");
//		doSendkeys(Email, "bhorneeta@gmail.com");
		
		//6th approach :by locator with ElementUtil class having generic methods: (maintain th by locator ->  create the object and call the method)
//		By fname =By.id("Form_submitForm_FirstName");
//		By lname = By.id("Form_submitForm_LastName");
//		By Email = By.id("Form_submitForm_Email");
//		
//		ElementUtil eleUtil  = new ElementUtil(driver);
//		eleUtil.doSendkeys(fname, "Neeta");
//		eleUtil.doSendkeys(lname, "Bhor");
//		eleUtil.doSendkeys(Email, "bhorneeta@gmail.com");
		
		//7th approach : String locator with ElementUtil class having generic methods
		String fname_id = ("Form_submitForm_FirstName");
		String lname_id = ("Form_submitForm_LastName");
		String Email_id = ("Form_submitForm_Email");	
		
		//create a webelement (by using locator)+ action click, sendkeys, doubleclick
		ElementUtil eleUtil  = new ElementUtil(driver);
		eleUtil.doSendkeys("id",fname_id , "Neeta");		
		
	

		
	}
	
	public static By getBy(String locatorType, String locatorValue) {
		
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
		
	}
	
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	

}
