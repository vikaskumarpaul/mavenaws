package com.vikas.test.mavenaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.test.mavenaws.entity.DeviceEntity;

public interface DeviceRepository extends JpaRepository<DeviceEntity, Long> {

}
