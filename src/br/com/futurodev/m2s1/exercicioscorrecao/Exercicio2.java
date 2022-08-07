package br.com.futurodev.m2s1.exercicioscorrecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    /**
     * Vamos melhorar nosso sistema!
     * O usuário precisa manipular a lista de filmes/séries, portanto
     * precisaremos adicionar a funcionalidade de um menu de opções:
     * Opções (números são sugestões para executar as ações):
     *     - (1) Listar
     *     - (2) Adicionar
     *     - (0) Sair
     * Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
     * Quando a opção escolhida for "Adicionar", utilizar a função criada para adicionar no Exercício 1.
     * Altere a função listar para que seja exibido o índice ao lado de cada item, usaremos posteriormente.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Cria nosso objeto de entrada de dados
        List<String> filmesSeriesLista = new ArrayList<>(); // Lista para armazenar filmes/séries

        System.out.println("#################");
        System.out.println("# Filmes/Séries #");
        System.out.println("#################");
        do {
            System.out.println("\n+------------+---------------+");
            System.out.println("| 1 - Listar | 2 - Adicionar |");
            System.out.println("+------------+---------------+");
            System.out.println("| 0 - Sair                   |");
            System.out.println("+----------------------------+");
            System.out.print("Escolha uma opção: ");
            String opcao = entrada.nextLine(); // Aguarda o usuário informar a opção

            if (opcao.equals("0")) { // Se a opção for "0" deve sair do sistema
                break; // Encerra o laço de repetição
            }

            switch (opcao) {
                case "1":
                    listar(filmesSeriesLista); // Utiliza a função para exibir os itens informados na lista
                    break;
                case "2":
                    System.out.print("Informe um filme/série: ");
                    String filmeSerie = entrada.nextLine();
                    adicionar(filmesSeriesLista, filmeSerie); // Utiliza a função para adicionar um novo item na lista
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }

    public static void adicionar(List<String> filmesSeriesLista, String filmeSerie) {
        filmesSeriesLista.add(filmeSerie); // Adiciona filme/série na lista
        System.out.println("Filme/Série adicionado!");
    }

    public static void listar(List<String> filmesSeriesLista) {
        System.out.println("Filmes/Séries:");
        for (int i = 0; i < filmesSeriesLista.size(); i++) { // Laço de repetição para exibir cada item da lista
            System.out.println("[" + i + "] " + filmesSeriesLista.get(i)); // Exibe o indice e o nome do filme
        }
    }

}
