package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.BrandDto;
import com.pharmacy.pharmacyapp.model.Brand;
import com.pharmacy.pharmacyapp.service.BrandService;

@RestController
public class BrandController {
	@Autowired
	private BrandService brandService;
	@RequestMapping(method = RequestMethod.POST,value = "/savebrand")
	public void saveBrand(@RequestBody Brand brand) {
		brandService.saveBrand(brand);
	}
	@RequestMapping("/getallbrand")
	public List <Brand> getAll(){
		return brandService.getallBrand();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatebrand/{id}")
	public void updateBrand(@PathVariable Integer id,@RequestBody Brand brand) {
		brandService.updateBrand(id,brand);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletebrand/{id}")
	public void deleteBrand(@PathVariable Integer id) {
		brandService.deleteBrand(id);		
	}
	
	@GetMapping("/getbycatid")
	public List<BrandDto> getallCatnum (){
		return brandService.getallCatnum();
	}

}
