package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.SupplierDto;
import com.pharmacy.pharmacyapp.model.Supllier;

public interface SupllierRepository extends CrudRepository<Supllier, Integer>{
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.SupplierDto (s.id, s.name,s.email, b.id, b.name) FROM Supllier s JOIN Brand b ON s.brand = b", nativeQuery = false)
	List<SupplierDto>getbybrandname();

}
