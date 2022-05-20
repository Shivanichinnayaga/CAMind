package Reusable;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Sign;

public class Testcase {
	Logger logger;
	@Test
	public void testcase() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		Sign sg=new Sign(driver);
		sg.person1().click();
		sg.login1().click();
		Thread.sleep(5000);
		sg.email1().sendKeys("shivaniyaga@gmail.com");
		Thread.sleep(5000);
		sg.password1().sendKeys("1234@shivu");
		sg.loginid1().click();
	}
	

}
