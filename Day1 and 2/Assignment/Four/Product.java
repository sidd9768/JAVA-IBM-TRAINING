
public class Product {

	private String productCode;
	private String productName;
	private double productPrice;
	
	Product(){
		this.productCode = "P100";
		this.productName = "Computer";
		this.productPrice = 49000.00;
	}
	
	Product(String productCode, String productName, double productPrice){
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
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

	public void displayProductDetails() {
		System.out.println("Product Code  :  " + this.productCode);
		System.out.println("Product Name  :  " + this.productName);
		System.out.println("Product Price :  " + this.productPrice);
	}


	public static void main(String[] args) {
		

	}

}
