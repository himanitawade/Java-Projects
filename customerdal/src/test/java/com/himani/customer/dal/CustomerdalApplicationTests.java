package com.himani.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.himani.customer.dal.etities.Customer;
import com.himani.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Himalaya");
		customer.setEmail("hya.mel@gmail.com");

		repo.save(customer);
	}

	@Test
	void testFiindCustomerById() {
		Customer customer = repo.findById(1L).get();
		System.out.print(customer);
	}

	@Test
	void testUpdateStudent() {
		Customer customer = repo.findById(1L).get();
		customer.setEmail("htawade@gmail.com");
		repo.save(customer);
	}

	@Test
	void testdeleteStudent() {
		Customer customer = repo.findById(1L).get();
		repo.delete(customer);
	}

}
