package com.collections.arrayList;

import java.util.ArrayList;

public class WebShopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Pragathi" , 123.234, "vadigeri"));
		products.add(new Product("Sahana" , 123.123, "manvi"));
		products.add(new Product("Sahana" , 123.123, "manvi"));

		products.add(1, new Product("varsha" , 345.55, "machnur"));
		
		products.remove(2);
//		products.remove(new Product("Sahana" , 123.123, "manvi"));
//		System.out.println(products);
		
		products.set(0, new Product("manjula" , 234.444, "vadigerii"));
		for(Product p:products) {
			System.out.println(p);
		}
		
		System.out.println("The third product in the list is: ");
		System.out.println(products.get(2));
		
		System.out.println(products.size() + " products can be found.");

		
	}

}
