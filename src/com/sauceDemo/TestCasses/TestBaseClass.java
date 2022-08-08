package com.sauceDemo.TestCasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.LogInPOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;


public class TestBaseClass 
{
	
	WebDriver driver;
	Logger log=Logger.getLogger("SauceDemo_project");
	
	@Parameters("browserName")
	@BeforeMethod
	public  void setUp(String browserName) throws IOException 
	{
		
		
		if(browserName.equals("chrome")) 
		{
		  System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
		  driver = new ChromeDriver();
		  log.info("Chrome Browser Open Successfully");
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("FireFox Browser Open Successfully");
		}
		else 
		{
	       log.info("Throw the Error");
		}
		PropertyConfigurator.configure("log4j.properties");
		
		
		driver.manage().window().maximize();
		log.info("browser is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		log.info("Saucedemo site is Open Successfully");
		
		LogInPOMClass lp = new LogInPOMClass(driver);
		lp.SendUserName();
		log.info("User Name Send  Successfully");
		lp.SendPassword();
		log.info("Password Send Successfully");
		
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot taken");
		lp.ClickOnLoginButton();
		log.info("LogIn Button Clicked  Successfully");	
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException 
	{   
		
		HomePagePOMClasss hp = new HomePagePOMClasss(driver);
//		driver.navigate().back();
		hp.clickOpenManuButton();
		hp.clickLogOutButton();
		log.info("Log Out Successesfully");
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot taken");
		
		driver.quit();
	    log.info("browser is closed");

	}

}
