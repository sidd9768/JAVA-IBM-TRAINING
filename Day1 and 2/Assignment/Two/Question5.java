
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digits: ");
		int digits = sc.nextInt();
		
		int result = productDigits(digits);
		if (result == -1) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("The product of " + digits + " is " + result);
		}
		
	}
	
	public static int productDigits(int digits) {
		
		if(digits < 0 || digits > 32767) {
			return -1;
		}else {
			int product = 1;
			if (digits ==0) {
				return 0;
			}else {
				while (digits > 0) {
					int ldigits = digits%10;
					product = product * ldigits;
					digits = digits/10;
				}
		
				return product;
			}
		}
	}

}
