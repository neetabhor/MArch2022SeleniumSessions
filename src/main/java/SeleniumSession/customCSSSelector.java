package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customCSSSelector {
	static WebDriver driver;
	public static void main(String[] args) {
		//not an attribute
		//id and class
		// #id 
		//.class or tag.class
		
		//#input-email or input#input-email
		//.form-control or input.form-control
		//#id.class
		//.class#id
		//#input-email.form-control
		//input.form-control#input-email
		
		//c1.c2.c3
		//tag.c1.c2.c3...
		
		//input[name='email'][type='text'][placeholder='E-MAIL ADDRESS']
		
		By.cssSelector("#input-email");
		
		//parent to child 
		//div.private-form_input-wrapper > input#username   ->>> direct child element
		//div.private-form_input-wrapper > input#username   ->>> direct +indirect Child Elements 
		
		//form#hs-login input -- 3
		//form#hs-login > input --0
				
		//child to parent: NA
		//backward trvaersing is not allowed in CSS
		
		// input[id*='name'][type='email'][class*='form-control'] --contains
		// input[id^='user'] -- statswith
		// input[id$='name'] --endswith
		
		//preceding-sibling: NA
		//following-sibling: label.control-label + input#input-email
				
		//no text support
		//comma in css:
		
		int mand_fieldsCount = driver.
				findElements
		(By.cssSelector("input#username, input#password, button#loginBtn, input#remember")).size();

		//not in css:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//                 xpath            |        cssSelector
		//1. syntax:       hard							simple
		//2. backward:     possible						NA
		//3. performance:  same							same
		//4. comma, not: 	NA							available
		//5. text: 			available						NA
		//6. sibling: 		better support				only direct forward sibling
		//7. dynamic ele: 	available						available
		//8. webtable: 		better support				not that great
		
		
	}

}
