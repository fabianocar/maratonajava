package com.maratonajava.javacore.Eblocosdeinicializacao.test;

import com.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print( episodio +" ");
        }
    }
}
