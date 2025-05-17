package com.cenidet.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenidet.entity.Vuelos;
import com.cenidet.repository.VuelosRepository;

@Service
public class VuelosServiceImpl implements VuelosService{

	@Autowired
	private VuelosRepository repository;
 
	public List<Map<String, Object>> obtenerVuelosConDetallesFiltrados(
		    String codigoIsoOrigen, 
		    String codigoIsoDestino, 
		    LocalDate fechaSalida, 
		    LocalDate fechaLlegada) {
		    
		    // Llamada al repositorio con los parámetros de filtro
		    List<Object[]> resultados = repository.obtenerVuelosConDetalles(
		        codigoIsoOrigen,
		        codigoIsoDestino,
		        fechaSalida,
		        fechaLlegada
		    );
		    
		    // Procesamiento de los resultados (igual que antes)
		    List<Map<String, Object>> vuelos = new ArrayList<>();
		    
		    for (Object[] row : resultados) {
		        Map<String, Object> vuelo = new HashMap<>();
		        vuelo.put("aerolinea", row[0]);
		        vuelo.put("codigoISOOrigen", row[1]);
		        vuelo.put("codigoISODestino", row[2]);
		        vuelo.put("estado", row[3]);
		        vuelo.put("fechaSalida", row[4]);
		        vuelo.put("fechaLlegada", row[5]);
		        vuelo.put("horaSalida", row[6]);
		        vuelo.put("horaLlegada", row[7]);
		        vuelo.put("precio", row[8]);
		        vuelo.put("distanciaKm", row[9]);
		        vuelos.add(vuelo);
		    }
		    
		    return vuelos;
		}

	@Override
	public List<Vuelos> verVuelos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
