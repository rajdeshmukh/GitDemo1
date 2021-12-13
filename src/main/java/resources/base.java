package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	protected WebDriver driver;
	public Properties prop;
	public WebDriver initializDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\v-nisolu\\Practice\\PageObjectDemo\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\v-nisolu\\Documents\\Driverlatest\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			
		}
		else if(browserName.equals("IE")) {
			
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public String getScreenshotPath(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
        FileUtils.copyFile(source, new File(destinationfile));
        return destinationfile;
	}

}
