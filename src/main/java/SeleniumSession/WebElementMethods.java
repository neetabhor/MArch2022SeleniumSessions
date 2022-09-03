package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	static WebDriver driver;
	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//WE+Action(click, SK, getText, isdisplayed)

		By email = By.id("input-email");
//		boolean flag = driver.findElement(email).isDisplayed();
//		System.out.println(flag);
//		
//		if(doIsDisplayed(email)) {
//			doSendkeys(email, "neeta@myrsa.co");
//		}
		
		//get attribute of the element
		String placeholder =driver.findElement(By.id("input-email")).getAttribute("placeholder");
		System.out.println(placeholder);
		
		driver.findElement(By.id("input-email")).sendKeys("Neeta@myrsa.co");
		String value =driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(value);
	}
	
	

	
	public static String getAttributeValue (By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
	
	public static boolean doIsDisplayed(By locator ) {
		return getElement(locator).isDisplayed();
	}
	
	public static boolean doIsEnabled(By locator ) {
		return getElement(locator).isEnabled();
	}
	
	
	public static void doSendkeys(By locator, String value) {
		getElement (locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
