package com.cenidet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenidet.entity.Viajeros;

@Repository
public interface ViajerosRepository extends JpaRepository<Viajeros,Integer>{

}
