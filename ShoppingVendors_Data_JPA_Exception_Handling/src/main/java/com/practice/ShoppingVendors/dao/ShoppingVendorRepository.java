package com.practice.ShoppingVendors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.ShoppingVendors.model.ShoppingVendor;

public interface ShoppingVendorRepository extends JpaRepository<ShoppingVendor, String>{

}
