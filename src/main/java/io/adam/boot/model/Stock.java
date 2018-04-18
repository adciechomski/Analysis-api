package io.adam.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Stock {


	private Long id; 
	private String name;   
	private int price;	
    
    public Stock() {}
    
    public Stock(String name, int price) {
    	this.name = name;
    	this.price = price;
    	this.id = (long) 1;
    }
	
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
	public Long getID() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}
	
    @Column(name = "price")
	public int getPrice() {
	return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

    @Column(name = "name")
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
