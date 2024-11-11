package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Maratona";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Java";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante.imprime();
        estudante2.imprime();

    }
}
