package com.protechsolutions.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protechsolutions.api.entity.Cargo;
import com.protechsolutions.api.service.ICargoUsuarioService;


@RestController
@RequestMapping("/cargo")
@CrossOrigin("*")
public class CargoUsuarioController {

    private ICargoUsuarioService _cargoUsuarioService;

    public CargoUsuarioController(ICargoUsuarioService cargoUsuarioService) {
        this._cargoUsuarioService = cargoUsuarioService;
    }

    @GetMapping
    public ResponseEntity<?> listarCargos() {

        var result = _cargoUsuarioService.ConsultarCargos();
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<?>  crearCargo(@RequestBody Cargo cargo) {
        var result = _cargoUsuarioService.CrearCargo(cargo);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarById(@PathVariable int id) {

        _cargoUsuarioService.EliminarById(id);
        return ResponseEntity.ok().build();
    }
    
}
