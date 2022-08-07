package br.com.futurodev.m2s1.exercicioscorrecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    /**
     * Após esta refatoração realizada no Exercício 2, adicione uma opção no menu para que o filme/série seja removido
     * Nova opção (números são sugestões para executar as ações):
     *     - (3) Remover
     * Criar 3 novas funções:
     *     "listarPedirIndice":
     *         -> utilizar a função de listagem (com índices - conforme alterado no Execício 2)
     *         -> pedir ao usuário que escolha um item da lista
     *         -> retornar o índice escolhido
     *     "removerItemLista":
     *         -> utilizar a função "listarPedirIndice"
     *         -> utilizar a função "removerItem" (próxima função a ser criada) e passar como parâmetro o índice retornado da função "listarPedirIndice"
     *     "removerItem":
     *         -> precisa receber o índice por parâmetro
     *         -> na sequência realizar a remoção do item existente no índice
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> filmesSeriesLista = new ArrayList<>();

        System.out.println("#################");
        System.out.println("# Filmes/Séries #");
        System.out.println("#################");
        do {
            System.out.println("\n+------------+---------------+-------------+");
            System.out.println("| 1 - Listar | 2 - Adicionar | 3 - Remover |");
            System.out.println("+------------+---------------+-------------+");
            System.out.println("| 0 - Sair                                 |");
            System.out.println("+------------------------------------------+");
            System.out.print("Escolha uma opção: ");
            String opcao = entrada.nextLine();

            if (opcao.equals("0")) {
                break;
            }

            switch (opcao) {
                case "1":
                    listar(filmesSeriesLista);
                    break;
                case "2":
                    System.out.print("Informe um filme/série: ");
                    String filmeSerie = entrada.nextLine();
                    adicionar(filmesSeriesLista, filmeSerie);
                    break;
                case "3":
                    removerItemLista(filmesSeriesLista);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }

    public static void adicionar(List<String> filmesSeriesLista, String filmeSerie) {
        filmesSeriesLista.add(filmeSerie);
        System.out.println("Filme/Série adicionado!");
    }

    public static void listar(List<String> filmesSeriesLista) {
        System.out.println("Filmes/Séries:");
        for (int i = 0; i < filmesSeriesLista.size(); i++) {
            System.out.println("[" + i + "] " + filmesSeriesLista.get(i));
        }
    }

    public static int listarPedirIndice(List<String> filmesSeriesLista) {
        listar(filmesSeriesLista);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha qual item deseja remover: ");
        int indice = entrada.nextInt();
        return indice;
    }

    public static void removerItemLista(List<String> filmesSeriesLista) {
        int indice = listarPedirIndice(filmesSeriesLista);
        if (indice < 0 || indice >= filmesSeriesLista.size()) {
            System.out.println("Operação cancelada!");
        } else {
            removerItem(filmesSeriesLista, indice);
            System.out.println("Filme/Série removido!");
        }
    }

    public static void removerItem(List<String> filmesSeriesLista, int indice) {
        filmesSeriesLista.remove(indice);
    }

}
