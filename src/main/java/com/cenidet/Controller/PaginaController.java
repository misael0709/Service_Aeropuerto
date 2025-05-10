package com.cenidet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

	@Autowired
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/vuelos")
	public String vuelos() {
		return "vuelos";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/form_registros")
	public String form_registros() {
		return "form_registros";
	}
	
	@GetMapping("/detalle_vuelo")
	public String detalle_vuelo() {
		return "detalle_vuelo";
	}
}
