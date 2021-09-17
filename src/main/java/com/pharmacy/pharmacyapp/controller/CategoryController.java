package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Category;
import com.pharmacy.pharmacyapp.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@RequestMapping(method = RequestMethod.POST,value = "/savecategory")
	public void saveCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);		
	}
	@RequestMapping("/getallcategory")
	public List<Category> getAll(){
		return categoryService.getallCategorys();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatecategory/{id}")
	public void updateCategory(@PathVariable Integer id, @RequestBody Category category) {
		categoryService.updateCategory(id,category);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletecategory/{id}")
	public void deleteCategory(@PathVariable Integer id) {
		categoryService.deleteCategory(id);
		
	}

}
