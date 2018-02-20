package com.ck.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrintString {
	PrintString printString;

	@Test
	public void testPrintString() {
		// actual,expected!
		assertEquals("helloworld", printString.printGivenStringInLower("HelloWorld"));
	}

	@Test
	public void testIsLengthOfStringEven() {
		assertTrue(printString.isLengthOfStringEven("abcd"));
		assertFalse(printString.isLengthOfStringEven("abc"));
	}
	
	@Before
	public void before() {
		// Do all common functionality before each test here!
		printString = new PrintString();
	}

	@After
	public void after(){
		//Do all common functionality after each test!
		printString=null;
	}
	
	@BeforeClass
	public static void staticBefore() {
		// Executed once per class before the first test!
	}
	
	@AfterClass
	public static void staticAfter() {
		// Executed once per class after the last test!
	}
	
}
