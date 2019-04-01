package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class SimpleTest {

	
	@Before
	public void beforeTestMethod() {
		System.out.println("Inside beforeTestMethod");
	}
	@BeforeClass
	public void first() {
		System.out.println("Inside first");
	}
	
	
	@Test
	public void test() {
		assertEquals(200, Simple.mul(10, 20));
		System.out.println("Inside Test");
	}
	
	@After
	public void afterTestMethod() {
		System.out.println("Inside afterTestMethod");
	}

	
	@AfterClass
	public void last() {
		System.out.println("Inside last");
	}
	
}
