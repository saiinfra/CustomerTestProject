package com.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class TS_000000075 {
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
		driver.get("https://login.salesforce.com/"  );
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("skrishna@developertest.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("infrascape4");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("tsidLabel")).click();
		driver.findElement(By.linkText("Sales")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys("srikanth");
		driver.findElement(By.name("save")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
