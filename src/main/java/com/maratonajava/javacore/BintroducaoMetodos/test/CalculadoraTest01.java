package com.maratonajava.javacore.BintroducaoMetodos.test;

import com.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora");
        calculadora.subtraiDoisNumeros();
    }
}
