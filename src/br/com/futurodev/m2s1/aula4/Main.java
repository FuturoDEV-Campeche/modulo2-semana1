package br.com.futurodev.m2s1.aula4;

import br.com.futurodev.m2s1.aula4.exemplos.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa gabriel = new Pessoa(
                "Gabriel Augustin", "111.222.333-44",
                "Masculino", "Branca",
                1.73, 70
        );

        Pessoa victor = new Pessoa(
                "Victor Mora", "222.333.444-50",
                "Masculino", "Branca",
                1.98, 93
        );

        System.out.println(gabriel);
        System.out.println(victor);

    }

}
