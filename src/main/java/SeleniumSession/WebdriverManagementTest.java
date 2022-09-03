package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagementTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
			
		//automation step
		WebDriver driver = new ChromeDriver(); //launch browser
		driver.get("https://www.google.com");
			
		String title = driver.getTitle(); //get the title
		System.out.println("Page title : " + title);
				
				//checkpoint/ verification // expected vs actual
		if(title.equals("Google")) {
				System.out.println("Corrrect title...");
				}
				else {
					System.out.println("Incorrect title...");
				}
				
				
				
				driver.quit(); //close browser
		
		
		
		

	}

}
