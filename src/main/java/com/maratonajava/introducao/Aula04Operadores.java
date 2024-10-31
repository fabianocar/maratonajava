package com.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);

        // %
        int resto = 20 % 2;

        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDifereneteDez = 10 != 10.0;

        System.out.println("isDezMaioQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDifereneteDez " + isDezDifereneteDez);

        // && || !
        int idade = 29;
        float salario = 3500.0F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isdentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isdentroDaLeiMenorQueTrinta " + isdentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorToatalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation
                || valorToatalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
