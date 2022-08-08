package com.sauceDemo.TestCasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void logoutFunctionality() 
	{
		String EPTital = "Swag Labs";
		String ACTitle =driver.getTitle();
		Assert.assertEquals(EPTital, ACTitle);
	    
		
	}
}
