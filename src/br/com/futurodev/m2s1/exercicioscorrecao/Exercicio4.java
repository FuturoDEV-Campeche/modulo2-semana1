package br.com.futurodev.m2s1.exercicioscorrecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    /**
     * Continuando nosso projeto!
     * Vamos criar uma nova lista para armazenar os filmes e séries que já foram assistidos pelo usuário.
     * Após criar a lista, será necessário adicionar mais opções no menu:
     * Novas opção (números são sugestões para executar as ações):
     *     - (4) Marcar como assistido
     *     - (5) Listar assistidos
     * Criar novas funções
     *     "marcarComoAssistido"
     *         > utilizar a função "listarPedirIndice" (criada no Exercício 3)
     *         > adicionar na nova lista de filmes assistidos o filme/série escolhido pelo usuário
     *         > remover item da lista de filmes/séries utilizando a função "removerItem" (criada no Exercício 3)
     * Dessa forma o filme/série será movido para a nova lista.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> filmesSeriesLista = new ArrayList<>();
        List<String> assistidosLista = new ArrayList<>();

        System.out.println("#################");
        System.out.println("# Filmes/Séries #");
        System.out.println("#################");
        do {
            System.out.println("\n+---------------+------------------+-----------------+");
            System.out.println("| 1 - Listar    | 2 - Adicionar    | 3 - Remover     |");
            System.out.println("+---------------+------------------+-----------------+");
            System.out.println("| 4 - Marcar como assistido  | 5 - Listar assistidos |");
            System.out.println("+----------------------------+-----------------------+");
            System.out.println("| 0 - Sair                                           |");
            System.out.println("+----------------------------------------------------+");
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
                case "4":
                    marcarComoAssistido(filmesSeriesLista, assistidosLista);
                    break;
                case "5":
                    listar(assistidosLista);
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

    private static void marcarComoAssistido(List<String> filmesSeriesLista, List<String> assistidosLista) {
        int indice = listarPedirIndice(filmesSeriesLista);
        if (indice < 0 || indice >= filmesSeriesLista.size()) {
            System.out.println("Operação cancelada!");
        } else {
            String selecionado = filmesSeriesLista.get(indice);
            assistidosLista.add(selecionado);
            removerItem(filmesSeriesLista, indice);
            System.out.println(selecionado + " movido para assistido!");
        }

    }

}
