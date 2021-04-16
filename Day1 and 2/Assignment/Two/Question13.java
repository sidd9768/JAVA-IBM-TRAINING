import java.util.Scanner;

public class Question13 {

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
				System.out.printf("The average of Avg is: %.2f ",  avgOddEvenSum(nums, size));
			}
		}
		
	}
	public static float avgOddEvenSum(int[] arr, int size) {
		
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<size; i++) {
			if(arr[i]%2==0) {
				evenSum = evenSum+arr[i];
			}else {
				oddSum = oddSum+arr[i];
			}
		}
	
		float average = (float) (oddSum+evenSum)/2;
		
		return average;
	}

}
