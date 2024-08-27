package com.protechsolutions.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.protechsolutions.api.entity.Vehiculo;
import com.protechsolutions.api.service.IVehiculoService;

@RestController
@RequestMapping("/vehiculo")
@CrossOrigin("*")
public class VehiculoController {

    
    private IVehiculoService vehiculoService; 

    public VehiculoController (IVehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;

    }

    @PostMapping
    public ResponseEntity<?> crearVehiculo(@RequestBody Vehiculo vehiculo) {

        var result = vehiculoService.crearVehiculo(vehiculo);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/{placa}")
    public ResponseEntity<?> consultarVehiculoByPlaca(@PathVariable String placa) {
        var result = vehiculoService.consultarVehiculoByPlaca(placa);
        if (result == null) {
            return   new ResponseEntity<>("Vehiculo no encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }

}
