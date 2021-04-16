
public class TestAverager {

	public static void main(String[] args) {

		int a = 7;
		int b = 8;
		int c = 3;
		double d_a = 4.7;
		double d_b = 5.2;
		System.out.println("-------- METHOD OVERLOADING -------- \n");
		System.out.println("The result of ADD METHOD with 2 Integers: " + Averager.avg(a, b));
		System.out.println("The result of ADD METHOD with 3 Integers: " + Averager.avg(a, b, c));
		System.out.println("The result of ADD METHOD with 2 doubles: " +  Averager.avg(d_a, d_b));
		
	}

}

