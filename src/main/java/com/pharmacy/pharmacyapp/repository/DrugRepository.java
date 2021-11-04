package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.DrugDto;
import com.pharmacy.pharmacyapp.model.Drugs;

public interface DrugRepository extends CrudRepository<Drugs, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.DrugDto(d.id,d.name,d.price,b.id,b.name,c.id,c.name,r.id,r.row) FROM Drugs d "
			+ "JOIN Brand b ON d.brand = b "
			+ "JOIN Category c ON d.category = c "
			+ "JOIN Rack r ON d.rack = r",
			nativeQuery = false)
	List<DrugDto>getbynames();
}
