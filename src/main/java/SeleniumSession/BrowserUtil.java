package SeleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver init_driver(String browserName) {
		System.out.println("Browser name is : " + browserName);
		
		if (browserName.equals("chrome")) {
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please pass the right browser.. " + browserName);
		}
		 return driver;
		
	}
	
	
	public void launchUrl(URL Url) {
		driver.navigate().to(Url);
	}
	
	public void launchUrl(String Url) {
		if(Url == (String) null) {
				System.out.println("Url is null");
				return;
		}
		
		if ((Url.indexOf("http")) == -1 || Url.indexOf("https") == -1) {
			System.out.println("http(s) is missing in th url..");
			return;
			
		}
		driver.get(Url);	
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void CloseBrowser() {
		 driver.close();
	}
	
	public void QuitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
