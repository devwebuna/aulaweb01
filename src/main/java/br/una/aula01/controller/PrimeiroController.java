package br.una.aula01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello <br> World";
    }

    @GetMapping("/nome")
    @ResponseBody
    public String nome() {
        return "Guilherme";
    }
}
