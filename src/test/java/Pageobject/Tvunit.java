package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tvunit {
WebDriver driver;
	
	public  Tvunit(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//li[@class='topnav_item kidsroomunit']");
	
	
	public WebElement Book1()
	{
		return driver.findElement(search);
		
	}
	
		

}
