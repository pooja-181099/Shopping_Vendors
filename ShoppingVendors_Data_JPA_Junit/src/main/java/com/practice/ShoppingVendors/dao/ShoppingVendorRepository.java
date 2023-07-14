package com.practice.ShoppingVendors.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.ShoppingVendors.model.ShoppingVendor;

public interface ShoppingVendorRepository extends JpaRepository<ShoppingVendor, String>{

	 List<ShoppingVendor> findByVendorName(String vendorName);
}
