
public class Question12 {

	public static void main(String[] args) {
		
		int digits = 234;
//		System.out.println(generateNewNumber(digits));
		generateNewNumber(digits);

	}
	
public static int generateNewNumber(int digits) {
	
		if(digits < 0 || digits > 32767) {
			return -1;
		}else {
			int newNumber=0;
			int product = 1;
			if (digits ==0) {
				return 0;
			}else {
				while (digits > 0) {
					int ldigits = digits%10;
//					product = product * ldigits;
					System.out.println(ldigits);
					if(ldigits%2==0) {
						newNumber = (ldigits+2);
					}
					else {
						newNumber = (ldigits+2);
					}
					System.out.println(newNumber*10);
					digits = digits/10;
				}
		
				return 1;
			}
		}
	}

}
