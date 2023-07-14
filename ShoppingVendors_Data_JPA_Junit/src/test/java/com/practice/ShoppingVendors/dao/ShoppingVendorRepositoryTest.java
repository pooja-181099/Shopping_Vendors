package com.practice.ShoppingVendors.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.practice.ShoppingVendors.model.ShoppingVendor;

@DataJpaTest
public class ShoppingVendorRepositoryTest {

	@Autowired
	private ShoppingVendorRepository dao;
	ShoppingVendor shoppingVendor;
	
	@BeforeEach
	void setUp() {
		shoppingVendor = new ShoppingVendor("1001","Amazon","London","xy6789");
		dao.save(shoppingVendor);
	}
	
	@AfterEach
	void tearDown() {
		shoppingVendor = null;
		dao.deleteAll();
	}
	
	@Test
	void testFindByVendorNameSuccess() {
		List<ShoppingVendor> vendorList = dao.findByVendorName("Amazon");
		assertThat(vendorList.get(0).getVendorId()).isEqualTo(shoppingVendor.getVendorId());
		assertThat(vendorList.get(0).getVendorAddress()).isEqualTo(shoppingVendor.getVendorAddress());

	}
	
	@Test
	void testFindByVendorNameFailure() {
		List<ShoppingVendor> vendorList = dao.findByVendorName("GCP");
		assertThat(vendorList.isEmpty()).isTrue();

	}
	
	
}
