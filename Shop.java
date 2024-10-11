package shopmanagement;

import java.util.HashMap;

import java.util.ArrayList;

public class Shop {
	private HashMap<String, Product> products;
	private HashMap<String, Customer> customers;

	
	public Shop() {
		this.products = new HashMap<>();
		this.customers = new HashMap<>();

	}

	
	public void addProduct(Product product) {
		products.put(product.getProductId(), product);

	}

	public void removeProduct(String productId) {
		products.remove(productId);
	}

	
	public void addCustomer(Customer customer) {
		customers.put(customer.getCustomerId(), customer);

	}

	public void removeCustomer(String customerId) {
		customers.remove(customerId);
	}

	
	public Product searchProductByName(String productName) {
		return products.get(productName);
	}

	public ArrayList<Product> searchProductByPriceRange(double minPrice, double maxPrice) {
		ArrayList<Product> productsInRange = new ArrayList<>();
		for (Product product : products.values()) {
			if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
				productsInRange.add(product);
			}
		}
		return productsInRange;
	}

	
	public void displayAllProducts() {
		if (products.isEmpty()) {
			System.out.println("No products available.");
		} else {
			for (Product product : products.values()) {
				System.out.println(product);
			}
		}
	}

	public void displayAllCustomers() {
		if (customers.isEmpty()) {
			System.out.println("No customers available.");
		} else {
			for (Customer customer : customers.values()) {
				System.out.println(customer);
			}
		}
	}

}
