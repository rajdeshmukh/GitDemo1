package Academy;

import java.io.IOException;

import org.eclipse.jetty.util.preventers.LoginConfigurationLeakPreventer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	@BeforeTest
	public void Initialize() throws IOException {
		 driver=initializDriver();
		 driver.get(prop.getProperty("url"));
	}
	
	
	 @Test
	 public void basePageNavigation() throws IOException, Exception {
		
		 LandingPage l=new LandingPage(driver);
		 LoginPage lp=l.getlogin();
		 Thread.sleep(5000);
		 //l.popclick().click();
		 lp.emailId().sendKeys("abc@qw.com");
		 lp.password().sendKeys("123456");
		 lp.login().click();
		 
	 }
	 @AfterTest
		public void closeBrowser() {
			driver.close();
		}

}
