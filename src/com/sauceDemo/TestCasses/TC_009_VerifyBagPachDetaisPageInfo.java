package com.sauceDemo.TestCasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.ProductInfoPagePOMClass;

public class TC_009_VerifyBagPachDetaisPageInfo extends TestBaseClass
{
	@Test
	public void verifyBagProductInfo() 
	{
		HomePagePOMClasss hp =new HomePagePOMClasss(driver);
		
		hp.clickBackpachImagek();
		
		ProductInfoPagePOMClass pi=new ProductInfoPagePOMClass(driver);
		
		String ExpectedResult ="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		String ActualResult = pi.getTextFromProductInfoPage();
		Assert.assertEquals(ExpectedResult, ActualResult);
		pi.clickBackToProductsButton();
	}

}
