package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{ 
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;

	
	
	
	public void setUserName(String uname ) throws InterruptedException
	{
	
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd) throws InterruptedException
	{
	
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit( )
	{
		btnLogin.click();
	}
	public void clickLogout( )
	{
		lnkLogout.click();
	}
}
