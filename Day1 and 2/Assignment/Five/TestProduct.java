
public class TestProduct {

	public static void main(String[] args) {

		System.out.println("PRODUCT 1 WITH 3 PARAMETERIZED PARAMETERS: ");
		Product product1 = new Product("BATMAN MODEL", 4500.00, 'T');
		product1.getProductDetails();
		
		System.out.println("\n=========================\n");
		
		System.out.println("PRODUCT 1 WITH 3 PARAMETERIZED PARAMETERS: ");
		Product product3 = new Product("ICON MASK", 999.00, 'A');
		product3.getProductDetails();
		
		System.out.println("\n=========================\n");
		System.out.println("PRODUCT 2 WITH 2 PARAMETERIZED PARAMETERS");
		Product product2 = new Product("SMART TV", 25000.00);
		product2.getProductDetails();

	}

}
