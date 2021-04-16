
public class Averager {

	int nums = 20;
	static int staticNum = 40; 
	
	public static double avg(int a, int b) {
		double average = (double) (a+b)/2;
		return average;
	}
	
	public static double avg(int a, int b, int c) {
		double average = (double) (a+b+c)/3;
		return average;
	}
	
	public static double avg(double a, double b) {
		double average = (a+b)/2;
		return average;
	}
	
	public void hello() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
