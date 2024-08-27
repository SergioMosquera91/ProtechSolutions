package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Vehiculo;

@Service
public interface IVehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public Vehiculo consultarVehiculoByPlaca(String placa);

    
}