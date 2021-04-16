import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		if (size < 0) {
			System.out.println("Invalid input");
		}else {
			System.out.print("Enter the element to be counted: ");
			int number = sc.nextInt();
		
			int[] nums = new int[size];
			for (int i=0; i<size; i++) {
				nums[i] = sc.nextInt();
				if (nums[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			if(nums[nums.length-1] != 0) {
				System.out.println("The number of times " + number + " occured is: " +  findElementCount(nums, size, number));
			}
		}
	}
	
	public static int findElementCount(int[] arr, int size, int number) {
		
		int count = 0;
		
		for (int i=0; i<size; i++) {
			if (arr[i] == number) {
				count++;
			}
		}
		
		return count;
	}

}
