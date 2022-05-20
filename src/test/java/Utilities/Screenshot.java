package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	static WebDriver driver;
public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	takeScreenShot("urbanladder_Page");

}
 public static void takeScreenShot(String fileName) throws IOException{
	 Date currentdate= new Date();
	    String filename= currentdate.toString().replace("", "-").replace(":", "-");
    
	 
	File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("C:\\Users\\mindsdet350\\eclipse-workspace\\Comprehensivemindtree"
    		+ "\\src\\test\\java\\Utilities"+fileName+".jpg"));
 }
}