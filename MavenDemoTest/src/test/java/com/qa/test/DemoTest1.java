package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest1 {

	@Test
	public void test5() {
		System.out.println("Validate logout button");
		/*
		 * System.setProperty("webdriver.gecko.driver", "C://WebDrivers"); WebDriver
		 * driver = new FirefoxDriver(); driver.get("google.com");
		 */
	}

	@Test
	public void test6() {
		int a = 10;
		int b = 10;
		Assert.assertEquals(a, b);
		System.out.println("Validate that user is logout");
	}
}
