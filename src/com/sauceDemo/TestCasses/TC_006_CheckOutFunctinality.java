package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CheckOutPagePOMClass;
import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.OrderCopletPagePOMClass;
import com.sauceDemo.POMClasses.OrderOverviewPagePOMClass;
import com.sauceDemo.POMClasses.YourCartPagePOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_006_CheckOutFunctinality extends TestBaseClass
{
	@Test
	public void addTocartFunctionality() throws IOException 
	{
			HomePagePOMClasss hp =new HomePagePOMClasss(driver);
			hp.clickAddToCartButton();
			ScreenShotClass.ScreenShot(driver);
			hp.clickCartButton();
			
			YourCartPagePOMClass cp =new YourCartPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			cp.clickCheckOutButton();
			
			CheckOutPagePOMClass cop =new CheckOutPagePOMClass(driver);
			cop.sendFirstName();
			cop.sendLastName();
			cop.sendPinCode();
			ScreenShotClass.ScreenShot(driver);
			cop.clickContinueButton();
			
			OrderOverviewPagePOMClass op= new OrderOverviewPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			op.clickFinishButton();
			
			OrderCopletPagePOMClass oc = new OrderCopletPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			String ActualResult=oc.getTextFromLastPage();
			String ExpectedResult="THANK YOU FOR YOUR ORDER";
			oc.clickBackToHomePageButton();
			Assert.assertEquals(ExpectedResult, ActualResult);
		}

}
