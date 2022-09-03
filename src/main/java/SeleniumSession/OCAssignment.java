package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OCAssignment {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/register");
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By tele = By.id("input-telephone");
		By fax = By.id("input-fax");
		
		By cname = By.xpath("//*[@id=\"input-company\"]");
		By Add1 = By.xpath("//*[@id=\"input-address-1\"]");
		By Add2 = By.xpath("//*[@id=\"input-address-2\"]");
		
		By city = By.cssSelector("#input-city");
		By Postcode = By.cssSelector("#input-postcode");
		
		By password = By.name("password");
		By confirmpassword = By.name("confirm");
		By checkbox =By.name("agree");
		By submit = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendkeys(fname, "Neeta");
		eleUtil.doSendkeys(lname, "Bhor");
		eleUtil.doSendkeys(email, "bhorneeta@gmail.com");
		eleUtil.doSendkeys(tele, "9762388879");
		eleUtil.doSendkeys(fax, "123");
		
		eleUtil.doSendkeys(cname, "Myrsa technologies");
		eleUtil.doSendkeys(Add1, "Pune");
		eleUtil.doSendkeys(Add2, "Pune");

		eleUtil.doSendkeys(city, "Pune");
		eleUtil.doSendkeys(Postcode, "411044");

		eleUtil.doSendkeys(password, "Neet@123");
		eleUtil.doSendkeys(confirmpassword, "Neet@123");
		
		eleUtil.doClick(checkbox);
		eleUtil.doClick(submit);

		
		
		
		
		
		
	}
	
	
	
}
