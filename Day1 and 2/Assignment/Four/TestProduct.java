
public class TestProduct {

	public static void main(String[] args) {
		
		System.out.println("USING DEFAULT CONSTRUCTOR");
		Product product1 = new Product();
		product1.displayProductDetails();
		
		System.out.println("\n||=======================||\n");
		
		System.out.println("USING PARAMETERIZED CONSTRUCTOR");
		Product product2 = new Product("P201", "SMART TV", 29000.00);
		product2.displayProductDetails();
		
		System.out.println("\n||=======================||\n");
		
		System.out.println("USING GETTERS AND SETTERS");
		Product product3 = new Product();
		
		product3.setProductCode("P101");
		product3.setProductName("Laptop");
		product3.setProductPrice(45000.00);
		
		String pCode = product3.getProductCode();
		String pName = product3.getProductName();
		double pPrice = product3.getProductPrice();
		
		System.out.println("Product Code  :  " + pCode);
		System.out.println("Product Name  :  " + pName);
		System.out.println("Product Price :  " + pPrice);
		

	}

}
