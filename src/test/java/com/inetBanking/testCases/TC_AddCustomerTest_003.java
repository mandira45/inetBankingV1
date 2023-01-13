package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setuserName(userName);
		Log.info("User name is provided");
		lp.setPassword(password);
		Log.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		
		if (isAlertPresent() == true) {
			driver.switchTo().alert().dismiss();// close alert
			driver.switchTo().defaultContent();
		
		}
	

		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		Log.info("providing customer details....");
		
		
		addcust.custName("Pavan");
		addcust.custgender("male");
		addcust.custdob("10","15","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		

		if (isAlertPresent() == true) {
			driver.switchTo().alert().dismiss();// close alert
			driver.switchTo().defaultContent();
		
		} 

	}

	public boolean isAlertPresent() // user defined method created to check alert is present or not
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
			
	}
	
	
}