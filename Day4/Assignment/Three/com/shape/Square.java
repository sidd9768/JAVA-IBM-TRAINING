package com.shape;

public class Square implements Polygon{
	
	private float side;
	
	public Square(float side){
		this.side = side;
	}

	@Override
	public void calcArea() {

		System.out.println("The area of Square is : " + side*side);
		
	}

	@Override
	public void calcPeri() {
		
		System.out.println("The perimeter of a Square is : " + 4*side);
		
	}

}
