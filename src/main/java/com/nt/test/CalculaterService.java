package com.nt.test;
public class CalculaterService 
{
	public static int addTwoNumber(int a , int b) {
		return a + b;
	}
	
	public static int product(int a , int b) {
		return a * b;
	}
	
	public static int division(int a , int b) {
		return a / b;
	}
	
	public static int sumAnyNumbers(int ...num) {
		int s = 0;
		for(int x : num) {
			s+=x;
		}
		return s;
	}
}