package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openCart {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordconfirm = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(fname, "Neeta");
		eleUtil.doSendkeys(lname, "Bhor");
		eleUtil.doSendkeys(email, "neeta@myrysa.co");
		eleUtil.doSendkeys(telephone, "9762388879");
		eleUtil.doSendkeys(password, "qwerty@123");
		eleUtil.doSendkeys(passwordconfirm, "qwerty@123");
				
	}

}
