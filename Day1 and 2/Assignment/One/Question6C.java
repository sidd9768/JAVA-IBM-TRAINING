
public class Question6C {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		while (c<1000) {
			
			if (b > 100 && c%2==0) {
				
				System.out.print(" " + c);
			}
			a = b;
			b = c;
			c = a + b;
		}

	}

}
