
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int salary = sc.nextInt();
		
		if(salary > 8000) {
			System.out.println("Salary too large");
		}else if(salary < 0){
			System.out.println("Salary too small");
		}
		else {
			
			System.out.print("Enter shifts: ");
			int shifts = sc.nextInt();
			
			if (shifts < 0) {
				System.out.println("Shifts too small");
			}else {
				int save = calculateSal(salary, shifts);
				System.out.println(save);
			}	
		}
	}
	
	public static int calculateSal(int salary, int shift) {
		float remaining;
		
		// 20% for food
		remaining = (float) (salary - salary*0.2);
		
		// 30% for travel
		remaining = (float) (remaining - salary*0.3);
		
		// adding shifts
		remaining  = (float) (remaining + salary*0.02*shift);
		
		return (int) remaining;
	}

}
