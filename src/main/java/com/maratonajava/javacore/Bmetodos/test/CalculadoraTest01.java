package com.maratonajava.javacore.Bmetodos.test;

import com.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora");
        calculadora.subtraiDoisNumeros();
    }
}
