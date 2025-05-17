package com.cenidet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenidet.entity.Vuelos;
import com.cenidet.repository.VuelosRepository;

@Service
public class VuelosServiceImpl implements VuelosService{

	@Autowired
	private VuelosRepository repository;

	@Override
	public List<Vuelos> verVuelos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
}
