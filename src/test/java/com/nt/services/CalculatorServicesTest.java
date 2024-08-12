package com.nt.services;
/*
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;
import com.nt.test.CalculaterService;

@SuppressWarnings("deprecation")
public class CalculatorServicesTest //JUnitTest-4
{	
	int counter = 0;
	
	@BeforeClass
	public static void init() {
		System.out.println("Before Case Executed : "+java.time.LocalDateTime.now());
	}
	
	
	@Before
	public void beforeEach() {
		System.out.println("Before each testcase!");
		counter = 0;
	}
	
	@Test(timeout = 4000)
	public void addTwoNumbersTest() throws InterruptedException {
		for(int i=0;i<11;i++) {
			counter+=i;
		}
		Thread.sleep(3000);
		
		System.out.println("addTwoNumbersTest Method Executed");
		int result = CalculaterService.addTwoNumber(12, 45);
		int expected = 57;
		System.out.println("Counter value first test case : "+counter);
		Assert.assertEquals(expected ,result);
	}
	
	
	@Test
	public void sumAnyNumberTest() {
		System.out.println("sumAnyNumberTest Method Executed");
		int result = CalculaterService.sumAnyNumbers(1,2,3,4,5,6,7,8,9);
		int expected = 45;
		System.out.println("Counter value second test case : "+counter);
		Assert.assertEquals(expected, result);
	}
	
	@AfterClass
	public static void cleanUp() {
		System.out.println("After Case Executed  : "+java.time.LocalDateTime.now());
	}
}
*/