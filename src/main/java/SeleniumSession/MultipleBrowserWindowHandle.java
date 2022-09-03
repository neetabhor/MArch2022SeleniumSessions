package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserWindowHandle {
	static WebDriver driver;


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		String parentWindowID =driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowID =it.next();
			if(!parentWindowID.equals(windowID)) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowID);
		System.out.println( "Parent window title : "+ driver.getTitle());
		
		
		
		
	}

}
