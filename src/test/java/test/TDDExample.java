package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TDDExample {
	
	@Test		//Functional Test Case
	public void testPageTitle() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		String ActTitle = driver.getTitle();
		
		String ExpTitle = "World's #1 Online Bootcamp & Certification Course Provider";
		
		System.out.println(ActTitle);
		
		Assert.assertEquals(ExpTitle, ActTitle);
		
	}
	
	@Test		//Unit Test Case
	public void AddTest() {
		int result = this.addition(10, 20); 
		Assert.assertEquals(30,result);
	}
	
	public int addition(int a,int b) {
		return a+b;
	}

}
