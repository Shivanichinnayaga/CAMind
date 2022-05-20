package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactus {
WebDriver driver;
	
	
	public  contactus(WebDriver driver) {
		this.driver=driver;

}
	By contactus=By.linkText("Contact Us");
	
	public WebElement contactus1()
	{
		return driver.findElement(contactus);
		
	}

}

