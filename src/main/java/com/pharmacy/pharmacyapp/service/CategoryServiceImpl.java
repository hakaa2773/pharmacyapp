package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Category;
import com.pharmacy.pharmacyapp.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
	}
	@Override
	public List<Category> getallCategorys() {
		// TODO Auto-generated method stub
		List<Category>categoryList =new ArrayList<Category>();
		categoryRepository.findAll().forEach(categoryList::add);
		return categoryList;
	}
	@Override
	@Transactional
	public Optional<Category> updateCategory(Integer id, Category category) {
		// TODO Auto-generated method stub
		//category.setId(id);
		//categoryRepository.save(category);
		return categoryRepository.findById(id).map(e->{
			e.setName(category.getName());
			return e;
	});
		
		
	}
	@Override
	public void deleteCategory(Integer id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}
	@Override
	public Category getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Category> cat = Optional.ofNullable(categoryRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid Id")));
		Category category = cat.get();
		return category;
	}

}
