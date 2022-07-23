package com.masai.day5.q3;


public class Shape {

	public void area(Circle circle) {
		double area=3.14*circle.radius*circle.radius;
		System.out.println("circle area is "+area);
		
	}
	public void area(Rectangle rectangle) {
		double area=rectangle.length*rectangle.breadth;
		System.out.println("rectangle area is "+area);
	}
	public void area(Square square) {
		double area=square.side*square.side;
		System.out.println("square area is "+area);
	}	
}
class Circle{
	int radius=20;
	
}
class Rectangle{
	int length=10;
	int breadth=20;
	
}
class Square{
	int side=30;
}
class Main{
	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(new Circle());
		s.area(new Rectangle());
		s.area(new Square());
		
		
	}
}
