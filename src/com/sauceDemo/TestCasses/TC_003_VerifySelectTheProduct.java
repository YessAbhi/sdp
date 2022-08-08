package com.sauceDemo.TestCasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;

public class TC_003_VerifySelectTheProduct extends TestBaseClass
{
	@Test
	public void addToCartSingleProduct() 
	{
	HomePagePOMClasss hp = new HomePagePOMClasss(driver);
	hp.clickAddToCartButton();
	String APR =hp.getTextFromCart();
	String EPR = "1";
	Assert.assertEquals(EPR, APR);
	}
}
