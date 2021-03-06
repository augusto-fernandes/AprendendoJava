package entities;


public class Product5 {
	private String name;
	private Double price;
    
	public Product5() {
	}
    
	public Product5(String name, Double price) {
		this.name = name;
		this.price = price;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public static boolean staticProductPredicate(Product5 p) {
		return p.getPrice()>= 100.0;
	}
	public  boolean nonStaticProductPredicate() {
		return getPrice()>= 100.0;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
