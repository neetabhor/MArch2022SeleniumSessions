package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//frame
		//iframe
		
		//driver.switchTo().frame(2);
	//	driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		//selenium 4.x:
		driver.switchTo().parentFrame();
		
		
		
	}

}
