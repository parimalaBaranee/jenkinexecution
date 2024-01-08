package com.test.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.basepage.BaseTest;
import com.test.testcases.LoginPage;



public class LoginsearchTest  extends BaseTest{
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		loginpage= new LoginPage(driver);  // Passing the driver to find element
		
	}
	
	
	@Test
	public void login() {
		//To check username and password and login successfully
		System.out.println("********Tc02Login vaid username and password **start******");
		loginpage.entersearch("how to write testcase");
	
		System.out.println("Successfully Entered Username");
		
		
		System.out.println("Successfully Logged");
	System.out.println("*************TC02 Login *****End*************");
	}

	
	@AfterMethod
	public void teardown() {
		close();
	
		}

}


