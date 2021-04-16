
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
			
		System.out.print("Enter number 3: ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println("The sum " + num1 + " " + num2 + " " + num3 + " is " + sum);
	}

}
