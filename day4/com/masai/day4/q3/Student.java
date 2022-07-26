package com.masai.day4.q3;

import java.util.Scanner;

public class Student {
	 String name;
	 int roll;
	 String collegeName="NIT";
	 String address;
	 
	 
	 
	 
	 
	public Student(String name, int roll, String collegeName, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.collegeName = collegeName;
		this.address = address;
	}


	public Student(String name, int roll, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			return new Student("Biswa", 02, "apd");
			
		}
		else {
			return new Student("priyo", 0004,  "bppimt","apd");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("are you from NIT?");
		Student s1=getStudent(scanner.nextBoolean());
		//s1.setCollegeName("NIT");
		
		System.out.println("student name---"+s1.getName());
		System.out.println("college name---"+s1.getCollegeName());
		System.out.println("Address is---"+s1.getAddress());
		System.out.println("Roll is ---"+s1.getRoll());
		
		
		System.out.println("-------------------------------------------------------------");
		
		
		//System.out.println("are you from NIT?");
		//Student s2=getStudent(scanner.nextBoolean());
		System.out.println("student name---"+s1.getName());
		System.out.println("college name---"+s1.getCollegeName());
		System.out.println("Address is---"+s1.getAddress() );
		System.out.println("Roll is ---"+s1.getRoll());
		
	}
}
