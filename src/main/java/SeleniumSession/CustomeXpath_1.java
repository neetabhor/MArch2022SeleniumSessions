package SeleniumSession;

public class CustomeXpath_1 {

	public static void main(String[] args) {
		
		//1. for signle attribute
		//htmltag[@attr='value']
		//input[@id='input-email']
		
		//2. for double attribute
		//htmltag[@attr='value' and @attr = 'value']
		//input[@id='input-email' and @name='email']
		//3. for three attribute
		//input[@id='input-email' and @name='email' and @type = 'text']
		
		//4. if id and name is not there then we can use placeholder
		//input[@placeholder ='E-Mail Address']
		
		//5. contains() method
		//htmltag[contains(@attr, 'value')]
		//input id ="test_123"
		//input id ="test_456"
		//input id ="test_890"
		//input[contains(@id,'test_')]
		
		//input[contains(@id, 'firstname')]
		
		//we cam combine contains and other attribute 

		//htmltag[contains(@attr, 'value') and @attr ='value']
		//input[contains(@id, 'firstname') and @name='firstname']
		
		//we cam use 2 contains in 1 xpath 
		//input[contains(@id, 'firstname') and contains(@name,'first')]

		//6. text() mehtod
		//htmltag[text()='value']
		//h1[text()='Register Account']
		

		//7.contains() with text():
		//htmltag[contains(text(),'value')]
		//legend[contains(text(),'Personal')]
		//p[contains(text(),'businesses to delight their customers')]
		
		
		//8.contains(), text() and attribute:
		//htmltag[contains(@attr,'value') and text()='value' and @attr='value']
		//a[contains(@href,'route=account/forgotten') and text()='Forgotten Password' and @class='list-group-item']
		//a[contains(@href,'route=account/forgotten') and contains(text(),'Forgotten') and contains(@class,'list-group')]
		
		//9.starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@name,'first')]
		//input[starts-with(@name,'first') and starts-with(@placeholder,'First')]
		
		//10. starts-with() and text():
		//htmltag[starts-with(text(),'value')]
		//h1[starts-with(text(),'Register')]
				
		//11. index:
		// (//input[@class='form-control'])[2]
		// (//input[@class='form-control'])[position()=2
		//By.xpath("(//input[@class='form-control'])[2]");
		
		//12.last():
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//li)[last()]/a
				
		//13.xpath axes:
		//parent and child:
		//parent tag / child tag - direct child elements
		//parent tag // child tag -- direct + indirect child elements
		
		//div[@id='content']//child::form
		//div[@id='content']//form//input[@name='email']
			
		//child to parent:
		//backward traversing in xpath: allowed
		//input[@name='email']/../../../../../../../../../..
		
		//input[@name='email']/parent::div
		//input[@name='email']/..
		//input[@name='email']/ancestor::form
		
		//preceding-sibling:
		//input[@name='email']/preceding-sibling::label[@for='input-email']
			
		
		//following-sibling:
		//label[@for='input-email']/following-sibling::input[@name='email']
		
		//label[normalize-space()='Yes']/input
				
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//label[normalize-space()='Yes']
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
