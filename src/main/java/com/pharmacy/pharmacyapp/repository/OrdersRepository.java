package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.OrdersDto;
import com.pharmacy.pharmacyapp.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.OrdersDto(o.id, o.odate, o.oqty, o.oprice, o.ototal, i.id, i.date, i.total, d.id, d.name, d.price ) FROM Orders o "
			+ "JOIN Invoice i ON o.invoice = i " 
			+ "JOIN Drugs d ON o.drugs = d ",
			nativeQuery = false)
	List<OrdersDto>getallOrdernames();

}
