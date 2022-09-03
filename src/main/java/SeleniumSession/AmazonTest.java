package SeleniumSession;

import javax.print.DocFlavor.URL;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.init_driver("firefox");
		brUtil.launchUrl("https://www.amazon.com");

		String title = brUtil.getPageTitle();
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("Correct title");
		}
		
		String Url = brUtil.getPageUrl();
		if(Url.contains("amazon")) {
			System.out.println("Url is correct");
		}
		
		brUtil.CloseBrowser();
		
	}

}
