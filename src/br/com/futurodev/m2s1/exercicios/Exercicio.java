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

        List<String> filmesSeries = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Informe quais sao os seus filmes/series preferidos (para sair digite \"fechar\"):");

        do {
            // Menu de opções
            System.out.println("Informe uma opção:");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("");
            System.out.println("0 - Sair");

            int opcao = entrada.nextInt();
            if (opcao == 0) {
                break;
            }
            switch (opcao) {
                case 1:
                    listarItens(filmesSeries);
                    break;
                case 2:
                    adcionarItem(filmesSeries);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }

    public static void adcionarItem(List<String> itens) {
        String item = new Scanner(System.in).nextLine();
        itens.add(item);
        System.out.println("Item adcionado: ");
    }

    public static void listarItens(List<String> listaItens) {
        System.out.println("Filmes/Séries: ");
        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + " - " + listaItens.get(i));
        }
    }

}
