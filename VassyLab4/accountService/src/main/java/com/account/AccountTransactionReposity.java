package com.account;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountTransactionReposity extends MongoRepository<AccountTransaction, String>  {

}
