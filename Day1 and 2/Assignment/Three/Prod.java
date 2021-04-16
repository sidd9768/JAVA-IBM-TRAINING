//Assignment 5
public class Prod {

	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	
	private static int prodCounter=100;
	
	Prod(String productName, double productPrice, char categoryCode){
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode = generateProductCode();
	}
	
	Prod(String productName, double productPrice){
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = 'E';
		this.productCode = generateProductCode();
	}
	
	
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

	private String generateProductCode() {
		String pCode = categoryCode + String.valueOf(prodCounter++);
		return pCode;
	}
	
	public void getProductDetails() {
		System.out.println("Product ---");
		System.out.println("Code  :  " + productCode);
		System.out.println("Name  :  " + productName);
		System.out.println("Price :  "+ productPrice);
		System.out.println("Caregory: " + categoryCode);
	}
	
	public static void main(String[] args) {
		
		

	}

}
