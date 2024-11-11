package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Maratona";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Java";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        impressora.imprimeEstudante(estudante);
        impressora.imprimeEstudante(estudante2);

        System.out.println("#########");

        impressora.imprimeEstudante(estudante);
        impressora.imprimeEstudante(estudante2);

    }
}
