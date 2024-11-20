package com.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
//    0 - Bloco de inicialização é executado quando a JVM carregar a classe
//    1 - Alocado espaço em mem´ria para objeto
//    2 - Cada atributo de classe é criado e inicializado com valor default o que for passado
//    3 - Bloco de inicialização é executado
//    4 - Construtor executado
    static {
        System.out.println("dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 1; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
