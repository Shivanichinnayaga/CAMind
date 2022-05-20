package Reusable;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Bookshelf;

public class testcase1 {
	WebDriver driver;
	Logger logger;
	@Test
	public void Test1() {
         Logger logger=Logger.getLogger("log4j2.properties");
         logger.info("opening");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		Bookshelf bs = new Bookshelf(driver);
		bs.Bookshelf1().sendKeys("Bookshelf");
		bs.searchicon1().click();

	}

}
