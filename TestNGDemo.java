package com.sample.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	WebDriver driver;

	 @BeforeTest
	    public void Setup()
		  {
		
		        driver = new ChromeDriver();
		        
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        driver.get("http://facebook.com");

		        driver.manage().window().maximize();
		  }
	 @Test
		public void login()
		 {
		      //Enter email field
			 driver.findElement(By.id("email")).sendKeys("abc");
			 //Enter Password
			 driver.findElement(By.id("pass")).sendKeys("abc123");
			 //Click on login
			 driver.findElement(By.id("u_0_2")).click();
		 }
		        
		        
	 @AfterTest
		 public void Close()
		    {
          	//close the browser
		      driver.close();
		      }

}
