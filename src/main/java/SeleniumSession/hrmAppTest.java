package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hrmAppTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		
		brUtil.launchUrl("https://www.orangehrm.com/hris-hr-software-demo/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By fname =By.id("Form_submitForm_FirstName");
		By lname = By.id("Form_submitForm_LastName");
		By Email = By.id("Form_submitForm_Email");	
		
		ElementUtil eleuUtil = new ElementUtil(driver);
		eleuUtil.doSendkeys(fname, "Neeta");
		eleuUtil.doSendkeys(lname, "Bhor");
		eleuUtil.doSendkeys(Email, "bhorneeta@gmail.com");
		
		brUtil.CloseBrowser();
	}

}
