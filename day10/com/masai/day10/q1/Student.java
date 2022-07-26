package com.masai.day10.q1;

import java.util.Scanner;

abstract public class Student {

	String name;
	String address;
	
	abstract void Percentage();

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
}
	class ScienceStudent extends Student{
		 
		public ScienceStudent(String name, String address, int phicicsMarks, int chemMarks, int mathsMarks) {
			super(name, address);
			PhicicsMarks = phicicsMarks;
			this.chemMarks = chemMarks;
			this.mathsMarks = mathsMarks;
		}


		int PhicicsMarks;
		int chemMarks;
		int mathsMarks;
		
		
		@Override
		void Percentage() {
			int total=300;
			
			int ssmarks=PhicicsMarks+chemMarks+mathsMarks;
			
			double percentage=ssmarks*100/total;
			
			System.err.println("percentage of Science student  marks is---> "+percentage);
			
		}
		
	}
	
	    class HistoryStudent extends Student{
		
		int historyMarks;
		int civicsMarks;
		
		
		
		    public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
			super(name, address);
			this.historyMarks = historyMarks;
			this.civicsMarks = civicsMarks;
		}



		@Override
		void Percentage() {
            int total=200;
			
			int ssmarks=historyMarks+civicsMarks;
			
			double percentage=ssmarks*100/total;
			
			System.err.println("percentage of History student  marks is---> "+percentage);
			
		}
		
	}
	class AllStudents{
		
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Enter Science Student name,address,Physicsmarks,chemistrymarks,mathmarks respectively--->");
			
			ScienceStudent ss=new ScienceStudent(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			
			System.out.println("Enter History Student name,address,Historysmarks,Civicsmarks respectively ----->");
			
			HistoryStudent hs=new HistoryStudent(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
			
			
			System.out.println("student name is --->"+ss.name);
			System.out.println("student address is ---> "+ss.address);
			System.out.println("student PhysicsMarks is --->"+ss.PhicicsMarks);
			System.out.println("student PhysicsMarks is --->"+ss.chemMarks);
			System.out.println("student PhysicsMarks is --->"+ss.mathsMarks);
			
			ss.Percentage();
			
			System.out.println("====================================================");
			
			System.out.println("student name is---> "+hs.name);
			System.out.println("student address is --->"+hs.address);
			System.out.println("student HistoryMarks is---> "+hs.historyMarks);
			System.out.println("student CivicsMarks is --->"+hs.civicsMarks);
			
			
			hs.Percentage();
			
			
			
			
			
			
			
			
			
		}
	}
	
	
	
