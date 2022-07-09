package productmanager;

import java.util.Scanner;

public class Application {

	static Product[] products = new Product[0];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			displayMenu();
			byte opt = scan.nextByte();
			switch (opt) {
			case 1: {
				System.out.println("enter the id");
				int id = scan.nextInt();
				System.out.println("enter catogory of the product ");
				scan.nextLine();
				String catogory = scan.nextLine();
				System.out.println("enter name of the product     ");
				String name = scan.nextLine();
				System.out.println("enter price of the product    ");
				double price = scan.nextDouble();
				products = getProducts(products);
				products[products.length - 1] = new Product(id, catogory, name, price);
				System.out.println("    Product has been added succesfully   ");
				break;
			}
			case 2: {
				products = sortByPrice(products);
				System.out.println(products.length);
				for (int i = 0; i < products.length; i++) {
					System.out.println("-------------------------------");
					products[i].display();
					System.out.println("-------------------------------");
				}
				break;
			}
			case 3: {
				System.out.println("enter category");
				scan.nextLine();
				String category = scan.nextLine();
				products = sortByCategory(products);
				int i = binarySearch(products, category);
				if (i >= 0) {
					products[i].display();
				} else {
					System.out.println("No products under this category");
				}

				break;
			}
			case 4: {
				flag = false;
				System.out.println("  Thank You  ");
				break;
			}
			}

		} while (flag);
		
		scan.close();
	}

	private static int binarySearch(Product[] products, String category) {
		int x = 0, length = products.length - 1;
		while (x <= length) {
			int y = x + (length - 1) / 2;
			int result = category.compareTo(products[y].getCategory());

			if (result == 0) {
				return y;
			}
			if (result > 0) {
				x = length + 1;
			} else {
				length = y - 1;
			}
		}
		return -1;
	}

	//bubble sort
	private static Product[] sortByCategory(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			for (int j = 0; j < products.length - 1; j++) {
				if (products[j].getCategory().compareTo(products[j + 1].getCategory()) >= 1) {
					Product temp = products[j];
					products[j] = products[j + 1];
					products[j + 1] = temp;
				}
			}
		}
		return products;
	}

	//insertion sort
	private static Product[] sortByPrice(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			int j = i;
			Product key = products[j];
			while (j > 0 && products[j - 1].getPrice() > key.getPrice()) {
				products[j] = products[j - 1];
				j--;
			}
			products[j] = key;
		}
		return products;
	}

	private static Product[] getProducts(Product[] products) {
		Product[] temp = new Product[products.length + 1];
		for (int i = 0; i < products.length; i++) {
			temp[i] = products[i];
		}
		return temp;
	}

	private static void displayMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("         press 1 to add product                 ");
		System.out.println("         press 2 to sort products based on price");
		System.out.println("         press 3 to get product by category     ");
		System.out.println("         press 4 to exit                        ");
		System.out.println("------------------------------------------------");

	}
}
