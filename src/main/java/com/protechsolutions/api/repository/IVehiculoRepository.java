package com.protechsolutions.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protechsolutions.api.entity.Vehiculo;

public interface IVehiculoRepository extends JpaRepository <Vehiculo, Integer> {

}
