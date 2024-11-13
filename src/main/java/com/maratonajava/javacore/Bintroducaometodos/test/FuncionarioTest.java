package com.maratonajava.javacore.Bintroducaometodos.test;

import com.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maratona");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime(funcionario);

        Funcionario.calcularMedia(funcionario.getSalarios());

    }
}
