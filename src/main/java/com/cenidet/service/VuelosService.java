package com.cenidet.service;

import java.util.List;

import com.cenidet.entity.Vuelos;

public interface VuelosService {

	public void consultaVuelo(Vuelos obj);
	public List<Vuelos> listaVuelos();
}
