package com.cenidet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenidet.entity.Vuelos;
import com.cenidet.service.VuelosService;

@Controller
public class VuelosController {

	@Autowired
	private VuelosService service;
	
	@RequestMapping("/verVuelos")
	public String verVuelos(Model m) {
		List<Vuelos> lista = service.listaVuelos();
		m.addAttribute("Vuelos",lista);
		return null;
	}
	
}
