package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Recogida;

@Service
public interface IRecogidaService {
    
    public Recogida crearRecogida (Recogida recogida);

    public Recogida consultarRecogidaById (int id);

    public Recogida consultarRecogidaByPlaca (String placa);
}
