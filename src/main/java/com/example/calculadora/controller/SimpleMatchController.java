package com.example.calculadora.controller;

import com.example.calculadora.service.SimpleMatchService;
import com.example.calculadora.exception.NumberConverter;
import com.example.calculadora.exception.UnsupporteMathOperationException;
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

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double e realiza a soma usando o serviço de cálculo
        return simpleMatchService.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(@PathVariable String numberOne, @PathVariable String numberTwo) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double e realiza a subtração usando o serviço de cálculo
        return simpleMatchService.subtract(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable String numberOne, @PathVariable String numberTwo) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double realiza a multiplicação o serviço de cálculo
        return simpleMatchService.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable String numberOne, @PathVariable String numberTwo) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double e realiza a multiplicação usando o serviço de cálculo
        return simpleMatchService.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable String numberOne, @PathVariable String numberTwo) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double e realiza a média usando o serviço de cálculo
        return simpleMatchService.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/squareroot/{number}")
    public Double squareRoot(@PathVariable String number) {

        // Verifica se os valores recebidos são numéricos
        if (!NumberConverter.isNumeric(number)) {

            // Caso contrário, lança uma exceção personalizada informando que os valores devem ser numéricos
            throw new UnsupporteMathOperationException("Por favor providencie valores numericos validos");
        }

        // Se os valores forem numéricos, converte para Double e realiza a raiz quadrada usando o serviço de cálculo
        return simpleMatchService.squareRoot(NumberConverter.convertToDouble(number));
    }
}
