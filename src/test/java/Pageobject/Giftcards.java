package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Giftcards {
WebDriver driver;
	
	public  Giftcards(WebDriver driver) {
		this.driver=driver;
	}
	
	By gift =By.linkText("Gift Cards");
	By house=By.xpath("//img[@alt='House Warming Gift Card by Urban Ladder']");
	public WebElement gift1()
	{
		return driver.findElement(gift);
		
	}
	public WebElement house1()
	{
		return driver.findElement(house);
		
	}

}
