package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest1 {

	@Test
	public void test5() {
		int a = 20;
		int b = 20;
		Assert.assertEquals(a, b);
		System.out.println("Validate that user is logout");
		
	}

	
	@Test
	public void test6() {
		int a = 10;
		int b = 10;
		Assert.assertEquals(a, b);
		System.out.println("Validate that user is logout");
	}
}
