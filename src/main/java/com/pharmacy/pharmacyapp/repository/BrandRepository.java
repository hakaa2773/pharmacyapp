package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Integer> {
	@Query(nativeQuery = true, value = "SELECT tbl_category.category_name, tbl_brand.brand_id, tbl_brand.brand_name, tbl_brand.category_id FROM tbl_brand INNER JOIN tbl_category ON tbl_brand.category_id = tbl_category.category_id")
	List<Brand> findByCategoryID();

}
