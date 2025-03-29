package com.example.calculadora.service;

import com.example.calculadora.exception.UnsupporteMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class SimpleMatchService {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtract(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number) {

        if (number < 0) {
            throw new UnsupporteMathOperationException("Número negativo não tem raiz quadrada real.");
        }

        double guess = number; // Chute inicial
        double precision = 0.0001; // Precisão desejada

        while ((guess - number / guess) > precision || (number / guess - guess) > precision) {
            guess = (guess + number / guess) / 2;
        }

        return guess;
    }
}
