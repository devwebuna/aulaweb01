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

    @GetMapping("/")
    @ResponseBody
    public String ola() {
        return "<html><body>"
                + "<form action='/comprimento'>"
                + "digite seu nome: <input name='nome'/>"
                + "<input type='submit' value='enviar' />"
                + "</form>"
                + "</body></html>";
    }

    @GetMapping("/comprimento")
    @ResponseBody
    public String comprimento(String nome) {
        return "<h1>Bem vindo " + nome + "</h1>";
    }
}
