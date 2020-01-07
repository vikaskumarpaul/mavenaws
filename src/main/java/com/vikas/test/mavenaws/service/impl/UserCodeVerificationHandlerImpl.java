package com.vikas.test.mavenaws.service.impl;

import org.springframework.stereotype.Service;

@Service
public class UserCodeVerificationHandlerImpl {

	/*
	 * @Value("${awshelper.clientid}") private String clientid;
	 * 
	 * @Value("${awshelper.region}") private String region;
	 * 
	 * @Autowired private UserServiceImpl usermgmnt;
	 * 
	 * private static final Logger logger =
	 * LoggerFactory.getLogger(UserCodeVerificationHandlerImpl.class);
	 * 
	 * public boolean verifyAccessCode(SignupVerifyResquest verifyrequest) {
	 * logger.info("verifying access for user {}", verifyrequest.getUsername());
	 * AnonymousAWSCredentials awsCreds = new AnonymousAWSCredentials();
	 * AWSCognitoIdentityProvider cognitoIdentityProvider =
	 * AWSCognitoIdentityProviderClientBuilder.standard() .withCredentials(new
	 * AWSStaticCredentialsProvider(awsCreds)).withRegion(Regions.fromName(
	 * "eu-central-1")) .build(); ConfirmSignUpRequest confirmSignUpRequest = new
	 * ConfirmSignUpRequest();
	 * confirmSignUpRequest.setUsername(verifyrequest.getUsername());
	 * confirmSignUpRequest.setConfirmationCode(verifyrequest.getCode()); //
	 * confirmSignUpRequest.setClientId(clientid); try { ConfirmSignUpResult
	 * confirmSignUpResult =
	 * cognitoIdentityProvider.confirmSignUp(confirmSignUpRequest); if
	 * (confirmSignUpResult.getSdkResponseMetadata().getRequestId() != null) {
	 * logger.info("Updating UserManagmentAPI for user {}",
	 * verifyrequest.getUsername()); LoginRequest loginrequest = new LoginRequest();
	 * loginrequest.setUsername(verifyrequest.getUsername()); //
	 * usermgmnt.loginUser(loginrequest); } } catch (Exception ex) {
	 * logger.error("Error while calling usermanagment API", ex.getMessage());
	 * return false; } logger.debug("user {} mail sucessfully verified",
	 * verifyrequest.getUsername()); return true;
	 * 
	 * }
	 */

}
