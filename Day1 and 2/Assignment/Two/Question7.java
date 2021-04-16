
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fehrenheit temperature: ");
		int feh = sc.nextInt();

		if (feh < 0) {
			System.out.println("Invalid Input");
		}else {
			System.out.println(convertToCentigrade(feh));
		}

	}
	
	public static float convertToCentigrade(int feh) {
		
		float c = (feh - 32)/9*5;
		return c;
	}

}
