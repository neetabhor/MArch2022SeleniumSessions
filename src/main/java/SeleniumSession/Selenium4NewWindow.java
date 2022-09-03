package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4NewWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		String parentWindow = driver.getWindowHandle();
		
		
		driver.switchTo().newWindow(WindowType.WINDOW); //selenium 4 feature
		driver.navigate().to("https://amazon.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.quit();
	}

}
