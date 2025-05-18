package com.cenidet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenidet.entity.Viajeros;
import com.cenidet.repository.ViajerosRepository;

@Service
public class ViajerosService {

	@Autowired
	private ViajerosRepository viajerosRepository;
	
	public Viajeros registrar(Viajeros Viajero) {
		return viajerosRepository.save(Viajero);
	}
}
