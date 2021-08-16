package testCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.TestBase;
import pages.ABTestVeriation1;
import pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage page;
	ABTestVeriation1 abtestVariation;
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		page=new HomePage();
		abtestVariation=new ABTestVeriation1();
	}
	
	@Test
	public void verifyABTesting() throws InterruptedException {
		page.clickABLinkText();
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		while(it.hasNext()) {
			System.out.println("Entered while loop");
			if(!it.next().equalsIgnoreCase(parentId)) {
				System.out.println("Entered if loop");
				driver.switchTo().window(it.next());
				
				//System.out.println("Title has mathced");
			}
		}
		//String child=it.next();
		//System.out.println(child);
		//driver.switchTo().window(child);
		Thread.sleep(3000);
		System.out.println("Title has mathced");
		Assert.assertEquals(abtestVariation.verifyHeaderOfPage(), "A/B Test Variation 1");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
