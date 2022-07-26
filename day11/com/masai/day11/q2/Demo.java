package com.masai.day11.q2;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
			if(amount >1000) {
				return new TajHotel();
				
			}
			else if(amount>200 && amount <1000){
				return new RoadSideHotel();
				
				
			}
			return null;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("enter the amount");
		
		Demo d=new Demo();
		Hotel orderamount=d.provideFood(sc.nextInt());
		
		if(orderamount instanceof TajHotel) {
			orderamount.chickenBiriyani();
			orderamount.masalaDosa();
			TajHotel xxHotel=(TajHotel) orderamount;
			xxHotel.welcomeDrink();
		}
		else if (orderamount instanceof RoadSideHotel) {
			orderamount.chickenBiriyani();
			orderamount.masalaDosa();
		}
		else {
			System.out.println("please enter a valid amount");
		}
		
		
		
		
	}
	
}

