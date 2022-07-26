package com.masai.day6.q3;

public class Primeno {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		
		int[] array=new int[inputArray.length];
		
		for(int a=0;a<inputArray.length;a++) {
			int count=0;
			for(int b=2;b<inputArray[a];b++) {
				if(inputArray[a]%b==0) {
					count++;
				}
			}
				if(count==0) {
					array[a]=inputArray[a];
				}
			
			
		}
		return array;
		
	}
	
	
		public static void main(String[] args){
		
		int[] arr = {10,12,5,50,11,14,15};
		
		
		Primeno p1=new Primeno();
		
		int[] result=p1.findAndReturnPrimeNumbers(arr);
		
		int count=0;
		for(int i=0;i<result.length;i++) {
			if(result[i]>0) {
				count++;
				System.out.println(result[i]);
			}
		}
		if(count==0) {
			System.out.println("Prime number not found in Supplied Array");
		}
	
	}

}
