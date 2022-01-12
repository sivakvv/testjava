package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.pageobjects.LoginPage;

public class TC001_LoginPage extends BaseClass{

	@Test
	public void logintest(){
		driver.get(baseurl);
		driver.manage().window().maximize();
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("Username entered");
		
		lp.setpassword(password);
		logger.info("Password entered");
		
		lp.clicksubmit();
		logger.info("clicked on login");
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")){
			Assert.assertTrue(true);
			logger.info("Logintest Passed");
		}
		else{
			Assert.assertTrue(false);
			logger.info("Logintest Failed");
		}
	}
}
