package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		int pageCount =1;
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='Ukraine']")).size()>0) {
				selectCountry("Ukraine");
				System.out.println("Page count: " +pageCount);
				break;
			}
			else {
				//pagination logic
				//click on next button
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagonation is over.. record is not found");
					break;
				}
				next.click();
				Thread.sleep(1500);
				pageCount++;
				
				
			}
		}
		
	}

	
	public static void selectCountry(String countryname) {
		driver.findElement(By.xpath("//td[text()='"+countryname+"']//preceding-sibling::td/input[@type ='checkbox']"))
		.click();
	}
	
	
}
