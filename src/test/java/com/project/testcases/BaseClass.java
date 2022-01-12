package com.project.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseurl = "http://demo.guru99.com/V1/index.php";
	public String username="mngr373446";
	public String password="dAzEhej";
	public static WebDriver driver;
	
	public static Logger logger;
	@BeforeClass
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		logger =Logger.getLogger("e-banking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}
