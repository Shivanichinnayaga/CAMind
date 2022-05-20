package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class collection {
WebDriver driver;
	
	public  collection(WebDriver driver) {
		this.driver=driver;
	}
	
	By collection =By.xpath("//li[@class='topnav_item studyunit']");
	By gakurange=By.xpath("//li[@class='subnav_item 651']");
	
	public WebElement collection1()
	{
		return driver.findElement(collection);
		
	}
	public WebElement gakurange1()
	{
		return driver.findElement(gakurange);
		
	}
	
	

}
