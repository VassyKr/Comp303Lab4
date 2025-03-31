package com.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

	 @Id
	    private String id;

	    private String userId;
	    private String stockSymbol;
	    private int quantity;

	    // Getters and setters

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public String getStockSymbol() {
	        return stockSymbol;
	    }

	    public void setStockSymbol(String stockSymbol) {
	        this.stockSymbol = stockSymbol;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
}
