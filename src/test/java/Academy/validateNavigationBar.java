package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	public WebDriver driver;
	@BeforeTest
	public void Initialize() throws IOException {
		 driver=initializDriver();
		 driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basePageNavigation() throws IOException {
		  
		 LandingPage l=new LandingPage(driver);
		 Assert.assertTrue(l.Getnavbar().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
