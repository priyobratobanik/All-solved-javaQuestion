package com.masai.day9.q1;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student() {
		
	}


	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	

	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayDetails(Student s) {
		System.out.println("student roll is "+s.getRoll());
		System.out.println("student name is "+s.getName());
		System.out.println("student marks is "+s.getMarks());
		
		char grade=s.calculateGrade(s.getMarks());
		
		System.out.println("student grade is "+grade);
		
		System.out.println(s.toString());
		System.out.println("========================================");
		
		
	}
	
	private char calculateGrade(int marks) {
		
		if(marks>=500) {
			return 'A';
			
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		 else if(marks<400) {
			return 'C';
		}
		 else {
			 return 'D';
		 }
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
