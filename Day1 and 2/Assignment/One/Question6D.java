
public class Question6D {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		int sum = 0;
		while (c < 100) {
			System.out.print(" " + c);
			sum = sum + c;
			a = b;
			b = c;
			c = a+b;
		}
		System.out.println("\nThe sum is: " + sum);

	}

}
