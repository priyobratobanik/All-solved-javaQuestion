package com.masai.day9.q3;



public class Person {

	String name;
	String gender;
	Address address;
	
}
class Address{
	String city;
	String state;
	String pinCode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
class Instructor extends Person{
	int instrucorId;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instrucorId=" + instrucorId + ", salary=" + salary + ", name=" + name + ", gender=" + gender
				+ ", address=" + address + "]";
	}
	
	
	
}
class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
}
class Main{
	
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			Student s=new Student();
			s.name="Biswa";
			s.courseFee=7000;
			s.courseEnrolled="ja111";
			s.gender="male";
			s.studentId=1;
			s.address=new Address();
			s.address.city="alipurduar";
			s.address.pinCode="736121";
			s.address.state="wb";
			return s;
		}
		else {
			Instructor i=new Instructor();
			i.name="Ratan";
			i.gender="Female";
			i.instrucorId=01;
			i.salary=20000;
			i.address=new Address();
			i.address.city="jpg";
			i.address.pinCode="736151";
			i.address.state="wb";
			return i;
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Person stu1=generatePerson(new Student());
		

		
		Person in1=generatePerson(new Instructor());
		
		System.out.println(stu1.toString());
		
		System.out.println(in1.toString());
		
	}
}


