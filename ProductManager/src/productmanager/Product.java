package productmanager;

public class Product {

	private int id;
	private String category;
	private String name;
	private double price;

	public Product() {
		super();
	}

	public Product(int id, String category, String name, double price) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println(" Product Id    : " + id);
		System.out.println(" Product Name  : " + name);
		System.out.println(" Catogory      : " + category);
		System.out.println(" Price         : " + price);
	}
}
