package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign
{
	 WebDriver driver;
	
	
	public  Sign(WebDriver driver) { 
		this.driver=driver;
	}
	By person=By.xpath("//span[@ class='header-icon-link user-profile-icon']");
	By login=By.linkText("Log In");
	By email=By.xpath("//*[@class='email required input_authentication']");
	By password=By.xpath("//*[@class='required input_authentication']");
	By loginid=By.id("ul_site_login");
	
	public WebElement person1()
	{
		return driver.findElement(person);
		
	}
	public WebElement login1()
	{
		return driver.findElement(login);
		
	}
	public WebElement email1()
	{
		return driver.findElement(email);
		
	}
	public WebElement password1()
	{
		return driver.findElement(password);
		
	}
	public WebElement loginid1()
	{
		return driver.findElement(loginid);
		
	}
	
	}				

