package com.vikas.test.mavenaws.api.model.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vikas.test.mavenaws.api.model.constant.UserRole;
import com.vikas.test.mavenaws.api.model.constant.UserType;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class CreateUserRequest {
	@JsonProperty("customerUUID")
	private String customerUUID;

	@JsonProperty("contactName")
	private String contactName;

	@JsonProperty("contactEmail")
	private String contactEmail;

	@JsonProperty("contactNumber")
	private Integer contactNumber;

	@JsonProperty("type")
	@Valid
	private List<UserType> type = new ArrayList<>();

	@JsonProperty("role")
	@Valid
	private List<UserRole> role = new ArrayList<>();

	public CreateUserRequest customerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	/**
	 * CustomerID of the Registering Customer
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(required = true, value = "CustomerID of the Registering Customer")
	@NotNull

	@Size(min = 1, max = 50)
	public String getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
	}

	public CreateUserRequest contactName(String contactName) {
		this.contactName = contactName;
		return this;
	}

	/**
	 * Contact person of thest company
	 * 
	 * @return contactName
	 */
	@ApiModelProperty(required = true, value = "Contact person of thest company")
	@NotNull

	@Size(min = 1, max = 50)
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public CreateUserRequest contactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	/**
	 * Company Contact Email
	 * 
	 * @return contactEmail
	 */
	@ApiModelProperty(required = true, value = "Company Contact Email")
	@NotNull

	@Size(min = 1, max = 50)
	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public CreateUserRequest contactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	/**
	 * Contact number of the customer minimum: 1111111111
	 * 
	 * @return contactNumber
	 */
	@ApiModelProperty(required = true, value = "Contact number of the customer")
	@NotNull

	@Min(1111111111)
	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public CreateUserRequest type(List<UserType> type) {
		this.type = type;
		return this;
	}

	public CreateUserRequest addTypeItem(UserType typeItem) {
		this.type.add(typeItem);
		return this;
	}

	/**
	 * Type of user
	 * 
	 * @return type
	 */
	@ApiModelProperty(required = true, value = "Type of user")
	@NotNull

	@Valid

	public List<UserType> getType() {
		return type;
	}

	public void setType(List<UserType> type) {
		this.type = type;
	}

	public CreateUserRequest role(List<UserRole> role) {
		this.role = role;
		return this;
	}

	public CreateUserRequest addRoleItem(UserRole roleItem) {
		this.role.add(roleItem);
		return this;
	}

	/**
	 * USer Role
	 * 
	 * @return role
	 */
	@ApiModelProperty(required = true, value = "USer Role")
	@NotNull

	@Valid

	public List<UserRole> getRole() {
		return role;
	}

	public void setRole(List<UserRole> role) {
		this.role = role;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateUserRequest createUserRequest = (CreateUserRequest) o;
		return Objects.equals(this.customerUUID, createUserRequest.customerUUID)
				&& Objects.equals(this.contactName, createUserRequest.contactName)
				&& Objects.equals(this.contactEmail, createUserRequest.contactEmail)
				&& Objects.equals(this.contactNumber, createUserRequest.contactNumber)
				&& Objects.equals(this.type, createUserRequest.type)
				&& Objects.equals(this.role, createUserRequest.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerUUID, contactName, contactEmail, contactNumber, type, role);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateUserRequest {\n");

		sb.append("    customerUUID: ").append(toIndentedString(customerUUID)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    role: ").append(toIndentedString(role)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
