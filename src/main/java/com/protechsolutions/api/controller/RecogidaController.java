package com.protechsolutions.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protechsolutions.api.entity.Recogida;
import com.protechsolutions.api.service.IRecogidaService;


@RestController
@RequestMapping("/recogida")
@CrossOrigin("*")
public class RecogidaController {

    private IRecogidaService recogidaService;

    public RecogidaController(IRecogidaService recogidaService) {
        this.recogidaService = recogidaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> recogidaById(@PathVariable int id) {
        var result = recogidaService.consultarRecogidaById(id);
        if (result == null) {
            return   new ResponseEntity<>("Recogida no encontrada", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?>  crearRecogida(@RequestBody Recogida recogida) {

        var result = recogidaService.crearRecogida(recogida);
        return ResponseEntity.ok(result);
    }



    @GetMapping("/{placa}")
    public ResponseEntity<?> RecogidaByPlaca(@PathVariable String placa) {

        var result = recogidaService.consultarRecogidaByPlaca(placa);
        if (result == null) {
            return   new ResponseEntity<>("Recogida no encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
    
}
