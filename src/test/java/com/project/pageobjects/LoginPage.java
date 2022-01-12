package com.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public void setusername(String uname){
		txtusername.sendKeys(uname);
	}
	
	public void setpassword(String pwd){
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit(){
		login.click();
	}
}
