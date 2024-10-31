package com.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args){
        //int, double, float, char, byte, short, long, boolean
        int idade = (int)10000000000L; //casting
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float)2500.0D;//casting
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";
        
        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("caractere é "+caractere);
        System.out.println("caractere é "+salarioFloat);
        System.out.println("Oi meu nome é "+nome);
    }

}
