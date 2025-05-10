package com.cenidet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.implementacion.VuelosImpl;
import com.cenidet.modelos.Vuelos;

@RestController
@RequestMapping("/api/vuelos")
@CrossOrigin(origins = "http:localhost:8080")
public class VuelosController {

	@Autowired
	private VuelosImpl vuelos;
	
	@GetMapping
	public List<Vuelos> getAllVuelos(){
		return vuelos.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
	    List<Vuelos> lista = vuelos.findAll();
	    return "Número de vuelos: " + (lista != null ? lista.size() : "null");
	}
}
