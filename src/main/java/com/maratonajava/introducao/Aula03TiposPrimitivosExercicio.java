package com.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Fabiano";
        String endereco = "Rua Campo Grande";
        double salario = 3500.0D;
        Date dataRecebimentoSalario = new Date();

        System.out.println("Eu " + nome + ", morando no endereço " + endereco
                + ",\nconfirmo que recebi o salário de "
                + salario + ", na data "
                + dataRecebimentoSalario);
    }
}
