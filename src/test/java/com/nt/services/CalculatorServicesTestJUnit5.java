package com.nt.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.nt.test.CalculaterService;

public class CalculatorServicesTestJUnit5 {
	
	@BeforeAll
	public static void inti() {
		System.out.println("This is single time logic.");
	}
	
	@BeforeEach
	public void beforeEachTestCase() {
		System.out.println("Before Each Test Case.");
	}
	
	@AfterEach
	public void afterEachTestCase() {
		System.out.println("After Each Test Case.");
	}
	
	
	@Test
	@DisplayName("This is custom name")
	public void addTwoNumbersTest() {
		System.out.println("First test case.");
		int expected = 24;
		int result = CalculaterService.addTwoNumber(12, 12);
		Assertions.assertEquals(expected, result,"Test failed reslove the error.");
	}
	
	@Test
	@Disabled // Ignore the test case
	public void addAnyNumberTest() {
		System.out.println("Second test case.");
		final int expected = 49;
		int result = CalculaterService.sumAnyNumbers(12,12,12,12);
		Assertions.assertEquals(expected, result,"Test faild reslove the bug.");
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("After all test case logic.");
	}
}