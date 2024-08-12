package com.nt.test;
class A{
	public void m1() {
		System.out.println("M1");
	}
}

class B extends A {
	public void m2() {
		System.out.println("M2");
	}
}

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        B ob = new B();
        ob.m1();
        ob.m2();
    }
}