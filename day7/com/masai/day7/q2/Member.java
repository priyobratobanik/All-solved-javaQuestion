package com.masai.day7.q2;

public class Member {
	
	String name;
	int age;
	String phone_number;
	String address;
	Double salary;
	
	
	void printSalary() {
//		System.out.println("salary is "+salary);
	}
	
}

class Employee extends Member{
	String specialisation;
	String department;
	
	
	@Override
	void printSalary() {
		System.out.println("Employee salary is "+salary);
		super.printSalary();
	}
	
	
	
	
	
}


class Manager extends Member{
	
	String specialisation;
	String department;
	@Override
	void printSalary() {
		System.out.println("manager salary is "+salary);
		super.printSalary();
	}
	
	
	
}

class Main{
public static void main(String[] args) {
	Manager m1=new Manager();
	Employee e1=new Employee();
	
	m1.name="Priyobrato";
	m1.age=28;
	m1.phone_number="6294227253";
	m1.address="apd";
	m1.salary=5000.0;
	
	m1.specialisation="database";
	m1.department="cyber";
	
	System.out.println("Manager name----"+m1.name);
	System.out.println("Manager age---"+m1.age);
	System.out.println("Managers number----"+m1.phone_number);
	System.out.println("managers addres---"+m1.address);
    m1.printSalary();
	System.out.println("Managers specialization---- "+m1.specialisation);;
	System.out.println("managers depertment-----"+m1.department);
	
	
	System.out.println("==========================================");
	
	
	e1.name="Biswadeep";
	e1.age=27;
	e1.phone_number="629424665";
	e1.address="bgl";
	e1.salary=6000.0;
	
	e1.specialisation="frontend";
	e1.department="front office";
	
	System.out.println("Manager name----"+e1.name);
	System.out.println("Manager age---"+e1.age);
	System.out.println("Managers number----"+e1.phone_number);
	System.out.println("managers addres---"+e1.address);
	e1.printSalary();
	System.out.println("Managers specialization---- "+e1.specialisation);;
	System.out.println("managers depertment----"+e1.department);
	
	
	
	
	
}
}
