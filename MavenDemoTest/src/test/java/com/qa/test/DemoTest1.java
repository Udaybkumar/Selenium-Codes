package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest1 {

	@Test
	public void VeidateIntegers() {
		int a = 200;
		int b = 100;
		if(a>b) {
		System.out.println("Its true ,a is grater then b");
		}
		
	}

	
	@Test
	public void test6() {
		int a = 10;
		int b = 10;
		Assert.assertEquals(a, b);
		System.out.println("Validate that user is logout");
	}
}
