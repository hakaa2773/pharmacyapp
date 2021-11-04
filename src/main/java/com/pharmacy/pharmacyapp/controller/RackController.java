package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.RackDto;
import com.pharmacy.pharmacyapp.model.Rack;
import com.pharmacy.pharmacyapp.service.RackService;


@RestController
public class RackController {
	@Autowired
	private RackService rackService;
	@RequestMapping(method = RequestMethod.POST,value = "/saverack")
	public void saveRack(@RequestBody Rack rack) {
		rackService.saveRack(rack);
	}
	@RequestMapping("getallrack")
	public List<Rack>getAll(){
		return rackService.getallRack();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updaterack/{id}")
	public void updateRack(@PathVariable Integer id, @RequestBody Rack rack) {
		rackService.updateRack(id,rack);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleterack/{id}")
	public void deleteRack(@PathVariable Integer id) {
		rackService.deleteRack(id);		
	}
	@GetMapping("/getbyracknames")
	public List<RackDto> getallRackNames(){
		return rackService.getallRackNames();
	}

}
