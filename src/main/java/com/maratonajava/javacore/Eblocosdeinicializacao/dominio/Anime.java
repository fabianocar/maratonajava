package com.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
//    1 - Alocado espaço em mem´ria para objeto
//    2 - Cada atributo de classe é criado e inicializado com valor default o que for passado
//    3 - Bloco de inicialização é executado
//    4 - Construtor executado
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 1; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
