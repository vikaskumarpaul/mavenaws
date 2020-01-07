package com.vikas.test.mavenaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.test.mavenaws.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
