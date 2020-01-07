package com.vikas.test.mavenaws.api.model.request;

import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserLoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-05T17:29:07.890+05:30[Asia/Calcutta]")

public class UserLoginRequest {
	@JsonProperty("username")
	private String username;

	@JsonProperty("password")
	private String password;

	public UserLoginRequest username(String username) {
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

	public UserLoginRequest password(String password) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserLoginRequest userLoginRequest = (UserLoginRequest) o;
		return Objects.equals(this.username, userLoginRequest.username)
				&& Objects.equals(this.password, userLoginRequest.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserLoginRequest {\n");

		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
