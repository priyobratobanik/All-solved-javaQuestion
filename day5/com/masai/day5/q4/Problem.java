package com.masai.day5.q4;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String c=sc.next();
		
		System.out.println("enter the position");
		int value=sc.nextInt();
		
		
		char result=c.charAt(value);
		System.out.println(result);
		

	}

}
