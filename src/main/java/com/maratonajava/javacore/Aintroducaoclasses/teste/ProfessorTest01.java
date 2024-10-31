package com.maratonajava.javacore.Aintroducaoclasses.teste;

import com.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Maratona";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.toString());
    }
}
