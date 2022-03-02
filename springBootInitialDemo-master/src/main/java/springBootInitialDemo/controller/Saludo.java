package springBootInitialDemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @RequestMapping("/")
    public String hola() {
        return "Hola aqui Eva, esto es un proyecto con Gradle.";
    }

    @RequestMapping("/fase2")
    public String holaNombre(String nombre) {
        nombre = "Eva";
        return "Fase 2 ejercicio Gradle. " + nombre;
    }
}