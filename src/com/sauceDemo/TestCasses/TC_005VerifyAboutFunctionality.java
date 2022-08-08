package com.sauceDemo.TestCasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;

public class TC_005VerifyAboutFunctionality extends TestBaseClass
{
	@Test
	public void aboutFunctionality() throws InterruptedException 
	{
		HomePagePOMClasss hp=new HomePagePOMClasss(driver);
		hp.clickOpenManuButton();
		hp.clickAboutButton();
		String ActualResult = hp.getTitelFromNewPage();
		String ExpectedResult="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(ExpectedResult, ActualResult);
		driver.navigate().back();
	}
	

}
