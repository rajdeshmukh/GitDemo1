package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	 public WebDriver driver;
	 By emailId=By.cssSelector("[id='user_email']");
	 By password=By.cssSelector("[type='password']");
	 By login=By.cssSelector("[value='Log In']");
	 By popclick=By.xpath("//div[@class='sumome-react-wysiwyg-popup-animation-group']//button[contains(text(),'NO THANKS')]");
	 
	 
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement  emailId() {
		 return driver.findElement(emailId);
	 }
	public WebElement  password() {
		 return driver.findElement(password);
	 }
	public WebElement  login() {
		 return driver.findElement(login);
	 }
	public WebElement  popclick() {
		 return driver.findElement(popclick);
	 }

}
