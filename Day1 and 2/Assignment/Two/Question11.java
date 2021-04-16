import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("Number too small");
		}else if(n> 32767) {
			System.out.println("Number too large");
		}else {
			int result = powerOfTwo(n);
			
			if (result == 1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	
	public static int powerOfTwo(int n) {
		boolean flag =  true;
		while(n>0) {
			System.out.println(n);
			if(n%2 != 0 && n != 1) {
				flag = false;
				break;
			}
			n=n/2;
		}
		if(flag) {
			return 1;
		}else {
			return 0;
		}
	}

}
