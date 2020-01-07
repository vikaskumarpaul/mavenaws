package com.vikas.test.mavenaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.test.mavenaws.entity.DeviceServiceAssociationEntity;

public interface DeviceServiceAssociationRepository extends JpaRepository<DeviceServiceAssociationEntity, Long> {
	List<DeviceServiceAssociationEntity> findByCustomerId(Long customerId);
}
