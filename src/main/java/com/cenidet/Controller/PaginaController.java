package com.cenidet.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/vuelos")
	public String destinos() {
		return "vuelos";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/form_registros")
	public String form_registros() {
		return "form_registros";
	}
}