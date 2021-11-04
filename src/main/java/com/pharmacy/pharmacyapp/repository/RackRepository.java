package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.RackDto;
import com.pharmacy.pharmacyapp.model.Rack;

public interface RackRepository extends CrudRepository<Rack, Integer>{
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.RackDto(r.id,r.row,c.id,c.name,b.id,b.name) FROM Rack r "
			+ "JOIN Category c ON r.category = c "
			+ "JOIN Brand b ON r.brand = b ",
			nativeQuery = false)
	List<RackDto>getallRackNames();
	

}
