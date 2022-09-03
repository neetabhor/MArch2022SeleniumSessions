package myTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	WebDriver driver;
	 
	@BeforeTest(description = ".....setup for Google test: launch chrome and enter url.....")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1, description = ".....checking page title contains google......")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		Assert.assertEquals(title , "Google" , "....Google page title is not matched....");
	}
	
	@Test(priority = 2, description = ".....checking page url contains google......")
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page Url :" +url);
		Assert.assertTrue(url.contains("google"), ".....google page url is not matched with google");
	}
	
	@AfterTest(description = "....closing the browser.....")
	public void tearDown() {
		driver.quit();
	}
}
