package Reusable;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Shoerocks;

public class Testcase4 {
	@Test
	public void testcase4()  {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com");
        Shoerocks sr=new Shoerocks(driver);
        sr.shoe1().click();
        sr.helpsearch1().sendKeys("How do I cancel order?");
        sr.icon1().click();
}
}
