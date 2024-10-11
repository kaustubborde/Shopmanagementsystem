package shopmanagement;

import java.util.ArrayList;

public class Customer {
	private String customerId;
	private String customerName;
	private String contactNumber;
	private ArrayList<Product> purchasedProducts;

	public Customer(String customerId, String customerName, String contactNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.purchasedProducts = new ArrayList<>();
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	public void addProduct(Product product) {
		purchasedProducts.add(product);
	}

	public void removeProduct(Product product) {
		purchasedProducts.remove(product);
	}

	public ArrayList<Product> displayProducts() {
		return purchasedProducts;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", purchasedProducts=" + purchasedProducts + "]";
	}

}
