package com.masai.day6.q1;

import java.util.Scanner;

public class Main {
	
	
		public static String reversString(String input){
			
			char[] arr=input.toCharArray();
			String result="";
			
			for(int x=arr.length-1;x>=0;x--) {
				result+=arr[x];
				
			}
			
			return result;
			
		}
	

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
	}

}
