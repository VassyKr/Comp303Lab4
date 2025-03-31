package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	 @Autowired
	    private OrderRepository orderRepository;

	    @Autowired
	    private RestTemplate restTemplate;

	    @PostMapping
	    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
	        Order saved = orderRepository.save(order);

	        // Call market-service
	        String marketResponse = restTemplate.postForObject(
	                "http://market-service/market/place", order, String.class);

	        return ResponseEntity.ok("Order placed successfully. Market response: " + marketResponse);
	    }

}
