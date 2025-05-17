package com.cenidet.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.service.VuelosServiceImpl;

@RestController
@RequestMapping("/api/vuelos")
public class VuelosController {

	@Autowired 
	private VuelosServiceImpl vuelosService;
	
	@GetMapping("/todos")
    public List<Map<String, Object>> obtenerVuelosFiltrados(
        @RequestParam(required = false) String origen,
        @RequestParam(required = false) String destino,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaSalida,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaLlegada) {
        
        return vuelosService.obtenerVuelosConDetallesFiltrados(
            origen,
            destino,
            fechaSalida,
            fechaLlegada
        );
    }
	
}
