package Utilities;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;


import Reusability.Helpclass;
import Reusability.Parentclass;




public class Baseclass {
	
	public WebDriver driver;
	public Config co;
	public Extentreport er;
	public ExtentTest log;

	public Helpclass oc;
	
	@BeforeSuite
	public void start() throws Exception
	{
		co=new Config();
		er=new Extentreport();
		oc=new Helpclass();
		
		
		
	}
	
	@BeforeClass
	public WebDriver setup()
	{
		return driver= Parentclass.Application(driver, co.getBrowser(),co.getURL());
	}
	
	@AfterMethod
	public void Down(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS )
		{
			log.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helpclass.captureScreenshot(driver)).build());
		}
		
		}
	

	@AfterClass
	public void close() {
		Parentclass.quitBrowser(driver);
	}
			
	}


