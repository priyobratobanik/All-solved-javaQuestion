package com.masai.day11.q1;

public interface X {

	abstract void fun1X();
	
	default void fun2X() {
		System.out.println("this is default function 2x of interface X ");
		
	}
	static void fun3X() {
		System.out.println("this is static function 3x of interface X");
	}
	
}
