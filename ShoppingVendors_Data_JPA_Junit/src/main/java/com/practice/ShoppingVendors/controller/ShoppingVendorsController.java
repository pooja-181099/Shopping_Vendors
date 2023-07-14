package com.practice.ShoppingVendors.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ShoppingVendors.model.ShoppingVendor;
import com.practice.ShoppingVendors.response.ResponseHandler;
import com.practice.ShoppingVendors.service.ShoppingVendorService;

@RestController
@RequestMapping("/shoppingvendor")
public class ShoppingVendorsController {

	ShoppingVendorService shoppingVendorService;
	
	public ShoppingVendorsController(ShoppingVendorService shoppingVendorService) {
		super();
		this.shoppingVendorService = shoppingVendorService;
	}

	@GetMapping("/msg")
	public String welcome() {
		System.out.println("welcome pooja ...");
		return "welcome";
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> getDetailsById(@PathVariable("id") String id) {
		return ResponseHandler.responseBuilder("Requested Details are here", HttpStatus.OK, shoppingVendorService.getDetailsById(id));
		//return shoppingVendorService.getDetailsById(id);//("101", "Flipcart", "UK", "745678");
	}
	
	/*
	 * @GetMapping("{id}") public ShoppingVendor getDetailsById(@PathVariable("id")
	 * String id) { return
	 * ResponseHandler.responseBuilder("Requested Details are here", HttpStatus.OK,
	 * shoppingVendorService.getDetailsById(id)); //return
	 * shoppingVendorService.getDetailsById(id);//("101", "Flipcart", "UK",
	 * "745678"); }
	 */
	
	@GetMapping()
	public List<ShoppingVendor> getAllDetails() {
		return shoppingVendorService.getAllShoppingVendors();
	}
	
	@PostMapping()
	public String addShoppingVendor(@RequestBody ShoppingVendor shoppingVendor) {
		
		shoppingVendorService.addShoppingVendor(shoppingVendor);
		return "Shopping Vendor is added successfully !";
	}
	
	@PutMapping()
	public String updateShoppingVendor(@RequestBody ShoppingVendor shoppingVendor) {
		shoppingVendorService.updateShoppingVendor(shoppingVendor);
		return "Shopping Vendor is updated successfully !";
	}
	
	@DeleteMapping("{id}")
	public String deleteShoppingVendor(@PathVariable("id") String id) {
		shoppingVendorService.deleteShoppingVendor(id);
		return "Shopping Vendor is deleted successfully !";
	}
	
}

