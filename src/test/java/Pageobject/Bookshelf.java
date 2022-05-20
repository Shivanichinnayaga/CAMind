package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bookshelf {

	WebDriver driver;

	public Bookshelf(WebDriver driver) {
		this.driver = driver;
	}

	By bookshelf = By.id("search");
	By searchicon = By.xpath("//span[@class='search-icon icofont-search']");

	public WebElement Bookshelf1() {
		return driver.findElement(bookshelf);

	}

	public WebElement searchicon1() {
		return driver.findElement(searchicon);

	}

}
