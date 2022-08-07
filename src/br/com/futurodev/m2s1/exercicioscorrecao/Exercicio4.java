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

        Scanner entrada = new Scanner(System.in); // Cria nosso objeto de entrada de dados
        List<String> filmesSeriesLista = new ArrayList<>(); // Lista para armazenar filmes/séries
        List<String> assistidosLista = new ArrayList<>(); // Lista para armazenar filmes/séries que já foram assistidos

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
                case "3":
                    removerItemLista(filmesSeriesLista); // Utiliza a função para remover item da lista
                    break;
                case "4":
                    marcarComoAssistido(filmesSeriesLista, assistidosLista); // Utiliza a função para mover um filme/série para a lista de assistidos
                    break;
                case "5":
                    listar(assistidosLista); // Utiliza a função para exibir os itens informados na lista (mesma função do item 1)
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

    /**
     * Função criada para listar e pedir que o usuário escolha um item da lista
     */
    public static int listarPedirIndice(List<String> filmesSeriesLista) {
        listar(filmesSeriesLista); // Utiliza a função para exibir os itens informados na lista
        Scanner entrada = new Scanner(System.in); // Cria um novo objeto para entrada de dados
        System.out.print("Escolha qual item deseja remover: ");
        int indice = entrada.nextInt(); // Aguarda o usuário informar um índice
        return indice;
    }

    /**
     * Função criada para realizar uma função mais complexa
     * Utilizando outras funções para realizar uma ação
     * São elas:
     * - Pedir ao usuário que selecione qual item da lista deseja remover
     * - Remove um item de uma lista
     */
    public static void removerItemLista(List<String> filmesSeriesLista) {
        int indice = listarPedirIndice(filmesSeriesLista); // Utiliza a função para exibir os itens da lista e pede ao usuário qual item deseja
        if (indice < 0 || indice >= filmesSeriesLista.size()) { // Verifica se é uma opção inválida
            System.out.println("Operação cancelada!");
        } else {
            removerItem(filmesSeriesLista, indice); // Utiliza função para remover o item definitivamente
            System.out.println("Filme/Série removido!");
        }
    }

    public static void removerItem(List<String> filmesSeriesLista, int indice) {
        filmesSeriesLista.remove(indice); // Remove o item da lista
    }

    /**
     * Função criada para realizar uma função mais complexa
     * Utilizando outras funções para realizar uma ação
     * São elas:
     * - Pedir ao usuário que selecione qual item da lista deseja remover
     * - Adicionar um item à uma lista
     * - Remover um item de uma lista
     */
    private static void marcarComoAssistido(List<String> filmesSeriesLista, List<String> assistidosLista) {

        /* ************************************** */
        /* ATENCÃO - Existem funções reutilizadas */
        /* ************************************** */

        int indice = listarPedirIndice(filmesSeriesLista); // Utiliza a função para exibir os itens da lista e pede ao usuário qual item deseja (mesma função utilizada na função de "removerItemLista")
        if (indice < 0 || indice >= filmesSeriesLista.size()) { // Verifica se é uma opção inválida
            System.out.println("Operação cancelada!");
        } else {
            String selecionado = filmesSeriesLista.get(indice); // Armazena em uma variável o item que está no indice selecionado

            adicionar(assistidosLista, selecionado); // Utiliza a função para adicionar um novo item na lista (mesma função utilizada no item 2 do menu)
            removerItem(filmesSeriesLista, indice); // Utiliza função para remover o item definitivamente (mesma função utilizada na função de "removerItemLista")

            System.out.println(selecionado + " movido para assistido!");
        }

    }

}
