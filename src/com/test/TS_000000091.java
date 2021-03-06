package com.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class TS_000000091 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

@Before
public  void setUp() throws Exception {
	driver = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test () throws Exception{
		driver.get("https://login.salesforce.com"  );
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("skrishna@developertest.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("infrascape5");
		driver.findElement(By.id("Login")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
