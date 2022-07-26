package com.masai.day9.q2;

public class Parent {

	final int number;
	
	 
	
	 Parent(int number) {
		
		this.number = number;
	}

	void method1() {
		
		System.out.println("method1 of parent class");
		System.out.println("number "+this.number);
	}
	
	final void method2() {
		System.out.println("method2 of parent class");
		
	}
	void method3() {
		System.out.println("method3 of parent class");
		
	}
}
