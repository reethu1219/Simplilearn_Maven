package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)

public class ListenerTest {
	
	
	@Test
	public void LoginTest() {
		System.out.println("Inside Testcase");
		
		Assert.assertEquals("Hi", "Hi");
	}

}
