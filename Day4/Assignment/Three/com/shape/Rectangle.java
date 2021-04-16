package com.shape;

public class Rectangle implements Polygon {
	
	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public void calcArea() {
		
		System.out.println("The area of a Rectangle is : " + length*breadth);
		
	}
	
	public void calcPeri() {
		
		float perimeter = 2*(length+breadth);
		System.out.println("The perimeter of Rectangle is : " + perimeter);
		
	}

}
