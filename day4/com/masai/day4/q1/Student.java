package com.masai.day4.q1;

public class Student {
	private String name;
	private int roll;
	private int age;
	private int marks;
	
	
	public Student() {
		super();
	}
	public Student(String name, int roll, int age, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.marks = marks;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
		else {
			System.out.println("enter valid age");
		}
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
		else {
			System.out.println("enter valid marks");
		}
	}
	
	
	
	
	
}
