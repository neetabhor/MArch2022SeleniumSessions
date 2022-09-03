package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//1.id : always a unique locators   ---1
		//2.name : it can be duplicate     ----2
		
	//	driver.findElement(By.name("email")).sendKeys("neeta@myrsa.co");
	//	driver.findElement(By.name("password")).sendKeys("123");
	//	By email =By.name("email");
	//	By password = By.name("password");
	//	doSendkeys(email, "neeta@myrsa.co");
	//	doSendkeys(password, "123");
		
		//3.classname : it is not a unique attribute, can be duplicate   ----3
		// used only when we have unique classname for the element
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4.Xpath : it is not a attribute its the address of the element in the html DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
//		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
	
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"form-login\"]/button");
//		doSendkeys(email, "neeta@myrsa.co");
//		doSendkeys(password, "123");
//		doClick(loginBtn);
		
		
	//	5.CSS selector : not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("neeta@myrsa.co");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("123");
//		driver.findElement(By.cssSelector("#form-login > button")).click();
		
	//	6.  Link text : only for links
	//	driver.findElement(By.linkText("Register")).click();
//		String text = driver.findElement(By.linkText("Register")).getText();
//		System.out.println(text);
//		
//		By registerLink = By.linkText("Register");
//		if(doGetText(registerLink).equals("Register")){
//			System.out.println("PASS");
//		}
		
	//	7.Partial text : only for link which having long text
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
	//	8.Tag name  : to find out number of images
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	

	public static void doSendkeys(By locator, String value) {
		getElement (locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
}
