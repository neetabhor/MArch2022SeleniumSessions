package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrmTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		
		brUtil.launchUrl("https://www.orangehrm.com/contact-sales/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By fname = By.id("Form_submitForm_FullName");
		By companyname = By.id("Form_submitForm_CompanyName");
		By jobtitle = By.id("Form_submitForm_JobTitle");
		By contact = By.id("Form_submitForm_Contact");
		By email = By.id("Form_submitForm_Email");
		By comment = By.id("Form_submitForm_Comment");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(fname, "Neeta");
		eleUtil.doSendkeys(companyname, "Myrsa");
		eleUtil.doSendkeys(jobtitle, "Software tester");
		eleUtil.doSendkeys(email, "bhorneeta@gmail.com");
		eleUtil.doSendkeys(comment, "i want to register...");
		
		brUtil.CloseBrowser();
		
		
		
		
		
		
		
		
		
		
	}

}
