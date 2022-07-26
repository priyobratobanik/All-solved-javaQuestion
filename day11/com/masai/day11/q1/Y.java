package com.masai.day11.q1;

public interface Y {

	
    abstract void fun1Y();
	
	default void fun2Y() {
		System.out.println("this is default funtion 2y of interface Y");
		
	}
	static void fun3Y() {
		System.out.println("this is static function 3y of interface Y");
		
	}
}
