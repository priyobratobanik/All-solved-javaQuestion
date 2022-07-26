package com.masai.day10.q2;

abstract public class Shape {

	abstract int rectangleArea(int length, int breadth);
	abstract int squareArea(int side);
	abstract int circleArea(int radius);
	
}

class Area extends Shape{

	@Override
	int rectangleArea(int length, int breadth) {
		int recArea=length*breadth;
		return recArea;
	}

	@Override
	int squareArea(int side) {
		int sqArea=side*side;
		return sqArea;
	}

	@Override
	int circleArea(int radius) {
		double cirArea=3.14*radius*radius;
		return (int) cirArea;
	}
	
}
class Main{
	public static void main(String[] args) {
		
		
		Area area=new Area();
		int area1=area.rectangleArea(30, 20);
		int area2=area.squareArea(40);
		int area3=area.circleArea(10);
		
		System.out.println("area of rectangle is "+area1);
		System.out.println("area of square is "+area2);
		System.out.println("area of circle is "+area3);
		
	}
}



