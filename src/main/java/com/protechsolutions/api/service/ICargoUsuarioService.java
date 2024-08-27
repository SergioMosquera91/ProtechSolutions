package com.protechsolutions.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Cargo;

@Service
public interface ICargoUsuarioService {

    List<Cargo> ConsultarCargos();

    Cargo CrearCargo(Cargo cargo);

    void EliminarById(int id);

    
}

