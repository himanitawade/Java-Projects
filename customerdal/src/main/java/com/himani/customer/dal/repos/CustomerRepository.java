package com.himani.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.himani.customer.dal.etities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
