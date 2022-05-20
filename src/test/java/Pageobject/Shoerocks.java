package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shoerocks {
WebDriver driver;
	
	
	public  Shoerocks(WebDriver driver) {
		
		this.driver=driver;

}
	
	By shoe=By.xpath("//li[@class='featuredLinksBar__contact-link']");
	By helpsearch=By.id("help-center-search-input");
	By icon=By.xpath("//button[@class='help-center-search-icon icofont-search_latest']");
	
	public WebElement shoe1()
	{
		return driver.findElement(shoe);
		
	}
	public WebElement helpsearch1()
	{
		return driver.findElement(helpsearch);
		
	}
	public WebElement icon1()
	{
		return driver.findElement(icon);
		
	}


}
