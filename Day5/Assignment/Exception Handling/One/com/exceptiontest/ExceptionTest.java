
package com.exceptiontest;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int result = a/b;
			System.out.println("The result is : " + result);
			
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("No input received");
		}catch(NumberFormatException nfe) {
			System.out.println("Only integers are allowed");
		}catch(ArithmeticException ae) {
			System.out.println("Division with zero is not possible");
		}

	}

}
