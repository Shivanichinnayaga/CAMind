package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sale {
WebDriver driver;
	
	public  Sale(WebDriver driver) {
		this.driver=driver;
	}

	By sale = By.xpath("//li[@class='topnav_item topdealsunit']");
	By sofa= By.xpath("//li[@class='subnav_item 15128']");

	public WebElement sale1()
	{
		return driver.findElement(sale);
		
	}
	public WebElement sofa1()
	{
		return driver.findElement(sofa);
		
	}


}
