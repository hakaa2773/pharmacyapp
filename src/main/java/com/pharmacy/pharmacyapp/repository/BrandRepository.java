package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.BrandDto;
import com.pharmacy.pharmacyapp.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.BrandDto (b.id, b.name, c.id, c.name) FROM Brand b JOIN Category c ON b.category = c", nativeQuery = false)
	List<BrandDto>getbycatname();
	

}
