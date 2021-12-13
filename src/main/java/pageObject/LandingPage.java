package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	 public WebDriver driver;
	 By signin=By.cssSelector("a[href*='sign_in']");
	 By popclick=By.xpath("//div[@class='sumome-react-wysiwyg-popup-animation-group']//button[contains(text(),'NO THANKS')]");
	 By navbar=By.xpath("//div[@class='container']//nav/ul/li");
	 
	

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public LoginPage  getlogin() {
		 driver.findElement(signin).click();
		 LoginPage l=new LoginPage(driver);
		 return l;
	 }
	public WebElement  popclick() {
		 return driver.findElement(popclick);
	 }
	public WebElement  Getnavbar() {
		 return driver.findElement(navbar);
	 }


}
