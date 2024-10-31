package com.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000.00;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho consições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        boolean possoComprar = salario > 5000 ? true : false;
        System.out.println(resultado);
        System.out.println(possoComprar);
    }
}
