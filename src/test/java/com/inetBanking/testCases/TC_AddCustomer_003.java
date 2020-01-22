package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.Loginpage;
import com.inetBanking.pageObjects.AddCustomerPage;

public class TC_AddCustomer_003 extends BaseClass
{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.CustName("Sunil");
		addcust.CustGender("male");
		addcust.Custdob("11","10","1970");
		Thread.sleep(3000);
		addcust.CustAddress("India");
		addcust.CustCity("HYD");
		addcust.CustState("AP");
		addcust.CustPin("500074");
		addcust.CustPhone("1010101010");		
		String email=randomstring()+"@gmail.com";
		addcust.CustEmail(email);		
		addcust.CustPassword("abcde");
		addcust.CustSubmit();
		
		Thread.sleep(3000);
		
		Boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res==true)
		{
			Assert.assertTrue(true);			
		}
		else
		{
			captureScreen(driver,"AddNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	public String randomstring()
	{
	String generatedstring=RandomStringUtils.randomAlphabetic(8);
	return (generatedstring);
		
		
	}


	

}


