package com.test.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.basepage.BasePage;



public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath=("//textarea[@id='APjFqb']"))WebElement Search;	
		
		
		public void entersearch(String strusername) {
			
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.presenceOfElementLocated(Search);
			 waitforElement(Search,20);
			Search.sendKeys(strusername);
			Search.sendKeys(Keys.ENTER);
			
			
			//driver.findElement(By.xpath("//*[@id='input']")).sendKeys("Test"); 
			//driver.findElement(By.xpath("//*[@id='input']/span")).click(); 
		}
		
	
		
	}
	
	

