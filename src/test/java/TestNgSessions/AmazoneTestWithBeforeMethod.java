package TestNgSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazoneTestWithBeforeMethod {
	WebDriver driver;
	 
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority = 1)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		Assert.assertEquals(title , "Amazon.com. Spend less. Smile more.");
	}
	
	@Test(priority = 3)
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page Url :" +url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test(priority = 2)
	public void isSearchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
