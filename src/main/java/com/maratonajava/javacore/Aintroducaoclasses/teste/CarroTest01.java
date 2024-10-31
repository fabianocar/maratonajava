package com.maratonajava.javacore.Aintroducaoclasses.teste;

import com.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Focus";
        carro.modelo = "Ford";
        carro.ano = 2015;

        Carro carro1 = new Carro();
        carro1.nome = "Astra";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2001;

        carro = carro1;

        System.out.println(carro.toString());
        System.out.println(carro1.toString());
    }
}
