package com.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Professor {
    public String nome;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo + "";
    }
}
