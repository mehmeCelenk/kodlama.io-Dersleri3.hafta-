package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		//JDBC
		System.out.println("Ürün eklendi " + product.getName());
	}
	
	public void add2(int id, String name, String description, int stockAmounth, double price, String yeniOzellik) {
		
	}

}