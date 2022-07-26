package com.masai.day9.q2;

public final  class Child extends Parent {

	Child(int number){
		super(number);
		
	}
	
	@Override
	void method1() {
		
		System.out.println("method 1 of child class");
		System.out.println("Number is ==>"+this.number);
	}
	void method4() {
	
		System.out.println("method 4 of child class");
		
	}
	
	
}
