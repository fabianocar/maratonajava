package com.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante) {
        System.out.println("--------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "Gohan";// Nunca alterar o parametro dentro do método
    }
}
