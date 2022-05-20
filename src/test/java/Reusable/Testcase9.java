package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.collection;

public class Testcase9 {
	@Test
	public void Testcase99() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		collection cc=new collection(driver);
		cc.collection1().click();
		Thread.sleep(2000);
		cc.gakurange1().click();
	}
	
	
	
	

}
