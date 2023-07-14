package com.practice.ShoppingVendors.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.ShoppingVendors.dao.ShoppingVendorRepository;
import com.practice.ShoppingVendors.model.ShoppingVendor;

@Service
public class ShoppingVendorServiceImpl implements ShoppingVendorService{

	ShoppingVendorRepository dao;
	
	public ShoppingVendorServiceImpl(ShoppingVendorRepository dao) {
		super();
		this.dao = dao;
	}

	@Override
	public ShoppingVendor getDetailsById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public String addShoppingVendor(ShoppingVendor shoppingVendor) {
		// TODO Auto-generated method stub
		dao.save(shoppingVendor);
		return "success";
	}

	@Override
	public String updateShoppingVendor(ShoppingVendor shoppingVendor) {
		// TODO Auto-generated method stub
		dao.save(shoppingVendor);
		return "success";
	}

	@Override
	public String deleteShoppingVendor(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return "Delete Successful";
	}

	@Override
	public List<ShoppingVendor> getAllShoppingVendors() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	

}
 