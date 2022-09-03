package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1. Recommended -> acc to standard 99% people used
		//WebDriver driver = new ChromeDriver();
		
		//2. Not Recommended
		//SearchContext driver = new ChromeDriver();
		
		//3. only for chrome driver
		//ChromeDriver driver = new ChromeDriver();
		
		//4. Recommended
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.get("www.google.com");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.close();
		
		//5. Recommended for remote grid execution : Cloud ,remote, AWS	
		//WebDriver driver = new RemoteWebDriver(new URL("192.189.90.99:4444"), capabilities);
		
		//6.Not recommended cz used for chrome and edge
		//ChromiumDriver driver = new EdgeDriver();
		//ChromiumDriver driver = new OperaDriver(); //selenum 4.0 remove from sel 4.0-> opera driver is deprecated
		
		
		
		
		
		
		

		
		
		
	}

}
