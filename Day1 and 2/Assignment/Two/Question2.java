
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		if (size < 0) {
			System.out.println("Invalid input");
		}else {
		
			int[] salary = new int[size];
			for (int i=0; i<size; i++) {
				System.out.print("Enter salary of " + (i+1) + " : ");
				salary[i] = sc.nextInt();
				if (salary[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			if(salary[salary.length-1] != 0) {
				System.out.println(countRepeaters(salary, size));
			}
		}
	}

	public static int countRepeaters(int[] arr, int length) {
		
		int max=0;
		for (int i=0;i<length;i++) {
			int count=1;
			for (int j=0;j<length; j++) {
				if (i==j) {
					continue;
				}else {
					if (arr[i]==arr[j]) {
						count ++;
					}
				}
				
			}
			
			if (max < count) {
				max = count;
			}
		}
//		System.out.println(max);
		return max;
	}
	
}
