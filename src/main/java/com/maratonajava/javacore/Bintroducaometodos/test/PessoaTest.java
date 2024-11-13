package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maratona");
        pessoa.setIdade(-2);
        System.out.println(pessoa.getNome()+" "+pessoa.getIdade());
    }
}
