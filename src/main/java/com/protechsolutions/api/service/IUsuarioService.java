package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Usuario;

@Service
public interface IUsuarioService {

    public Usuario crearUsuario(Usuario usuario);

    public Usuario consultarUsuarioById(int id);

    
}
