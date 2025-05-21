package com.cenidet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.entity.Viajeros;
import com.cenidet.service.ViajerosService;

@RestController
@RequestMapping("/api/viajeros")
public class ViajerosController {
	

	@Autowired
	private ViajerosService viajerosService;
	
	@PostMapping("/registro")
	public ResponseEntity<?> registrarViajero(@RequestBody Viajeros viajero) {
        try {
            Viajeros nuevoViajero = viajerosService.registrar(viajero);
            return ResponseEntity.ok(nuevoViajero);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
	
}
