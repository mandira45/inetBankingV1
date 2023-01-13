package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.log4j.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException  {

		driver.get(baseURL);
		
		Log.info("Url is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setuserName(userName);
		Log.info("Username has been entered");
		
		lp.setPassword(password);
		Log.info("password has been entered");
		
		lp.clickSubmit();
		
		//System.out.println(driver.getTitle());

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Log.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
			Log.info("Login test failed");
		}

	}
}
