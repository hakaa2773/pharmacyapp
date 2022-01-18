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

import com.pharmacy.pharmacyapp.model.Invoice;
import com.pharmacy.pharmacyapp.model.Stock;
import com.pharmacy.pharmacyapp.service.DrugService;
import com.pharmacy.pharmacyapp.service.InvoiceService;

@Controller
public class InvoiceWebController {
	@Autowired
	private InvoiceService invoiceService;
	@Autowired
	private DrugService drugService;
	
	@GetMapping("/viewinvoice")
	public String getAllInvoice(Model model) {
		model.addAttribute("invoice", invoiceService.getallBrandnames());
		return"invoice";	
	}
	
	@GetMapping("/showdrugg/{id}")
	public String showEditDrug(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("drugss", drugService.getById(id));
		return"invoice";
	}
	
	
	
	@PostMapping("/addnewinvoice")
	public String addnewinvoice(@Valid Invoice invoice, BindingResult result, Model model){
		if(result.hasErrors()) {
			return "newinvoice";
		}
		invoiceService.saveInvoice(invoice);
		return "redirect:/invoicee";				
	}
	
	
	@PostMapping("/updateStockqty/id")
	public String updateStock(@PathVariable ("id") Integer id, @Valid Stock stock, BindingResult result, Model model){
	    if(result.hasErrors()){
	        stock.setId(id);
	        model.addAttribute("stock",stock);
	        return  "invoice";
	    }
	    Optional<Stock> stOptional = invoiceService.reduceStockQty(id, stock.getSqty());
	    return "redirect:/viewinvoice";
	}

}
