package com.vikas.test.mavenaws.api.model.request;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vikas.test.mavenaws.api.model.constant.CustomerType;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerSignupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class CustomerSignupRequest {
	@JsonProperty("companyname")
	private String companyname;

	@JsonProperty("username")
	private String username;

	@JsonProperty("password")
	private String password;

	@JsonProperty("email")
	private String email;

	@JsonProperty("contactnumber")
	private String contactnumber;

	@JsonProperty("address")
	private String address;

	@JsonProperty("customertype")
	private CustomerType customertype = null;

	public CustomerSignupRequest companyname(String companyname) {
		this.companyname = companyname;
		return this;
	}

	/**
	 * Get companyname
	 * 
	 * @return companyname
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public CustomerSignupRequest username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get username
	 * 
	 * @return username
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public CustomerSignupRequest password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * 
	 * @return password
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerSignupRequest email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 * 
	 * @return email
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerSignupRequest contactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
		return this;
	}

	/**
	 * Get contactnumber
	 * 
	 * @return contactnumber
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 50)
	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public CustomerSignupRequest address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 */
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 255)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerSignupRequest customertype(CustomerType customertype) {
		this.customertype = customertype;
		return this;
	}

	/**
	 * Get customertype
	 * 
	 * @return customertype
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CustomerType getCustomertype() {
		return customertype;
	}

	public void setCustomertype(CustomerType customertype) {
		this.customertype = customertype;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerSignupRequest customerSignupRequest = (CustomerSignupRequest) o;
		return Objects.equals(this.companyname, customerSignupRequest.companyname)
				&& Objects.equals(this.username, customerSignupRequest.username)
				&& Objects.equals(this.password, customerSignupRequest.password)
				&& Objects.equals(this.email, customerSignupRequest.email)
				&& Objects.equals(this.contactnumber, customerSignupRequest.contactnumber)
				&& Objects.equals(this.address, customerSignupRequest.address)
				&& Objects.equals(this.customertype, customerSignupRequest.customertype);
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyname, username, password, email, contactnumber, address, customertype);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerSignupRequest {\n");

		sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    contactnumber: ").append(toIndentedString(contactnumber)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    customertype: ").append(toIndentedString(customertype)).append("\n");
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
