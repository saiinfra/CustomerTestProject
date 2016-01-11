package com.test;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://login.salesforce.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCreateAccount() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("anand@developtest.com");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome12");

		driver.findElement(By.id("Login")).click();

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys("Test Account SN3");
		new Select(driver.findElement(By.id("acc14")))
				.selectByVisibleText("Private");
		new Select(driver.findElement(By.id("acc6")))
				.selectByVisibleText("Customer - Direct");
		driver.findElement(By.id("acc17street")).clear();
		driver.findElement(By.id("acc17street")).sendKeys("123 Main Street");
		driver.findElement(By.id("acc17city")).clear();
		driver.findElement(By.id("acc17city")).sendKeys("Worcester");
		driver.findElement(By.id("acc17state")).clear();
		driver.findElement(By.id("acc17state")).sendKeys("MA");
		driver.findElement(By.name("save")).click();
		driver.findElement(By.name("save")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
