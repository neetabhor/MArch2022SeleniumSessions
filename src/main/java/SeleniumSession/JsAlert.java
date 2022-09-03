package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//JavaScript pop up :Alerts /prompt/confirmation
		//modal dialogue means js pop
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		
		alert.accept();//Click on ok
	//	alert.dismiss();//dismiss the alert, click on cancel button
		
	}

}
