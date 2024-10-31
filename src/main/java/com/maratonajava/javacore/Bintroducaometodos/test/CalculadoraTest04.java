package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
//parametros primitivos passam uma cópia pra o métodos e não referência
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro calculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
