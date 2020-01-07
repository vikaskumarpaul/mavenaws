package com.vikas.test.mavenaws.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.test.mavenaws.api.model.request.CustomerCreationRequest;
import com.vikas.test.mavenaws.api.model.response.CustomerDetailsResponse;
import com.vikas.test.mavenaws.entity.Customer;
import com.vikas.test.mavenaws.mapper.CustomerMapper;
import com.vikas.test.mavenaws.repository.CustomerRepository;
import com.vikas.test.mavenaws.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerMapper customerMapper;

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public CustomerDetailsResponse getCustomerDetailsbyid(long customerID) {
		LOGGER.info("fetching customer details by ID {}", customerID);

		Optional<Customer> optCustomerEntity = customerRepository.findById(customerID);

		if (optCustomerEntity.isPresent()) {
			return customerMapper.customerEntityToDetails(optCustomerEntity.get());
		}

		return null;
	}

	@Override
	public CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest) {
		LOGGER.info("fetching customer details by ID {}", customerCreationRequest.toString());

		Customer customerinserted = customerRepository
				.save(customerMapper.customerCreationRequestToEntity(customerCreationRequest));

		if (customerCreationRequest != null) {
			return customerMapper.customerEntityToDetails(customerinserted);
		}
		return null;
	}
}
