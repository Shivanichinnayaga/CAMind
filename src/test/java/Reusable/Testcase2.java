package Reusable;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Sale;

public class Testcase2 {
	@Test
	public void testcase22() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	Sale s = new Sale(driver);
	s.sale1().click();
	Thread.sleep(2000);
	s.sofa1().click();

}
	
}
