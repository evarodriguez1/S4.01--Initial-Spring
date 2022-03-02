package com.S401Spring.S4Nivel3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Saludo {

    public class InitialController {
        @RequestMapping("/")
        public String hola() {
            return "Hola aqui Eva, esto es un proyecto con Maven.";
        }

        @PostMapping("/")
        public String holaNombre(@RequestBody String nombre) {
            return "Nivel 3 proyecto creado con Maven " + nombre;
        }
    }
}
