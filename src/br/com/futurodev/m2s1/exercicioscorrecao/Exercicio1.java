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

        Scanner entrada = new Scanner(System.in); // Cria nosso objeto de entrada de dados
        List<String> filmesSeriesLista = new ArrayList<>(); // Lista para armazenar filmes/séries

        do {
            System.out.print("Informe um filme/série ou digite \"0\" para sair: ");
            String itemInserido = entrada.nextLine(); // Aguarda o usuário entrar com o filme/série

            if (itemInserido.equals("0")) { // Se a opção for "0" deve exibir toda a lista e na sequencia sair do sistema
                listar(filmesSeriesLista); // Utiliza a função para exibir os itens informados na lista
                break; // Encerra o laço de repetição
            }

            adicionar(filmesSeriesLista, itemInserido); // Utiliza a função para adicionar um novo item na lista

        } while (true);

    }

    public static void adicionar(List<String> filmesSeriesLista, String filmeSerie) {
        filmesSeriesLista.add(filmeSerie); // Adiciona filme/série na lista
        System.out.println("Filme/Série adicionado!\n");
    }

    public static void listar(List<String> filmesSeriesLista) {
        System.out.println("Filmes/Séries:");
        for (String filmeSerie : filmesSeriesLista) { // Laço de repetição para percorrer cada item da lista
            System.out.println(filmeSerie); // Exibe o nome do filme
        }
    }

}
