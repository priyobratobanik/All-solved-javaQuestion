package com.masai.day8.q1;

public class Bird {
	void fly() {
		System.out.println("Bird is flying");
	}
	
}
 	class Parrot extends Bird{

		@Override
		void fly() {
			System.out.println("I am Flying");
			
		//	super.fly();
		}
		public void sing() {
			System.out.println("I am singing");
		}
		
 	}
 	class main{
 	public static void main(String[] args) {
		
 		Bird b1=new Parrot();
 		b1.fly();
 		
 		Parrot p1=(Parrot) b1;
 		p1.sing();
 		
 		
 		
 		
 		
	}
 	}
 	
