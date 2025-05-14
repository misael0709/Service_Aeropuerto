package com.cenidet.service;

import java.util.List;

import com.cenidet.entity.Vuelos;

public interface VuelosService {

	public List<Vuelos> listaVuelosFiltros(String filtro);
	public List<Vuelos> listaVuelos();
}
