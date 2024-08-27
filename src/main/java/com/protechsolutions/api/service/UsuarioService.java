package com.protechsolutions.api.service;

import org.springframework.stereotype.Service;

import com.protechsolutions.api.entity.Usuario;
import com.protechsolutions.api.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    private IUsuarioRepository _usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this._usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {

        return _usuarioRepository.save(usuario);
    }

    @Override
    public Usuario consultarUsuarioById(int id) {

        return _usuarioRepository.findById(id).orElseGet(() -> null);
    
    }

}
