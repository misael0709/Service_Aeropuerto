package com.cenidet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="viajeros")
public class Viajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pasajero;
	private String nombres;
	private String apellidos;
	private String correo;
	private String telefono;
	private String contrasena;
	
	public Integer getId_pasajero() {
		return id_pasajero;
	}
	public void setId_pasajero(Integer id_pasajero) {
		this.id_pasajero = id_pasajero;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombre) {
		this.nombres = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	}
