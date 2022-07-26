package com.masai;

public class StudentObj {
	int roll;
	String name;
	int marks;
	
	void displayStudentsDetails(int roll,String name,int marks) {
		
		System.out.println("Roll no is :"+ roll);
		
		System.out.println("Name is :"+ name);
		
		System.out.println("Marks is:"+ marks);

	}
	
	public static void main(String[] args) {
		StudentObj data = new StudentObj();
		data.roll = 4;
		data.name = "Banik";
		data.marks = 90;
		data.displayStudentsDetails(data.roll,data.name,data.marks);
		
		System.out.println("----------------------------");
		data.roll = 469;
		data.name = "Priyo";
		data.marks = 100;
		data.displayStudentsDetails(data.roll,data.name,data.marks);
		
		//System.out.println("Garbage done");
	}

}
