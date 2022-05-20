package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class decor {
WebDriver driver;
	
	
	public  decor(WebDriver driver) {
		this.driver=driver;

    
}
	By decor=By.xpath("//li[@class='topnav_item decorunit']");
	By carpets=By.xpath("//li[@class='subnav_item 556']");
	
	public WebElement decor1()
	{
		return driver.findElement(decor);
		
	}
	public WebElement carpets1()
	{
		return driver.findElement(carpets);
		
	}
}
