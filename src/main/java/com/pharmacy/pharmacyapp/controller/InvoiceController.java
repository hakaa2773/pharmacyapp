package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.pharmacy.pharmacyapp.DTO.StockDto;
import com.pharmacy.pharmacyapp.model.Invoice;
import com.pharmacy.pharmacyapp.service.InvoiceService;

@RestController
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;
	@RequestMapping(method = RequestMethod.POST,value = "/saveinvoice")
	public void saveInvoice(@RequestBody Invoice invoice) {
		invoiceService.saveInvoice(invoice);		
	}
	
	@RequestMapping("/getallinvoice")
	public List<Invoice> getAll(){
		return invoiceService.getallInvoice();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updateinvoice/{id}")
	public void updateInvoice(@PathVariable Integer id, @RequestBody Invoice invoice) {
		invoiceService.updateInvoice(id,invoice);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteinvoice/{id}")
	public void deleteInvoice(@PathVariable Integer id) {
		invoiceService.deleteInvoice(id);
	}
	
	
	@GetMapping("/getbybrandname")
	public List<StockDto> getallBrandnames (){
		return invoiceService.getallBrandnames();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updateStockqty/{id}/{qty}")
	public int reduceStockQty(@PathVariable Integer id, @PathVariable int qty){
	    System.out.println("\n Id : "+id+" Qty: "+qty);
	    invoiceService.reduceStockQty(id, qty);
	    return 1;
	}
	
	

}
