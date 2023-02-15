package Entities;

public class ImportedProduct extends Product {
	
	private Double custonFee;

	public ImportedProduct(String name, Double price,Double custonFee) {
		super(name, price);
		this.custonFee = custonFee;
		}
	
	public void totalPrice() {
		price += custonFee;
	}
	
	public Double getCustonFee() {
		return custonFee;
	}

	public void setCustonFee(Double custonFee) {
		this.custonFee = custonFee;
	}

	public String toString() {
		return  super.toString() + "(Custonms Fee: $" + custonFee + ")\n";
	}
	
	
}
