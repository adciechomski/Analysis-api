package io.adam.boot.model;

public class Stock {

	private String name;
	private int price;	

//	public Stock(String name) {
//			this.name = name;
//		}
	
	public int getPrice() {
	return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Stock name: " + name;
	}
		
		
}
