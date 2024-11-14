package com.maratonajava.javacore.Dconstrutores.test;

import com.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma Drive 2", "TV", 1, "Ação", "Production IG");
        anime.imprime();
        Anime anime1 = new Anime();
        anime1.imprime();
    }
}
