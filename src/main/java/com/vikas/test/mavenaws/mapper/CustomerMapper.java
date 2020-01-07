package com.vikas.test.mavenaws.mapper;

import java.time.OffsetDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;

import com.vikas.test.mavenaws.api.model.request.CustomerCreationRequest;
import com.vikas.test.mavenaws.api.model.response.CustomerDetailsResponse;
import com.vikas.test.mavenaws.entity.Customer;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, componentModel = "spring")
public interface CustomerMapper {

	@Mappings({

			@Mapping(source = "id", target = "id"),

			@Mapping(source = "companyname", target = "companyName"),

			@Mapping(source = "contactname", target = "contactName"),

			@Mapping(source = "contactemail", target = "contactEmail"),

			@Mapping(source = "publickeyconfirmed", target = "publicKeyConfirmed"),

			@Mapping(source = "uniquecustomerid", target = "customerUUID"),

			@Mapping(source = "hsmuserid", target = "hsmUserId"),

			@Mapping(source = "createdAt", target = "createdAt"),

			@Mapping(source = "updatedAt", target = "updatedAt"),

			@Mapping(source = "version", target = "version"), })
	CustomerDetailsResponse customerEntityToDetails(Customer customerEntity);

	@Mappings({ @Mapping(source = "companyName", target = "companyname"),

			@Mapping(source = "contactName", target = "contactname"),

			@Mapping(source = "contactEmail", target = "contactemail"),

			@Mapping(source = "contactNumber", target = "uniquecustomerid") })
	Customer customerCreationRequestToEntity(CustomerCreationRequest customerCreationRequest);

	default String map(OffsetDateTime datetime) {
		return datetime.toString();
	}
}
