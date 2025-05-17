package com.cenidet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;


@Entity
@Table(name="PAISES")
@Getter
@Setter
public class Pais {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "codigo_iso")
    private String codigo_iso;
    
    public Integer getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getCodigoIso() {
        return this.codigo_iso;
    }
}