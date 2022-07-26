package com.masai.day7.q3;

import java.util.Scanner;

public class Student {
	
	int roll;
	String name;
	String address;
	Integer marks;
	public Student(int roll, String name, String address, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	
}

class Demo{
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of students===>");
		
		Student[] s=new Student[scanner.nextInt()];
		
		for(int a=0;a<s.length;a++) {
			System.out.println("enter student roll,name,address and marks respectively===>");
			s[a]=new Student(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
			
			System.out.println("=================================================");
		
		}
		
		int sum=0;
		for(int b=0;b<s.length;b++) {
			System.out.println("student roll is ====>"+s[b].roll);
			System.out.println("student name is====>"+s[b].name);
			System.out.println("student address is ====>"+s[b].address);
			System.out.println("student marks is====>"+s[b].marks);
			
			sum+=s[b].marks;
			System.out.println("-------------------------------------------------------");
			
			
		}
		int average=sum/s.length;
		System.out.println("average of all Student marks is "+average);
		
		
		
		
	}
}
