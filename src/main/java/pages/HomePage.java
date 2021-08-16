package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
@FindBy(xpath="");
WebElement elementName;*/
import Utilities.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="A/B Testing")                 
	WebElement aBTesting;
	
	@FindBy(linkText="Add/Remove Elements")                 
	WebElement addRemoveElements;
	
	public void clickABLinkText(){
		aBTesting.click();
	}
	
	public void clickAddRemoveElements(){
		addRemoveElements.click();
	}
	
	
	
	

}
