package com.masai.day6.q4;

public class Fact {

	public static void main(String[] args) {
		
		
		if(args.length==2) {
			
			
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			
			int diff=Math.abs(a-b);
			
			int fact=1;
			
			for(int i=1;i<=diff;i++) {
				
				fact=fact*i;
				
			}
			System.out.println(fact);
			
		}
		else if(args.length==1) {
			int c=Integer.parseInt(args[0]);
			
            int fact=1;
			
			for(int i=1;i<=c;i++) {
				
				fact=fact*i;
				
			}
			System.out.println(fact);
		}
		else {
			System.out.println("Error");
		}

	}

}
