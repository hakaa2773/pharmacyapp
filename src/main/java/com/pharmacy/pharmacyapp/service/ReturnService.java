package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Returns;

public interface ReturnService {

	void saveReturn(Returns returns);

	List<Returns> getallReturn();

	void updateReturn(Integer id, Returns returns);

	void deleteReturn(Integer id);

}
