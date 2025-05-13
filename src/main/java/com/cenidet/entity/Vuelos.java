package com.cenidet.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="vuelos")
@Getter
@Setter
public class Vuelos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_vuelo;
	private Integer id_ruta;
	private Integer id_pais;
	private Integer id_aerolinea;
	private Integer num_vuelo;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_salida;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_llegada;
	private String estado;
	private double precio;
}
