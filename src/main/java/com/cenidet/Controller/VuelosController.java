package com.cenidet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.entity.Vuelos;
import com.cenidet.repository.VuelosRepository;
import com.cenidet.service.VuelosService;
import com.cenidet.service.VuelosServiceImpl;

@Controller
public class VuelosController {

	@Autowired
	private VuelosRepository repository;
	
	@GetMapping("/vuelos")
	public String verVuelos(Model model){
		List<Vuelos> vuelos = repository.findAll();
		model.addAttribute("vuelos",vuelos);
		return "vuelos";
	}
	
	@GetMapping("/vuelos")
	public String verVuelosFiltro(String filtro,Model model){
		List<Vuelos> vuelos = repository.;
		model.addAttribute("vuelos",vuelos);
		return "vuelos";
	}
	
}
