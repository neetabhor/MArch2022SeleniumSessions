package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By email =By.id("input-email");
		By password = By.id("input-password");
		By loginbtn = By.xpath("//*[@id=\"form-login\"]/button");
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(getElement(email), "Test@gmail.com").perform();
//		act.sendKeys(getElement(password), "test@123").perform();
//		act.click(getElement(loginbtn)).perform();
		
		doActionSendkeys(email, "Naveen@gmail.com");
		doActionSendkeys(password, "naveen@123");
		doActionClick(loginbtn);
		
		
	}
	
	public static void doActionSendkeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
