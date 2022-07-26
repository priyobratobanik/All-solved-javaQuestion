package com.masai.day8.q3;

public class Animal {

	public void makeNoise() {
		System.out.println("Animal making Noise");
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void walk(){
		System.out.println("Animal is walking");
	}
	
}
 	class Dog extends Animal{

		@Override
		public void makeNoise() {
			System.out.println("Barking.....");
		}
 	}
 	
 	class Cat extends Animal{

 		@Override
		public void makeNoise() {
			System.out.println("Meaw.....");
		}
 	}
 	
 	class Tiger extends Animal{

		@Override
		public void makeNoise() {
			System.out.println("Raoring....");
		}
 	}
 	
 	class Main{
 		public static void main(String[] args) {
			Animal[] animals=new Animal[3];

			animals[0]=new Dog();
			
			animals[1]=new Cat();
			
			animals[2]=new Tiger();
			
			
			for(int i=0;i<animals.length;i++) {
				
				animals[i].eat();
				animals[i].walk();
				animals[i].makeNoise();
				System.out.println("=================");
				
				
			}
			
 }
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	