
public class Question6B {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		while (b < 100) {
			
			if (c % 2 == 1) {
				System.out.print(" " + c);
			}
			a = b;
			b = c;
			c = a+b;
		}

	}

}
