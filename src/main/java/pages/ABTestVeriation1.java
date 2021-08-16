package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class ABTestVeriation1 extends TestBase {
	
	public ABTestVeriation1() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='example']/h3")
	WebElement getPageHeader;
	
	public String verifyHeaderOfPage() {
		return getPageHeader.getText();
	}

}
