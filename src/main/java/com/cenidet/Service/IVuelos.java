package com.cenidet.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenidet.modelos.Vuelos;

public interface IVuelos extends JpaRepository<Vuelos,Integer>{
	
}
