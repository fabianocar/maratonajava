package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Maratona";
        funcionario1.idade = 20;
//        funcionario1.salarios = new double[]{1200, 987.32, 2000};

        funcionario1.imprime(funcionario1);

        Funcionario.calcularMedia(funcionario1.salarios);

    }
}
