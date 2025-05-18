package com.cenidet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="viajeros")
@Getter
@Setter
public class Viajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pasajero;
	private String nombre;
	private String apellidos;
	private String correo;
	private String telefono;
	private String contrasena;
	}
