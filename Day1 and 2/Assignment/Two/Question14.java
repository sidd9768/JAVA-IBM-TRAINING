import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		if (size < 0) {
			System.out.println("Invalid input");
		}else {
		
			int[] arr1 = new int[size];
			int[] arr2 = new int[size];
			for (int i=0; i<size; i++) {
				arr1[i] = sc.nextInt();
				if (arr1[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			for (int i=0; i<size; i++) {
				arr2[i] = sc.nextInt();
				if (arr2[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			if(arr2[arr2.length-1] != 0) {
				largestArray(arr1, arr2, size);
			}
		}

	}

	public static void largestArray(int[] arr1, int[] arr2, int size) {
		
		int[] output1 = new int[size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<=i; j++) {
				if (i==j) {
					if(arr1[i]<arr2[j]) {
						output1[i] = arr2[j];
					}else {
						output1[i] = arr1[i];
					}
				}
			}
		}
		for (int k=0; k<size; k++) {
			System.out.println(output1[k]);
		}
		
	}
}
