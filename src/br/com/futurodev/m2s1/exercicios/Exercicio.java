package br.com.futurodev.m2s1.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        /*
         * # Exercício 1
         * Criar um ArrayList para armazenar uma lista de filmes e séries.
         * Utilizando um laço de repetição, pedir ao usuário que informe alguns filmes/séries ou um comando para sair (pode ser "0", mas fique à vontade para mudar).
         * Para isso, criar funções para:
         * - Adicionar filme/série na lista
         * - Ao sair listar os filmes/séries inseridos
         */

        /*
         * # Exercício 2
         * Vamos melhorar nosso sistema!
         * O usuário precisa manipular a lista de filmes/séries, portanto precisaremos
         * adicionar a funcionalidade de um menu de opções:
         * Opções (números são sugestões para executar as ações):
         *         - (1) Listar
         *         - (2) Adicionar
         *         - (0) Sair
         * Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
         * Quando a opção escolhida for "Adicionar", utilizar a função criada
         * para adicionar no Exercício 1.
         * Altere a função listar para que seja exibido o índice ao lado de cada item,
         * usaremos posteriormente.
         */

        /*
            Após esta refatoração realizada no Exercício 2, adicione uma opção no menu para que o filme/série seja removido
            Nova opção (números são sugestões para executar as ações):
                - (3) Remover
            Criar 2 novas funções:
                "listarPedirIndice":
                    -> utilizar a função de listagem (com índices - conforme alterado no Execício 2)
                    -> pedir ao usuário que escolha um item da lista
                    -> retornar o índice escolhido
                "removerItemLista":
                    -> utilizar a função "listarPedirIndice"
                   -> utilizar a função "removerItem" (próxima função a ser criada) e passar como parâmetro o índice retornado da "listarPedirIndice"
                "removerItem":
                    -> precisa receber o índice por parâmetros
                    -> na sequência realizar a remoção do item existente no índice
         */
        List<String> filmesSeries = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Informe quais sao os seus filmes/series preferidos (para sair digite \"fechar\"):");

        do {
            // # Exercício 2
            // Menu de opções
            System.out.println("Informe uma opção:");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Remover");
            System.out.println("");
            System.out.println("0 - Sair");

            String opcao = entrada.nextLine();
            if (opcao.equals("0")) {
                break;
            }
            // # Exercício 2
            switch (opcao) {
                case "1":
                    listarItens(filmesSeries);
                    break;
                case "2":
                    System.out.print("Digite o nome: ");
                    String item = entrada.nextLine();
                    adcionarItem(item, filmesSeries);
                    break;
                case "3":
                    removerItemLista(filmesSeries, entrada);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }

    // # Exercício 1
    public static void adcionarItem(String item, List<String> itens) {
        itens.add(item);
        System.out.println("Item adcionado: ");
    }

    // # Exercício 1
    public static void listarItens(List<String> listaItens) {
        System.out.println("Filmes/Séries: ");
        // # Exercício 2
        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + " - " + listaItens.get(i));
        }
    }

    // # Exercício 3
    public static int listarPedirIndice(List<String> listaItens, Scanner entrada) {
        listarItens(listaItens);
        System.out.print("Escolha um item: ");
        String opcaoEscolhida = entrada.nextLine();
        try {
            return Integer.parseInt(opcaoEscolhida) - 1;
        } catch (Exception e) {
            return -1;
//            System.out.println("Opção inválida!");
//            return listarPedirIndice(listaItens, entrada);
        }
    }

    public static void removerItemLista(List<String> listaItens, Scanner entrada) {
        int indice = listarPedirIndice(listaItens, entrada);
        if (indice < 0) {
            System.out.println("Opção inválida! Operação cancelada!");
        } else {
            removerItem(indice, listaItens);
        }
    }

    public static void removerItem(int indice, List<String> listaItens) {
        listaItens.remove(indice);
        System.out.println("Item removido!");
    }

}
