package com.demo.error;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
@JsonView
public class APIError implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2296517119509237324L;
	/**
	 * 
	 */	

	private String errorCode;
	 private String errorMessage;
	    
	    
		public APIError(String status, String message) {
			this.errorCode = status;
			this.errorMessage = message;
		}


		public APIError(String errorCode, String errorMessage, String developerMessage) {
			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
		}
	 
	

		public String getErrorCode() {
			return errorCode;
		}


		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}


		public String getErrorMessage() {
			return errorMessage;
		}


		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

	
}

