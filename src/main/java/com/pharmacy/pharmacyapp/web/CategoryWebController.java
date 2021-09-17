package com.pharmacy.pharmacyapp.web;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmacy.pharmacyapp.model.Category;
import com.pharmacy.pharmacyapp.model.Pharmacist;
import com.pharmacy.pharmacyapp.service.CategoryService;

@Controller
public class CategoryWebController {
	@Autowired
	private CategoryService categoryService;

	
	@GetMapping("/viewCategory")
	public String getAllCategory(Model model) {
		model.addAttribute("category",categoryService.getallCategorys());
		return"viewcategory";
	}
	
	
	
	@GetMapping("/showaddcategory")
	public String ShowAddCategoryForm(Category category) {
		return "newcategory";
	}
	@PostMapping("/addnewcategory")
	public String addNewCategory(@Valid Category category, BindingResult  result,Model model ) {
		if(result.hasErrors()) {
			return "newcategory";
		}
		categoryService.saveCategory(category);
		return "redirect:/viewCategory";
	}
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/showCategory/{id}")
	public String showEditCategoryForm(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("category", categoryService.getById(id));
		return "editcategory";		
	}
	@PostMapping("/updateCategory/{id}")
	public String updateCategory(@PathVariable("id") Integer id, @Valid Category category, BindingResult result, Model model) {
		if(result.hasErrors()) {
			category.setId(id);
			model.addAttribute("category", category);
			return"editcategory";
		}
		Optional<Category> catOptional =categoryService.updateCategory(id, category);
		return "redirect:/viewCategory";
	}
	
	@GetMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable("id") Integer id, Model model) {
		categoryService.deleteCategory(id);
		return "redirect:/viewCategory";
	}

}
