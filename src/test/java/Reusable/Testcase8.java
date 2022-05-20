package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Tvunit;

public class Testcase8 {
	
	@Test
	public void Testcase7 () throws InterruptedException{
		
		    System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.urbanladder.com");
			Tvunit tv=new Tvunit(driver);
			tv.Book1().click();

}
	
	
}
