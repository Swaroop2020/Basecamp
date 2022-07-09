package application;

public class Product {
	private String productName;
	private int productPrice;
	private int ProductStock;
	public Product(String productName, int productPrice, int productStock) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		ProductStock = productStock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return ProductStock;
	}
	public void setProductStock(int productStock) {
		ProductStock = productStock;
	}
}
