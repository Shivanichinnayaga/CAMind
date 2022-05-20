package Reusability;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helpclass {
	public static String captureScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String scPath = System.getProperty("user.dir")+"./screenshots/Urbanladder_"+getCurrentDateTime()+".png";
		try
		{
			FileHandler.copy(src, new File(scPath));
		}
		catch(IOException e)
		{
			System.out.println("Unble to capture screenshot");
		}
		return scPath;
		
	}

	private static String getCurrentDateTime() 
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy HH_mm_ss");
		Date currentDate = new Date();
		
		return customFormat.format(currentDate) ;
	}

}
