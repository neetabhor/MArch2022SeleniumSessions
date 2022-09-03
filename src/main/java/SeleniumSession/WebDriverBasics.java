package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1.Launch browser : Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe"); //never copy path try cmd prompt
		
		//automation steps
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
