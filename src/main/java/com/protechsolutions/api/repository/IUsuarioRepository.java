package com.protechsolutions.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.protechsolutions.api.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository <Usuario, Integer> {

}
