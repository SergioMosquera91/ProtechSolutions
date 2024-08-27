package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Vehiculo;
import com.protechsolutions.api.repository.IVehiculoRepository;

@Service
public class VehiculoService implements IVehiculoService {

    public VehiculoService(IVehiculoRepository vehiculoRepository) {
        this._vehiculoRepository = vehiculoRepository;
    }
    
    private IVehiculoRepository _vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {

        return _vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo consultarVehiculoByPlaca(String placa) {

        return _vehiculoRepository.findAll().stream().filter( v -> v.getPlaca().equals(placa)).findFirst().orElse(null);
    }

}
