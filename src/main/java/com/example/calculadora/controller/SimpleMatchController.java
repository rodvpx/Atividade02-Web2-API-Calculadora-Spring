package com.example.calculadora.controller;

import com.example.calculadora.service.SimpleMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMatchController {

    @Autowired
    private final SimpleMatchService simpleMatchService;

    public SimpleMatchController(SimpleMatchService simpleMatchService) {
        this.simpleMatchService = simpleMatchService;
    }

    @GetMapping("/soma/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return simpleMatchService.sum(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    @GetMapping("/subtrai/{numberOne}/{numberTwo}")
    public Double subtract(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return simpleMatchService.subtract(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    @GetMapping("/multiplica/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return simpleMatchService.multiplication(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    @GetMapping("/divide/{numberOne}/{numberTwo}")
    public Double division(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return simpleMatchService.division(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }

    @GetMapping("/media/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return simpleMatchService.mean(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
    }
}
