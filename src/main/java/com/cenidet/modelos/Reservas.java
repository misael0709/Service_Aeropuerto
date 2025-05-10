package com.cenidet.modelos;

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
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    private Viajeros id_pasajero;
    
    @ManyToOne
    private Vuelos id_vuelos;
    
    @ManyToOne
    private Ruta id_ruta;
    
    @ManyToOne
    private Pais id_pais;
    
    @ManyToOne
    private Aerolinea id_aerolinea;
    
    private String asiento;
    private String estado;
}