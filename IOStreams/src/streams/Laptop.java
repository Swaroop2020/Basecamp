package streams;

import java.io.Serializable;

public class Laptop implements Serializable{
	private int id;
	private String brand;
	transient private double price;
	
	public Laptop() {
		super();
	}

	public Laptop(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	 
	
}
