package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//context -> right click
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClick =By.xpath("//span[text()='right click me']");
		By rightClickItems = By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class ,'context-menu-icon')]");
		
		By copy = By.xpath("//span[text()='Copy']");
		By quit = By.xpath("//span[text()='Quit']");

//		List<String> rightList = getRightClickMenuList(rightClick, rightClickItems);
//		System.out.println(rightList);
//		
		
		selectRightClickMenu(rightClick, quit);
		
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(rightClick).perform();
//		
//	//	driver.findElement(By.xpath("//span[text()='Copy']")).click();
//		
//		
//		
//		List<WebElement>  MenuItems = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class ,'context-menu-icon')]"));
//	
//		for (WebElement e: MenuItems) {
//			String text =e.getText();
//			System.out.println(text);
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//			}
//			
//		}
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectRightClickMenu(By rightClickElementLocator, By rightMenuItems) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickElementLocator)).perform();
		getElement(rightMenuItems).click();
	}
	
	public static List<String> getRightClickMenuList(By rightClickElementLocator, By rightMenuItems) {
		List<String> rightMenuList = new ArrayList<String>();
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickElementLocator)).perform();
		List<WebElement> menuItems = driver.findElements(rightMenuItems);

		for (WebElement e : menuItems) {
			String text = e.getText();
			rightMenuList.add(text);
		}
		return rightMenuList;
	}
		
		
		
	

}
