package com.maratonajava.javacore.Csobrecargametodos.test;

import com.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive 2", "TV", 1, "Ação");
        anime.imprime();
    }
}
