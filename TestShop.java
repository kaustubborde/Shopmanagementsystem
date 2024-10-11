package shopmanagement;
import java.util.*;
public class TestShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop shop = new Shop();
		System.out.println("---Welcome to Shop Management System!---");
		while (true) {
			System.out.println("1. Add product");
			System.out.println("2. Remove product");
			System.out.println("3. Add customer");
			System.out.println("4. Remove customer");
			System.out.println("5. Search product by name");
			System.out.println("6. Search product by price range");
			System.out.println("7. Display all products");
			System.out.println("8. Display all customers");
			System.out.println("9. Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter product details");
				System.out.println("Product Id: ");
				String pid = sc.next();
				System.out.println("Product Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Quantity Available: ");
				int qa = sc.nextInt();
				shop.addProduct(new Product(pid, name, price, qa));
				System.out.println("Product added successfully");
				break;

			case 2:
				System.out.println("Enter product Id to remove: ");
				String productIdtoRemove = sc.next();
				shop.removeProduct(productIdtoRemove);
				System.out.println("Product removed sucessfully");
				break;

			case 3:
				System.out.println("Enter customer details");
				System.out.println("Customer Id: ");
				String cid = sc.next();
				System.out.println("Customer Name: ");
				String cname = sc.next();
				System.out.println("Contact number: ");
				String no = sc.next();
				shop.addCustomer(new Customer(cid, cname, no));
				System.out.println("Customer added successfully");
				break;

			case 4:
				System.out.println("Enter customer Id to remove: ");
				String customerIdtoRemove = sc.next();
				shop.removeCustomer(customerIdtoRemove);
				System.out.println("Customer removed sucessfully");
				break;

			case 5:
				System.out.println("Enter the name of the product to search: ");
				String searchproductname = sc.next();
				Product foundproductname = shop.searchProductByName(searchproductname);
				if (foundproductname != null) {
					System.out.println("Product not found");
				} else {
					System.out.println("Product found");
				}
				break;

			case 6:
				System.out.println("Search product by price range");
				System.out.println("Enter min price: ");
				double minPrice = sc.nextDouble();
				System.out.println("Enter max price: ");
				double maxPrice = sc.nextDouble();
				ArrayList<Product> foundProductbyPriceRange = shop.searchProductByPriceRange(minPrice, maxPrice);
				if (foundProductbyPriceRange != null) {
					System.out.println("Product not found");
				} else {
					System.out.println("Product found");
				}
				break;

			case 7:
				System.out.println("All products");
				shop.displayAllProducts();
				break;
			case 8:
				System.out.println("All customers");
				shop.displayAllCustomers();
				break;
			case 9:
				System.out.println("Exiting...Thank you for using shop management system");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Inavlid choice...Choose from 1 to 9");

			}

		}

	}

}