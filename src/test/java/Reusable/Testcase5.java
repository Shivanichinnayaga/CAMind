package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.decor;

public class Testcase5 {
	@Test
	public void Testcase5() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	decor d=new decor(driver);
	d.decor1().click();
	Thread.sleep(2000);
	d.carpets1().click();
	

}
}
