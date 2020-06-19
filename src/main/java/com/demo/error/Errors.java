package com.demo.error;

public enum Errors {

	INVALID_COUNTRY_CODE("0000", "INVALID_COUNTRY_CODE"), 
	INTERNAL_ERROR("0001", "INTERNAL_ERROR"),;
	
	private final String code;
	private final String message;

	private Errors(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
