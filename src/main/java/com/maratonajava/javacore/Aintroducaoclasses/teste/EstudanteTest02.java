package com.maratonajava.javacore.Aintroducaoclasses.teste;

import com.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Maratona";
        estudante.idade = 20;
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Java";
        estudante2.idade = 30;
        estudante2.sexo = 'M';

        System.out.println(estudante.toString());
        System.out.println(estudante2.toString());
    }
}
