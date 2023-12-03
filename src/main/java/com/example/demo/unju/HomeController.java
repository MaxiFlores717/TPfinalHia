package com.example.demo.unju;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String bienvenida() {
        return "bienvenida"; // Esto devolverá el nombre de la plantilla HTML (index.html)
    }
    @GetMapping("/listar")
    public String listar() {
        return "listar"; // Esto devolverá el nombre de la plantilla HTML (index.html)
    }
}
