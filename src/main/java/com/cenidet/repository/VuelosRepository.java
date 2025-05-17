package com.cenidet.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cenidet.entity.Vuelos;

@Repository
public interface VuelosRepository extends JpaRepository<Vuelos,Integer>{
	@Query(value = """
		    SELECT 
		        a.nombre AS aerolinea,
		        po.codigo_iso AS codigoISOOrigen,
		        pd.codigo_iso AS codigoISODestino,
		        v.estado AS estado,
		        DATE(v.fecha_salida) AS fechaSalida,
		        DATE(v.fecha_llegada) AS fechaLlegada,
		        TIME(v.fecha_salida) AS horaSalida,
		        TIME(v.fecha_llegada) AS horaLlegada,
		        v.precio AS precio,
		        r.distancia_km AS distanciaKm
		    FROM VUELOS v
		    JOIN AEROLINEA a ON v.id_aerolinea = a.id_aerolinea
		    JOIN RUTAS r ON v.id_ruta = r.id_ruta
		    JOIN PAISES po ON r.origen_id = po.id_pais
		    JOIN PAISES pd ON r.destino_id = pd.id_pais
		    WHERE (:codigoIsoOrigen IS NULL OR po.codigo_iso = :codigoIsoOrigen)
		    AND (:codigoIsoDestino IS NULL OR pd.codigo_iso = :codigoIsoDestino)
		    AND (:fechaSalida IS NULL OR DATE(v.fecha_salida) = :fechaSalida)
		    AND (:fechaLlegada IS NULL OR DATE(v.fecha_llegada) = :fechaLlegada)
		    """, nativeQuery = true)
		List<Object[]> obtenerVuelosConDetalles(
		    @Param("codigoIsoOrigen") String codigoIsoOrigen,
		    @Param("codigoIsoDestino") String codigoIsoDestino,
		    @Param("fechaSalida") LocalDate fechaSalida,
		    @Param("fechaLlegada") LocalDate fechaLlegada);
}
