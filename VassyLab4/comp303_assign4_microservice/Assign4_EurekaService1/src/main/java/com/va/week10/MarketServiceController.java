package com.va.week10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketServiceController {
	
	 @Autowired
	  Environment environment;
	 
	  @GetMapping("/")
	  public String health() {
	    return "I am Ok";
	  }
	 
	  @GetMapping("/backend")
	  public String backend() {
	    System.out.println("Inside MyRestController::backend...");
	 
	    String serverPort = environment.getProperty("local.server.port");
	 
	    System.out.println("Port : " + serverPort);
	 
	    return "Hello form Backend!!! " + " Host : localhost " + " :: Port : " + serverPort;
	  }

	  public static class Order {
	        public String stockSymbol;
	        public int quantity;

	        public String getStockSymbol() {
	            return stockSymbol;
	        }

	        public int getQuantity() {
	            return quantity;
	        }
	    }
}
