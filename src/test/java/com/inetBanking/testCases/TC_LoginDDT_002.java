package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Loginpage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(user);
		System.out.println(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		if (isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn("Loggin failed");
			Assert.assertTrue(false);
			
			
		}
		else
		{
			Assert.assertTrue(true);
			logger.warn("Loggin passed");
			lp.clickLogout();			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}	
		
		
	}
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
			
		}catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\inetBanking\\testData\\LoginData.xlsx";
		System.out.println("Path is:"+ path);
		//String path=System.getProperty("testData\\LoginData.xlsx");	
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1",1);
	    //System.out.println(rownum);	
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1",i,j);		
				System.out.println(logindata[i-1][j]);
				
				
			}			
		}
		return logindata;
		
	}	

}
