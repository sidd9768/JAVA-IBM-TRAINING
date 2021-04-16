
import java.util.Scanner;
public class Question4Efficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int amt = sc.nextInt();
		
		if (amt < 0) {
			System.out.println("Invalid Input");
		}else {
			System.out.println( "The Minimum Amount of Rupees required: " + countRupees(amt));
		}
	}
	
	public static int countRupees(int amount) {
		
		int[] coins = {500, 100, 50, 10, 5, 2, 1};
		int count=0;
		for (int i=0; i< coins.length; i++) {
//			System.out.println("Using: " + coins[i]);
			while (amount > coins[i]) {
//				System.out.println("Selected " + coins[i]);
				amount = amount - coins[i];
				count++;
			}
		}
//		System.out.println(count);
		return count;
	}

}
