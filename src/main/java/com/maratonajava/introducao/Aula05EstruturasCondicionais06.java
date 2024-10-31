package com.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
//        Utilizando dados os valores de 1 a 7 , imprima se é dia útil ou final de semana, considerando 1 como domingo!
        byte dia = 3;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
