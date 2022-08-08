package com.sauceDemo.TestCasses;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.UtilityClasses.ScreenShotClass;

   public class TC_001_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void logInFunctionality() throws IOException 
	{
		
		String EPTital = "Swag Labs";
		String ACTitle =driver.getTitle();
		Assert.assertEquals(EPTital, ACTitle);
		
		ScreenShotClass.ScreenShot(driver);
		
	}

}
