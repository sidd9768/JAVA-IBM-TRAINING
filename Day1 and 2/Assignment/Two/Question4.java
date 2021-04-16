
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 23;
		countRupees(amt);
	}
	
	public static int countRupees(int amount) {
		int currencyNeeded = 0;
		System.out.println(amount);
		while (amount > 0) {
			if(amount >= 500) {
				amount = amount - 500;
				currencyNeeded++;
				System.out.println("Selected 500");
			}else if(amount >= 100) {
				amount = amount - 100;
				currencyNeeded++;
				System.out.println("Selected 100");
			}else if (amount >= 50) {
				amount = amount - 50;
				currencyNeeded++;
				System.out.println("Selected 50");
			}else if (amount >= 10) {
				amount = amount - 10;
				currencyNeeded++;
				System.out.println("Selected 10");
			}else if (amount >= 5) {
				amount = amount - 5;
				currencyNeeded++;
				System.out.println("Selected 5");
			}else if (amount >= 2) {
				amount = amount - 2;
				currencyNeeded++;
				System.out.println("Selected 2");
			}else if (amount >= 1) {
				amount = amount - 1;
				currencyNeeded++;
				System.out.println("Selected 1");
			}
			System.out.println("Count: " + currencyNeeded);
			System.out.println("AMount left: " + amount);
			System.out.println("======================");
		}
		System.out.println(currencyNeeded);
		return 1;
	}

}
