package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		//child window/tab will be opened
		
		Set<String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("parent window id is :" +parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window id is :" +childWindowID);
		
		//switch work:
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is :" + driver.getTitle());
		driver.close(); //close child window
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is :" + driver.getTitle());
		
		driver.quit();
		
		
		
		
		
	}

}
