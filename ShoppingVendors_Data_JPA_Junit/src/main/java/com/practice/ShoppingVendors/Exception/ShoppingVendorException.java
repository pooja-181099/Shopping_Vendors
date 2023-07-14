package com.practice.ShoppingVendors.Exception;

import org.springframework.http.HttpStatus;

public class ShoppingVendorException {

	private final Throwable throwable;
	private final String message;
	private final HttpStatus httpStatus;
	
	public ShoppingVendorException(Throwable throwable, String message, HttpStatus httpStatus) {
		super();
		this.throwable = throwable;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
}
