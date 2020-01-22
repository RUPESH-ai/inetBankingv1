package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME,using="name")
	@CacheLookup
	WebElement txtCustName;

	@FindBy(how=How.NAME,using="rad1")
	@CacheLookup
	WebElement reGender;
	
	@CacheLookup
	@FindBy(how=How.ID_OR_NAME,using="dob")	
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(how=How.NAME,using="addr")	
	WebElement txtAddress;
	
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how=How.NAME,using="pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how=How.NAME,using="telephoneno")
	@CacheLookup
	WebElement txtTelno;
	
	@FindBy(how=How.NAME,using="emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement txtPwd;
	
	@FindBy(how=How.NAME,using="sub")
	@CacheLookup
	WebElement BtnSubmit;
	
	
	public void clickAddNewCustomer()		
	{
		lnkAddNewCustomer.click();
	}
	public void CustName(String cname)		
	{
		txtCustName.sendKeys(cname);
	}
	public void CustGender(String cgender)		
	{
		reGender.click();
	}
	public void Custdob(String mm,String dd,String yy)
	{		
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	public void CustAddress(String caddress)		
	{
		txtAddress.sendKeys(caddress);
	}
	public void CustCity(String ccity)		
	{
		txtCity.sendKeys(ccity);
	}
	public void CustState(String cstate)		
	{
		txtState.sendKeys(cstate);
	}
	public void CustPin(String cpin)		
	{
		txtPin.sendKeys(cpin);
	}
	
	public void CustPhone(String cphone)		
	{
		txtTelno.sendKeys(cphone);
	}
	public void CustEmail(String cemail)		
	{
		txtEmail.sendKeys(cemail);
	}
	
	public void CustPassword(String cpwd)		
	{
		txtPwd.sendKeys(cpwd);
	}
	public void CustSubmit()		
	{
		BtnSubmit.click();
	}	


	
	
}
