
public class TestProd {

	public static void main(String[] args) {

		System.out.println("PRODUCT 1 WITH 3 PARAMETERIZED PARAMETERS: ");
		Prod product1 = new Prod("BATMAN MODEL", 4500.00, 'T');
		product1.getProductDetails();
		
		System.out.println("\n=========================\n");
		
		System.out.println("PRODUCT 1 WITH 3 PARAMETERIZED PARAMETERS: ");
		Prod product3 = new Prod("ICON MASK", 999.00, 'A');
		product3.getProductDetails();
		
		System.out.println("\n=========================\n");
		System.out.println("PRODUCT 2 WITH 2 PARAMETERIZED PARAMETERS");
		Prod product2 = new Prod("SMART TV", 25000.00);
		product2.getProductDetails();

	}

}
