package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Storage {
WebDriver driver;
	
	
	public  Storage(WebDriver driver) {
		this.driver=driver;

    
}
	By Storage= By.xpath("//li[@class='topnav_item storageunit']");
	By cupboards= By.xpath("//li[@class='subnav_item 1616']");
	
	public WebElement Storage1()
	{
		return driver.findElement(Storage);
		
	}
	public WebElement cupboards2() {
		return driver.findElement(cupboards);
		
	}

}
