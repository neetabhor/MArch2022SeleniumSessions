package SeleniumSession;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");	
		
		By country = By.id("Form_submitForm_Country");
		By states = By.id("Form_submitForm_State");
		
//		dropDownSelectValue(country, "India");
//		Thread.sleep(4000);
//		dropDownSelectValue(states, "Goa");
		
		//not allowed to use select tag
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		dropDownSelectValuewithGetOptions(countryOptions, "India");
		
		
	}
	
	
		public static WebElement getElement (By locator) {
			return driver.findElement(locator);
		}
	
		public static void dropDownSelectValuewithGetOptions(By locator, String value) {
			
			Select select = new Select(getElement(locator));
			List<WebElement> optionList= select.getOptions();
			
			for(WebElement e : optionList) {
				String text = e.getText();
				System.out.println(text);
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
			
		}	
		public static void DropDownValueUsingLocator (By locator, String value) {
			List<WebElement> list = (List<WebElement>) getElement(locator);
			for (WebElement e : list) {
				String text = e.getText();
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
			}	
			
			
			
			
			

			
			
		}
	


