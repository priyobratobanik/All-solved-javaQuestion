package com.masai.day6.q2;

public class Evensummatrix {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6,},{7,8,9}};
        
		for(int x=0;x<arr.length;x++) {
			
			int sum=0;
			for(int y=0;y<arr[x].length;y++) {
				if(arr[y][x]%2==0) {
					sum+=arr[y][x];
				}
			}
			System.out.println(sum);
		}
		
	}

}
