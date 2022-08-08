package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_008_VerifyToBayMultipleProduct extends TestBaseClass
{
	@Test
	public void multipleProductSelect() throws IOException 
	{
		HomePagePOMClasss  hp= new HomePagePOMClasss(driver);
		hp.clickAllItems();;
		ScreenShotClass.ScreenShot(driver);
		
		String ACR =hp.getTextFromCart();
		String EPR ="6";
		
		Assert.assertEquals(EPR, ACR);
		

	}

}
