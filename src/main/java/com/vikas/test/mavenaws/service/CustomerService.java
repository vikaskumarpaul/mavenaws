package com.vikas.test.mavenaws.service;

import com.vikas.test.mavenaws.api.model.request.CustomerCreationRequest;
import com.vikas.test.mavenaws.api.model.response.CustomerDetailsResponse;

public interface CustomerService {

	CustomerDetailsResponse getCustomerDetailsbyid(long customerID);
	CustomerDetailsResponse createCustomer(CustomerCreationRequest customerCreationRequest);

}
