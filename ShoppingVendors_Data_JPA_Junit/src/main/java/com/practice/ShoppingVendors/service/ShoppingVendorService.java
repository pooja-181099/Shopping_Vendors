package com.practice.ShoppingVendors.service;

import java.util.List;
import com.practice.ShoppingVendors.model.ShoppingVendor;


public interface ShoppingVendorService {

	public ShoppingVendor getDetailsById(String id);
	public String addShoppingVendor(ShoppingVendor shoppingVendor);
	public String updateShoppingVendor(ShoppingVendor shoppingVendor);
	public String deleteShoppingVendor(String id);
	public List<ShoppingVendor> getAllShoppingVendors();
	public List<ShoppingVendor> getByVendorName(String vendorName);
}
