package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailid =By.id("input-email");
		if(driver.findElements(emailid).size()>0) {
			System.out.println("Element is displayed");
		}
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static boolean isElementDisplayed(By locator) {
		WebElement ele = getElement(locator);
		List<WebElement> elelist = getElements(locator);
		if(elelist.size()>0){
			if(ele.isDisplayed())
				return true;
		}
		return false;
	}
}
