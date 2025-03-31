package com.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountTransactionController {
	
	 @Autowired
	    private AccountTransactionReposity repository;

	    @PostMapping("/debit")
	    public ResponseEntity<String> debit(@RequestBody AccountTransaction transaction) {
	        transaction.setType("debit");
	        repository.save(transaction);
	        return ResponseEntity.ok("Debited " + transaction.getAmount() + " from user " + transaction.getUserId());
	    }
  
	    @PostMapping("/credit")
	    public ResponseEntity<String> credit(@RequestBody AccountTransaction transaction) {
	        transaction.setType("credit");
	        repository.save(transaction);
	        return ResponseEntity.ok("Credited " + transaction.getAmount() + " to user " + transaction.getUserId());
	    }

}
