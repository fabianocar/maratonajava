package com.maratonajava.javacore.Gassociacao.test;

import com.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konota", professores);

        escola.imprime();
    }
}
