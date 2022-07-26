package com.masai.day9.q1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter student 1 details===>roll,name and marks");
		
		Student s1=new Student(scanner.nextInt(),scanner.next(),scanner.nextInt());
		
		s1.displayDetails(s1);
		
		System.out.println("enter student 2 details===>roll,name and marks");
		
		Student s2=new Student();
		
		s2.setRoll(scanner.nextInt());
		s2.setName(scanner.next());
		s2.setMarks(scanner.nextInt());
		
		s2.displayDetails(s2);
		

	}

}
