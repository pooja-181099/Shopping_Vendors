package com.practice.ShoppingVendors.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShoppingVendorExceptionHandler {

	@ExceptionHandler(value = {ShoppingVendorNotFoundException.class})
	public ResponseEntity<Object> handleShoppingVendorNotFoundException
	(ShoppingVendorNotFoundException shoppingVendorNotFoundException){
		
		ShoppingVendorException shoppingVendorException = new ShoppingVendorException(
				
				shoppingVendorNotFoundException.getCause(),
				shoppingVendorNotFoundException.getMessage(),
				HttpStatus.NOT_FOUND
				
		);
		return new ResponseEntity<>(shoppingVendorException,HttpStatus.NOT_FOUND);
		
	}
}

