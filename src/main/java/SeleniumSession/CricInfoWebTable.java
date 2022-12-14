package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTable {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/valletta-cup-2022-1310148/gibraltar-vs-hungary-3rd-match-1310172/full-scorecard");
		
		System.out.println(getScoreCard("Asanka Weligamage"));
		System.out.println(getScoreCard("Ali Farasat"));
		
		//amazon footer:
		//div[text()='Get to Know Us']/parent::div/ul//a 
		//div[text()='Make Money with Us']/parent::div/ul//a 

		
	}
	
	public static List<String>  getScoreCard(String PlayerName) {
		System.out.println("playname :" +PlayerName);
		List<WebElement> scoreList = 
				driver.findElements(By.xpath("//span[contains(text(),'"+PlayerName+"')]/ancestor::td//following-sibling::td"));
		List<String> scoreCardList = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}
}
