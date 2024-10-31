package com.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado um valor de um carro calcule quantas parcelas podem
        //ser feitas, condição parcela miníma de 1000

        double valorTotal = 40000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
        }
    }
}
