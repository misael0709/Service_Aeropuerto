package com.cenidet.modelos;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vuelos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
    private Ruta ruta;
    
    @ManyToOne
    private Pais pais;
    
    @ManyToOne
    private Aerolinea aerolinea;
    
	private Integer num_vuelo;
	private LocalDateTime fecha_salida;
	private LocalDateTime fecha_llegada;
	private String estado;
	private double precio;
}
