package com.cenidet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenidet.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Integer>{

}
