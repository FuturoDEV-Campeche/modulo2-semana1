package br.com.futurodev.m2s1.exercicioscorrecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    /**
     * Criar um ArrayList para armazenar uma lista de filmes e séries.
     * Utilizando um laço de repetição, pedir ao usuário que informe
     * alguns filmes/séries ou um comando para sair (pode ser "0", mas
     * fique à vontade para mudar).
     *
     * Para isso, criar funções para:
     * - Adicionar filme/série na lista
     * - Ao sair listar os filmes/séries inseridos
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> filmesSeriesLista = new ArrayList<>();

        do {
            System.out.print("Informe um filme/série ou digite \"0\" para sair: ");
            String itemInserido = entrada.nextLine();

            if (itemInserido.equals("0")) {
                listar(filmesSeriesLista);
                break;
            }

            adicionar(filmesSeriesLista, itemInserido);

        } while (true);

    }

    public static void adicionar(List<String> filmesSeriesLista, String filmeSerie) {
        filmesSeriesLista.add(filmeSerie);
        System.out.println("Filme/Série adicionado!\n");
    }

    public static void listar(List<String> filmesSeriesLista) {
        System.out.println("Filmes/Séries:");
        for (String filmeSerie : filmesSeriesLista) {
            System.out.println(filmeSerie);
        }
    }

}
