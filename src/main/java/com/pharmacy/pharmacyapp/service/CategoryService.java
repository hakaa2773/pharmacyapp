package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.model.Category;

public interface CategoryService {

	void saveCategory(Category category);

	List<Category> getallCategorys();
	
	public Category getById(Integer id);

	public Optional<Category> updateCategory(Integer id, Category category);

	void deleteCategory(Integer id);

}
