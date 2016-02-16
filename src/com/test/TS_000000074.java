package com.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class TS_000000073 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

@Before
public  void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "null";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Login to Salesforce() throws Exception{
		driver.get(baseUrl);
		driver.findElement(By.id("Login")).click();
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
package com.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class TS_000000074 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

@Before
public  void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "null";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Click on Accounts Tab() throws Exception{
		driver.get(baseUrl);
		driver.findElement(By.id("Login")).click();
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
