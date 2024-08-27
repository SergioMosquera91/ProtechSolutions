package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Recogida;
import com.protechsolutions.api.repository.IRecogidaRepository;

@Service
public class RecogidaService implements IRecogidaService {

    private IRecogidaRepository _recogidaRepository;

    public RecogidaService(IRecogidaRepository recogidaRepository) {
        this._recogidaRepository = recogidaRepository;
    }

    @Override
    public Recogida crearRecogida(Recogida recogida) {

        return _recogidaRepository.save(recogida);
    }

    @Override
    public Recogida consultarRecogidaById(int id) {

        return _recogidaRepository.findById(id).orElseGet(() -> null);
    }

    @Override
    public Recogida consultarRecogidaByPlaca(String placa) {

         return _recogidaRepository.findAll().stream().filter(recogida -> recogida.getVehiculo().getPlaca().equals(placa)).findFirst().orElse(null);
    }



}
