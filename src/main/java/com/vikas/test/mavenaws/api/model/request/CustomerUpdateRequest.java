package com.vikas.test.mavenaws.api.model.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vikas.test.mavenaws.api.model.constant.CustomerType;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class CustomerUpdateRequest {
	@JsonProperty("id")
	private Integer id;

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
	private List<CustomerType> type = new ArrayList<>();

	@JsonProperty("hsmUserId")
	private String hsmUserId;

	@JsonProperty("publicKeyConfirmed")
	private Boolean publicKeyConfirmed;

	@JsonProperty("customerUUID")
	private String customerUUID;

	public CustomerUpdateRequest id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * id of the customer
	 * 
	 * @return id
	 */
	@ApiModelProperty(required = true, value = "id of the customer")
	@NotNull

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerUpdateRequest companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	/**
	 * Name of the Company of the Registering Customer
	 * 
	 * @return companyName
	 */
	@ApiModelProperty(required = true, value = "Name of the Company of the Registering Customer")
	@NotNull

	@Size(min = 1, max = 50)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CustomerUpdateRequest contactName(String contactName) {
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

	public CustomerUpdateRequest contactEmail(String contactEmail) {
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

	public CustomerUpdateRequest contactNumber(Integer contactNumber) {
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

	public CustomerUpdateRequest type(List<CustomerType> type) {
		this.type = type;
		return this;
	}

	public CustomerUpdateRequest addTypeItem(CustomerType typeItem) {
		this.type.add(typeItem);
		return this;
	}

	/**
	 * Type of Customer
	 * 
	 * @return type
	 */
	@ApiModelProperty(required = true, value = "Type of Customer")
	@NotNull

	@Valid

	public List<CustomerType> getType() {
		return type;
	}

	public void setType(List<CustomerType> type) {
		this.type = type;
	}

	public CustomerUpdateRequest hsmUserId(String hsmUserId) {
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

	public CustomerUpdateRequest publicKeyConfirmed(Boolean publicKeyConfirmed) {
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

	public CustomerUpdateRequest customerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
		return this;
	}

	/**
	 * Customer UUID
	 * 
	 * @return customerUUID
	 */
	@ApiModelProperty(value = "Customer UUID")

	public String getCustomerUUID() {
		return customerUUID;
	}

	public void setCustomerUUID(String customerUUID) {
		this.customerUUID = customerUUID;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerUpdateRequest customerUpdateRequest = (CustomerUpdateRequest) o;
		return Objects.equals(this.id, customerUpdateRequest.id)
				&& Objects.equals(this.companyName, customerUpdateRequest.companyName)
				&& Objects.equals(this.contactName, customerUpdateRequest.contactName)
				&& Objects.equals(this.contactEmail, customerUpdateRequest.contactEmail)
				&& Objects.equals(this.contactNumber, customerUpdateRequest.contactNumber)
				&& Objects.equals(this.type, customerUpdateRequest.type)
				&& Objects.equals(this.hsmUserId, customerUpdateRequest.hsmUserId)
				&& Objects.equals(this.publicKeyConfirmed, customerUpdateRequest.publicKeyConfirmed)
				&& Objects.equals(this.customerUUID, customerUpdateRequest.customerUUID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, companyName, contactName, contactEmail, contactNumber, type, hsmUserId,
				publicKeyConfirmed, customerUUID);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerUpdateRequest {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
		sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    hsmUserId: ").append(toIndentedString(hsmUserId)).append("\n");
		sb.append("    publicKeyConfirmed: ").append(toIndentedString(publicKeyConfirmed)).append("\n");
		sb.append("    customerUUID: ").append(toIndentedString(customerUUID)).append("\n");
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
