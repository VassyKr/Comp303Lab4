package com.va.week10;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Market")
public class Market {

	@Id
	private String id;
    private String stockSymbol;
    private int quantity;
    private String status;
	
}
