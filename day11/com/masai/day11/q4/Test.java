package com.masai.day11.q4;

import java.util.Scanner;

public class Test implements Intr {

	@Override
	public int[] display(int p) {

	int[] arr=new int[p];
	
	
	for(int a=2;a<p;a++) {
		int count=0;
		for(int b=2;b<a;b++) {
			if(a%b==0) {
				count++;
			}
		}
		if(count==0) {
			arr[a]=a;
			
		}
	}
	return arr;
}
}

	class Main{
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			Test t=new Test();
			System.out.println("enter the number" );
			int[] arr= t.display(sc.nextInt());
			
			for(int i=2;i<arr.length;i++)
			{	
				if(arr[i]!=0) {
					System.out.println(arr[i]);
				}
		
		}
	}
				
}
	
	
