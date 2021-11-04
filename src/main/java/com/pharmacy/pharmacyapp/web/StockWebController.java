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

import com.pharmacy.pharmacyapp.model.Stock;
import com.pharmacy.pharmacyapp.service.DrugService;
import com.pharmacy.pharmacyapp.service.StockService;

@Controller
public class StockWebController {
	@Autowired
	private StockService stockService;
	@Autowired
	private DrugService drugService;
	
	@GetMapping("/viewstock")
	public String getAllStock(Model model) {
		model.addAttribute("stock", stockService.getallStockNames());
		return"viewstock";
	}
	@GetMapping("/showaddstock")
	public String addnewStock(Stock stock, Model model){
		model.addAttribute("drugs", drugService.getallDrugs());
		return "newstock";
	}
	@PostMapping("/addnewstock")
	public String addNewStock(@Valid Stock stock, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "newstock";
		}
		stockService.saveStock(stock);
		return "redirect:/viewstock";
	}
	
	@GetMapping("/showstock/{id}")
	public String showEditStock(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("stock", stockService.getById(id));
		return"editstock";
	}
	@PostMapping("/updatestock/{id}")
	public String updateStock(@PathVariable("id")Integer id, @Valid Stock stock, BindingResult result, Model model){
		if(result.hasErrors()) {
			stock.setId(id);
			model.addAttribute("stock", stock);
			return"editstock";
		}
		Optional<Stock> stOptional = stockService.updateStock(id, stock);
		return "redirect:/viewstock";
	}
	@GetMapping("/deletestock/{id}")
	public String deleteStock(@PathVariable("id") Integer id, Model model) {
		stockService.deleteStock(id);
		return "redirect:/viewstock";
	}

}
