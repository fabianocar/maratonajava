package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

//parametros primitivos passam uma cópia pra o métodos e não referência
public class CalculadoraTest05 {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();
       int[] numeros = {1,2,3,4,5};
       calculadora.somaArray(numeros);
       calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
