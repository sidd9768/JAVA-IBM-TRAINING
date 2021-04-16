import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		if (size < 0) {
			System.out.println("Invalid input");
		}else {
		
			int[] nums = new int[size];
			for (int i=0; i<size; i++) {
				nums[i] = sc.nextInt();
				if (nums[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			if(nums[nums.length-1] != 0) {
				System.out.println("The average of prime Index is: " +  primeIndexSum(nums, size));
			}
		}
	}
	
	public static int primeIndexSum(int[] arr, int size) {
		
		int sum = 0;
		int count=0;
		int count1=0;
		
		for (int j=2; j<=size; j++) {
			count = 0;
			for (int i=1; i<=j; i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				sum = sum + arr[j-1];
				count1++;
			}
			
		}
//		System.out.println("sum: " + sum);
		int average = sum/count1;
//		System.out.println(average);
		
		return average;
	}

}
