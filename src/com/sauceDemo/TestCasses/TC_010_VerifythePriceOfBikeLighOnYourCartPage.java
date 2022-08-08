package com.sauceDemo.TestCasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.YourCartPagePOMClass;

public class TC_010_VerifythePriceOfBikeLighOnYourCartPage extends TestBaseClass
{
	@Test
	public void verifyPriceOfBikeLightOnYourCartPage() 
	{
		HomePagePOMClasss hp =new HomePagePOMClasss(driver);
		hp.addToCartBikeLight();
		hp.clickCartButton();
		
		YourCartPagePOMClass yc=new YourCartPagePOMClass(driver);
		String ActualResult =yc.gettextFromYourCartPage();
		String ExpectedResult="$9.99";
		Assert.assertEquals(ExpectedResult, ActualResult);
		yc.clickContinueShoppingButton();
	}

}
