import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		if (size < 0) {
			System.out.println("Invalid input");
		}else {
		
			int[] arr = new int[size];
			for (int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] < 0) {
					System.out.println("Invalid input");
					break;
				}
			}
			if(arr[arr.length-1] != 0) {
				ascDescArray(arr, size);
			}
		}
	}
	
	static void ascDescArray(int [] arr, int size) {
		
		int half = size/2 + 1;
		for (int i=0;i<half;i++) {
		
			int minIdx = i;
			for (int j=i+1; j<half; j++) {
				if(arr[minIdx] > arr[j] ) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
			
		}
		
		for (int i=half;i<size;i++) {
			
			int minIdx = i;
			for (int j=i+1; j<size; j++) {
				
					if(arr[minIdx] < arr[j] ) {
						minIdx = j;
					}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
			
		}
		
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
