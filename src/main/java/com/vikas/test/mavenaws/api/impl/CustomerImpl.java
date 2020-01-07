package com.vikas.test.mavenaws.api.impl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.vikas.test.mavenaws.api.Customer;
import com.vikas.test.mavenaws.api.model.request.CustomerCreationRequest;
import com.vikas.test.mavenaws.api.model.response.CustomerDetailsResponse;
import com.vikas.test.mavenaws.service.CustomerService;

import io.swagger.annotations.ApiParam;

public class CustomerImpl implements Customer {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerImpl.class);

	@Autowired
	private CustomerService customerService;

	@Override
	public ResponseEntity<CustomerDetailsResponse> getCustomerById(@PathVariable("customerId") Long customerId) {
		HttpStatus status = HttpStatus.OK;
		CustomerDetailsResponse customerDetailsResponse = null;

		try {
			customerDetailsResponse = customerService.getCustomerDetailsbyid(customerId);
		} catch (Exception e) {
			LOGGER.error("Failed to get customer details for customer {}", customerId);
		}

		return new ResponseEntity<CustomerDetailsResponse>(customerDetailsResponse, status);
	}

	@Override
	public ResponseEntity<Void> addCustomer(
			@ApiParam(value = "enter the appropriate customer creation Request", required = true) @Valid @RequestBody CustomerCreationRequest customerCreationRequest) {
		CustomerDetailsResponse creationresponse = customerService.createCustomer(customerCreationRequest);
		if (creationresponse != null) {
			LOGGER.debug("Customer sucessfully created with id {} and name {}", creationresponse.getId(),
					creationresponse.getCompanyName());
		}
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
