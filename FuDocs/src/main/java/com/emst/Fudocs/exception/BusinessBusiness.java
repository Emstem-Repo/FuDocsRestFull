package com.emst.Fudocs.exception;

public class BusinessBusiness extends RuntimeException{
	
	private static final long serialVersionUID = -3258329793814942121L;

	private  String errorCode;
	
	public BusinessBusiness() {
		
	}
	
	public BusinessBusiness(String errorMsg) {
		super(errorMsg);
	}
	
	public BusinessBusiness(String errorMsg, String errorCode) {
		super(errorMsg);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
