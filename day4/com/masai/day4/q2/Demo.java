package com.masai.day4.q2;

public class Demo {
	
	 Demo() {
		System.out.println("this is a non paramiterized constructor");
	}
	 Demo(int i){
		 System.out.println("this is integer paramiterized constructor");
	 }
	 Demo(String S){
		 System.out.println("this is String paramiterized constructor");
	 }
	 Demo(Float f){
		 System.out.println("this is float paramiterized constructor");
	 }
	 
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo=new Demo("priyo");
		demo=new Demo(40);
		demo=new Demo(2.00f);
	}

}
