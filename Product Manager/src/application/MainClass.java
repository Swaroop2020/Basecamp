package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

//	public static void showItems(FunctionalInterface obj,Item i) {
//		obj.display(i);
//	}

	public static void showItems(List<Item> list) {
		list.forEach(i -> {
			System.out.println("------------------------------------------");
			System.out.println("Name        : " + i.getItemname());
			System.out.println("Price       : " + i.getItemprice());
			System.out.println("------------------------------------------");
		});
	}

	public static void main(String[] args) {
		List<Product> product = new ArrayList<Product>();
		List<Item> item = new ArrayList<Item>();
		Product prod1 = new Product("mobile", 12000, 20);
		Product prod2 = new Product("laptop", 10000, 15);
		Product prod3 = new Product("television", 20000, 5);
		Product prod4 = new Product("tab", 8000, 11);
		Product prod5 = new Product("cycle", 10000, 6);
		Product prod6 = new Product("bike", 30000, 2);

		product.add(prod1);
		product.add(prod2);
		product.add(prod3);
		product.add(prod4);
		product.add(prod5);
		product.add(prod6);

		List<Product> products = product.stream().filter(i -> i.getProductPrice() >= 10000 && i.getProductPrice() <= 20000)
				.collect(Collectors.toList());

		// filtering product list by filtering price
//		for(Product p : s) {
//			System.out.println(p.getProductName() + " " + p.getProductPrice());
//		}

		products.forEach(p -> {
			System.out.println(p.getProductName() + "  " + p.getProductPrice());
		});

		item = product.stream().map(p -> new Item(p.getProductName(), p.getProductPrice()))
				.collect(Collectors.toList());

//	  OptionalDouble avgprice=  item.stream().mapToDouble(Item::getItemprice).average();
//	   System.out.println("Average Price : "+avgprice);

		int count = (int) item.stream().count();
		double avg = item.stream().mapToInt(i -> i.getItemprice()).reduce(0, (i1, i2) -> i1 + i2) / count;
		System.out.println("average price : " + avg);

		FunctionalInterface oo = MainClass::showItems;

		oo.display(item);

	}
}
