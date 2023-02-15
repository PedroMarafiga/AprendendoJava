package Dados_Loja;

public class OrderItem {
	
	private Integer quantity; 
	private Double price;
	
	private Product product;
	
	
	
	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	



	public Double Subtotal() {
		return quantity * price;
	}





	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f\n", Subtotal());
	}
	
	
}
