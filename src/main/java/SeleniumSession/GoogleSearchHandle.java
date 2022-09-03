package SeleniumSession;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		//	driver.findElement(By.name("q")).sendKeys("naveen automation labs");
			Thread.sleep(3000);
			
			By suggestions = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span");
		//	getGoogleSugglist(suggestions, "Selenium testing");
			selectGoogleSuggestion(suggestions, "Selenium Testing", "selenium testing syllabus");
	}
	
	
	public static void  selectGoogleSuggestion(By locator, String searchkey, String suggVal) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(searchkey);
		Thread.sleep(3000);
		List<WebElement> suggList = driver.findElements(locator);
		for (WebElement e: suggList) {
			String text= (e.getText());
			System.out.println(text);
			if(text.contains(suggVal)) {
				e.click();
				break;
			}
		}
	}
	
	
	public static List<String>  getGoogleSugglist(By locator, String searchkey) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(searchkey);
		Thread.sleep(3000);
		List<WebElement> suggList = driver.findElements(locator);
		List<String> suggValList = new ArrayList<String>();
		for (WebElement e: suggList) {
			String text= (e.getText());
			System.out.println(text);
			suggValList.add(text);
			
		}
		return suggValList;
	}

}
