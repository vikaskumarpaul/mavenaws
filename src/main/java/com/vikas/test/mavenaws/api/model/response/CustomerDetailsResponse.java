package com.vikas.test.mavenaws.api.model.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vikas.test.mavenaws.api.model.constant.CustomerType;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class CustomerDetailsResponse {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("contactName")
	private String contactName;

	@JsonProperty("contactEmail")
	private String contactEmail;

	@JsonProperty("contactNumber")
	private Integer contactNumber;

	@JsonProperty("type")
	@Valid
	private List<CustomerType> type = null;

	@JsonProperty("hsmUserId")
	private String hsmUserId;

	@JsonProperty("publicKeyConfirmed")
	private Boolean publicKeyConfirmed;

	@JsonProperty("customerUUID")
	private String customerUUID;

	@JsonProperty("createdAt")
	private String createdAt;

	@JsonProperty("updatedAt")
	private String updatedAt;

	@JsonProperty("version")
	private Integer version;

	public CustomerDetailsResponse id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * id of the customer
	 * 
	 * @return id
	 */
	@ApiModelProperty(value = "id of the customer")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerDetailsResponse companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	/**
	 * Name of the Company of the Registering Customer
	 * 
	 * @return companyName
	 */
	@ApiModelProperty(value = "Name of the Company of the Registering Customer")

	@Size(min = 1, max = 50)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CustomerDetailsResponse contactName(String contactName) {
		this.contactName = contactName;
		return this;
	}

	/**
	 * Contact person of thest company
	 * 
	 * @return contactName
	 */
	@ApiModelProperty(value = "Contact person of thest company")

	@Size(min = 1, max = 50)
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public CustomerDetailsResponse contactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	/**
	 * Company Contact Email
	 * 
	 * @return contactEmail
	 */
	@ApiModelProperty(value = "Company Contact Email")

	@Size(min = 1, max = 50)
	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public CustomerDetailsResponse contactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	/**
	 * Contact number of the customer minimum: 1111111111
	 * 
	 * @return contactNumber
	 */
	@ApiModelProperty(value = "Contact number of the customer")

	@Min(1111111111)
	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public CustomerDetailsResponse type(List<CustomerType> type) {
		this.type = type;
		return this;
	}

	public CustomerDetailsResponse addTypeItem(CustomerType typeItem) {
		if (this.type == null) {
			this.type = new ArrayList<>();
		}
		this.type.add(typeItem);
		return this;
	}

	/**
	 * Type of Customer
	 * 
	 * @return type
	 */
	@ApiModelProperty(value = "Type of Customer")

	@Valid

	public List<CustomerType> getType() {
		return type;
	}

	public void setType(List<CustomerType> type) {
		this.type = type;
	}

	public CustomerDetailsResponse hsmUserId(String hsmUserId) {
		this.hsmUserId = hsmUserId;
		return this;
	}

	/**
	 * Hsm Customer ID
	 * 
	 * @return hsmUserId
	 */
	@ApiModelProperty(value = "Hsm Customer ID")

	public String getHsmUserId() {
		return hsmUserId;
	}

	public void setHsmUserId(String hsmUserId) {
		this.hsmUserId = hsmUserId;
	}

	public CustomerDetailsResponse publicKeyConfirmed(Boolean publicKeyConfirmed) {
		this.publicKeyConfirmed = publicKeyConfirmed;
		return this;
	}

	/**
	 * Public Key Confirmed
	 * 
	 * @return publicKeyConfirmed
	 */
	@ApiModelProperty(value = "Public Key Confirmed")

	public Boolean getPublicKeyConfirmed() {
		return publicKeyConfirmed;
	}

	public void setPublicKeyConfirmed(Boolean publicKeyConfirmed) {
		this.publicKeyConfirmed = publicKeyConfirmed;
	}

	public CustomerDetailsResponse customerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	/**
	 * Customer UUID
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(value = "Customer UUID")

	@Size(min = 1, max = 50)
	public String getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
	}

	public CustomerDetailsResponse createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	/**
	 * Time of creation Entry
	 * 
	 * @return createdAt
	 */
	@ApiModelProperty(value = "Time of creation Entry")

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public CustomerDetailsResponse updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	/**
	 * Data Updated time
	 * 
	 * @return updatedAt
	 */
	@ApiModelProperty(value = "Data Updated time")

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CustomerDetailsResponse version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * version of the data
	 * 
	 * @return version
	 */
	@ApiModelProperty(value = "version of the data")

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerDetailsResponse customerDetailsResponse = (CustomerDetailsResponse) o;
		return Objects.equals(this.id, customerDetailsResponse.id)
				&& Objects.equals(this.companyName, customerDetailsResponse.companyName)
				&& Objects.equals(this.contactName, customerDetailsResponse.contactName)
				&& Objects.equals(this.contactEmail, customerDetailsResponse.contactEmail)
				&& Objects.equals(this.contactNumber, customerDetailsResponse.contactNumber)
				&& Objects.equals(this.type, customerDetailsResponse.type)
				&& Objects.equals(this.hsmUserId, customerDetailsResponse.hsmUserId)
				&& Objects.equals(this.publicKeyConfirmed, customerDetailsResponse.publicKeyConfirmed)
				&& Objects.equals(this.customerUUID, customerDetailsResponse.customerUUID)
				&& Objects.equals(this.createdAt, customerDetailsResponse.createdAt)
				&& Objects.equals(this.updatedAt, customerDetailsResponse.updatedAt)
				&& Objects.equals(this.version, customerDetailsResponse.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, companyName, contactName, contactEmail, contactNumber, type, hsmUserId,
				publicKeyConfirmed, customerUUID, createdAt, updatedAt, version);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerDetailsResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    hsmUserId: ").append(toIndentedString(hsmUserId)).append("\n");
		sb.append("    publicKeyConfirmed: ").append(toIndentedString(publicKeyConfirmed)).append("\n");
		sb.append("    customerUUID: ").append(toIndentedString(customerUUID)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
