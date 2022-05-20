package Reusable;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Storage;

public class Testcase6 {
	@Test
	public void Testcase5() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		Storage sgg=new Storage(driver);
		sgg.Storage1().click();
		Thread.sleep(2000);
		sgg.cupboards2().click();
		
	}

}
