package com.masai.day9.q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter number from 1 to 10");
		
		
		int n=scanner.nextInt();
		
		if(n>=1 && n<=10) {
			Parent p1=new Child(n);
			p1.method1();
			p1.method2();
			p1.method3();
			
			Child c1=(Child)p1;
			c1.method4();
		}
		else {
			System.out.println("enter a valid number");
		}
		
		

	}

}
