package com.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class CreateAccount1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StmappingClassNameringBuffer verificationErrors = new StringBuffer();

@Before
public  void setUp() throws Exception {
	driver = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void TS_000000073() throws Exception{
		driver.get("https://login.salesforce.com/"  );
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@DeployerDev.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome123");
		driver.findElement(By.id("Login")).click();
	}

	@Test
	public void TS_000000073_Execute() throws Exception{
TS_000000073();

	public void TS_000000074() throws Exception{
		driver.findElement(By.id("tsidLabel")).click();
	}

	@Test
	public void TS_000000074_Execute() throws Exception{
TS_000000073();
TS_000000074();

	public void TS_000000075() throws Exception{

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
