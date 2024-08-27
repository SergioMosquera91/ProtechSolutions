package com.protechsolutions.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Cargo;
import com.protechsolutions.api.repository.ICargoUsuarioRepository;

@Service
public class CargoUsuarioService implements ICargoUsuarioService {

    private ICargoUsuarioRepository _cargoUsuarioRepository;

    public CargoUsuarioService(ICargoUsuarioRepository cargoUsuarioRepository) {
        this._cargoUsuarioRepository = cargoUsuarioRepository;
    }

    @Override
    public List<Cargo> ConsultarCargos() {

        return _cargoUsuarioRepository.findAll();
        
    }

    @Override
    public Cargo CrearCargo(Cargo cargo) {

        return _cargoUsuarioRepository.save(cargo);
        
    }

    @Override
    public void EliminarById(int id) {

        _cargoUsuarioRepository.deleteById(id);
    }

}
