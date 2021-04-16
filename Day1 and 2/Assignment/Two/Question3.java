import java.util.Scanner;

import java.util.Scanner;
public class Question3 {

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
				System.out.println(maximumSum(nums, size));
			}
		}

	}
	
	public static int maximumSum(int[] arr, int size) {
		
		int evenSum=0;
		int oddSum=0;
		
		for (int i=0; i<arr.length; i++) {
			if (i%2==0) {
				evenSum = evenSum + arr[i];
			}else {
				oddSum = oddSum + arr[i];
			}
		}
		
		if (evenSum > oddSum) {
			return evenSum;
		}else {
			return oddSum;
		}
		
	}

}
