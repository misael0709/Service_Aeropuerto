package com.cenidet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenidet.repository.ViajerosRepository;
import com.cenidet.entity.Viajeros;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	    @Autowired
	    private ViajerosRepository viajerosRepository;

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestBody Viajeros viajeroLogin) {
	        // Buscar directamente por email y password
	        Viajeros viajero = viajerosRepository.findByEmailAndPassword(
	            viajeroLogin.getCorreo(), 
	            viajeroLogin.getContrasena()
	        );
	        
	        if (viajero != null) {
	            return ResponseEntity.ok("Login exitoso");
	        } else {
	            return ResponseEntity.status(401).body("Credenciales incorrectas");
	        }
	    }
}
