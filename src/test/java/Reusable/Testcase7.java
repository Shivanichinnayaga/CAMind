package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Giftcards;


public class Testcase7 {
	@Test
	public void Testcase77() {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		Giftcards tw=new Giftcards(driver);
		tw.gift1().click();
		tw.house1().click();
	}
	

}
