package com.protechsolutions.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protechsolutions.api.entity.Cargo;

public interface ICargoUsuarioRepository extends JpaRepository<Cargo, Integer> {
    
}


