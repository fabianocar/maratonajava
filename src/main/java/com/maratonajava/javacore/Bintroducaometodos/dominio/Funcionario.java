package com.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
