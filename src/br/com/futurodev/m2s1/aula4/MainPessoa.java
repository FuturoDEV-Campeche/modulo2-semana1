package br.com.futurodev.m2s1.aula4;

import br.com.futurodev.m2s1.aula4.exemplos.Cachorro;
import br.com.futurodev.m2s1.aula4.exemplos.Pessoa;

import java.util.Date;

public class MainPessoa {

    public static void main(String[] args) {

        // Instanciando classe pessoa
        Pessoa gabriel = new Pessoa(
                "Gabriel Augustin", "111.222.333-44",
                "Masculino", "Branca",
                1.73, 70
        );

        // Instanciando classe pessoa
        Pessoa victor = new Pessoa(
                "Victor Mora", "222.333.444-50",
                "Masculino", "Branca",
                1.98, 93
        );

        // Instanciando classe cachorro
        Cachorro amora = new Cachorro(
                "Amora", "Beagle",
                "Tricolor", "Curto",
                "Médio", 9.5,
                new Date(), "Fêmea"
        );

        // Instanciando classe cachorro
        Cachorro scooby = new Cachorro(
                "Scooby", "Dachund",
                "Preto", "Curto",
                "Pequeno", 7,
                new Date(), "Macho"
        );

        gabriel.adotar(scooby);
        victor.adotar(scooby);


        scooby.mudarNome("Kent");


        System.out.println(gabriel);
        System.out.println(victor);

    }

}
