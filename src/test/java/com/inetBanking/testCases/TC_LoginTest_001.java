package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.Loginpage;

public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
	
		logger.info("URL is opened");
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);		
		logger.info("Entered username");
		lp.setPassword(password);
		
		logger.info("Entered password");
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			
		{
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Testcase failed");
		}
		
		
	}
}
