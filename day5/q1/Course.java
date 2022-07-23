package com.masai.day5.q1;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	void displayCourseDetails() {
		System.out.println("course name -----"+courseName);
		System.out.println("course id----" +courseId);
		System.out.println("course fee----"+courseFee);
		
	}
	static void authenticate(String username,String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Course c=new Course();
			c.courseId=111;
			c.courseFee=3000;
			c.courseName="dsa";
			
			c.displayCourseDetails();
			
		}
		else {
			System.out.println("invalid username or password");
		}
		
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		
		
		authenticate(username, password);
		System.out.println("enter username and password again");
		authenticate(sc.next(), sc.next());
		
		
	}
}
