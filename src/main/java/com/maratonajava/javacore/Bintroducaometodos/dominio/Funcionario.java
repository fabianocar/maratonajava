package com.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(Funcionario funcionario) {
        if(salarios == null) {
            return;
        }
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        for(double salario: salarios) {
            System.out.println("Salario: " + salario);
        }
    }

    public static void calcularMedia(double[] salarios) {
        if(salarios == null) {
            return;
        }
        System.out.println("Média :"+ (salarios[0] + salarios[1] + salarios[2])/salarios.length);
    }
}
