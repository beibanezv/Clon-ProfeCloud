package com.example.holaMundo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1Controller {
    @GetMapping
    public String holaMundo() {
        return "hola mundo v1.0.0- bug corregido v1.1.1";
    }
    @PostMapping
    public String despedida() {
        return "despedida V1.1.0";
    }
    
}
