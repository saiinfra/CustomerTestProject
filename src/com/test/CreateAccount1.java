package com.test;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TS_000000073() throws Exception {
		System.out.println(name.getMethodName());

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@DeployerDev.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome123");
		driver.findElement(By.id("Login")).click();

	}

	@Test
	public void TS_000000074() throws Exception {
		System.out.println(name.getMethodName());

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@DeployerDev.com");

	}

	@Test
	public void TS_000000075() throws Exception {
		System.out.println(name.getMethodName());

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@DeployerDev.com");
		System.out.println(name.getMethodName());

	}

	@Test
	public void TS_000000076() throws Exception {
		System.out.println(name.getMethodName());

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@DeployerDev.com");
		System.out.println(name.getMethodName());

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
