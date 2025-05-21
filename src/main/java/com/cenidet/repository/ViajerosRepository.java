package com.cenidet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cenidet.entity.Viajeros;

@Repository
public interface ViajerosRepository extends JpaRepository<Viajeros,Integer>{
	@Query("SELECT v FROM Viajeros v WHERE v.correo = :correo AND v.contrasena = :contrasena")
    Viajeros findByEmailAndPassword(@Param("correo") String correo, @Param("contrasena") String contrasena);
}
