package test;

//import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

//import com.relevantcodes.extentreports.ExtentReports;

public class Testcase1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver","geckodriver");
		 
		//extent = new ExtentReports("ExtentReport.html",true);
		driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void LoginTest() {
		LoginPage obj = new LoginPage(driver);
		obj.login("abc@gmail.com", "abc12345");
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
