package com.masai.day4.q1;

public class Demo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student("priyo", 0004, 28, 90);
		
		s1.setName("banik");
		s1.setRoll(007);
		s1.setMarks(499);
		s1.setAge(30);
		
		for(int i=0;i<1;i++) {
			
			System.out.println("student name is "+s1.getName());
			System.out.println("student roll is "+s1.getRoll());
			System.out.println("student marks is "+s1.getMarks());
			System.out.println("student age is "+s1.getAge());
			System.out.println("---------------------------------------------");
			
			
			System.out.println("student name is "+s2.getName());
			System.out.println("student roll is "+s2.getRoll());
			System.out.println("student marks is "+s2.getMarks());
			System.out.println("student age is "+s2.getAge());
		}
	

	}

}
