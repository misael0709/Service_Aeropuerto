package com.cenidet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.entity.Vuelos;
import com.cenidet.service.VuelosServiceImpl;

@RestController
@RequestMapping("/api/vuelos")
public class VuelosController {

	@Autowired 
	private VuelosServiceImpl vuelosService;
	
	@GetMapping("/todos")
	public List<Vuelos> verVuelos(){
		return vuelosService.verVuelos();
	}
	
}
