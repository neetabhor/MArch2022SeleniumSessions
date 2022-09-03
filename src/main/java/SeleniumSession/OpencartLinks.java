package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartLinks {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		 
		List <WebElement> Links = driver.findElements(By.xpath("//div[@class='list-group mb-3']//a"));
		
		Links.stream().forEach(e -> System.out.println(e.getText()));
		
		
		
		
	}

}
