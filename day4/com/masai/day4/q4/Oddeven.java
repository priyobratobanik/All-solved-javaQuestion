package com.masai.day4.q4;

import java.util.Scanner;

public class Oddeven {
	
	void calculation(int i) {
		if(i%2==0) {
			System.out.println(((i/10)+1)*10);
		}
		else if(i%2==1) {
			System.out.println(i);
		}
		else {
			System.out.println("Error");
		}
	}
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Oddeven oo=new Oddeven();
		System.out.println("enter a number");
		oo.calculation(sc.nextInt());
		
		

	}

}
