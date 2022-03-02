package com.S401Spring.S4Nivel2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @RequestMapping("/")
    public String hola() {
        return "Hola mundo, aquí Eva, esto es un proyecto con Gradle.";
    }
    @PostMapping("/")
    public String holaNombre(@RequestBody String nombre) {
        return "Fase 2 ejercicio Gradle. " + nombre;
    }
}
