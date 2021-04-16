package com.test;

import com.shape.*;
public class Testshape {

	public static void main(String[] args) {
		
		System.out.println("\nSQUARE: ");
		Square square = new Square(10.0f);
		square.calcArea();
		square.calcPeri();
		
		System.out.println("\nRECTANGLE:");
		
		Rectangle rectangle = new Rectangle(10.0f, 20.0f);
		rectangle.calcArea();
		rectangle.calcPeri();

	}

}
