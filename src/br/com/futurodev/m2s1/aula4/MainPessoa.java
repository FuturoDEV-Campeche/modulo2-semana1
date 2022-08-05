package br.com.futurodev.m2s1.aula4;

import br.com.futurodev.m2s1.aula4.exemplos.Cachorro;
import br.com.futurodev.m2s1.aula4.exemplos.Pessoa;

import java.util.Date;

public class MainPessoa {

    public static void main(String[] args) {

        // Cria um objeto pessoa
        Pessoa gabriel = new Pessoa(
                "Gabriel Augustin", "111.222.333-44",
                "Masculino", "Branca",
                1.73, 70
        );

        // Cria um objeto pessoa
        Pessoa victor = new Pessoa(
                "Victor Mora", "222.333.444-50",
                "Masculino", "Branca",
                1.98, 93
        );

        // Cria um objeto cachorro
        Cachorro amora = new Cachorro(
                "Amora", "Beagle",
                "Tricolor", "Curto",
                "Médio", 9.5,
                new Date(), "Fêmea"
        );

        // Cria um objeto cachorro
        Cachorro scooby = new Cachorro(
                "Scooby", "Dachund",
                "Preto", "Curto",
                "Pequeno", 7,
                new Date(), "Macho"
        );

        // Duas pessoas adotaram o mesmo cachorro
        gabriel.adotar(scooby);
        victor.adotar(scooby);

        // Altera o nome do objeto scooby para "Kent", isso afetará também o cachorro de cada pessoa
        scooby.mudarNome("Kent");

        /*
         * Passagem de parâmetros por referencia. Quando "victor" mudar o nome da "amora" para "Mel",
         * mesmo não manipulando o objeto amora diretamente, o nome será alterado em todos os lugares
         * que o objeto está sendo utilizado
         */
        System.out.println("Objeto amora antes de mudar o nome: "+ amora);
        victor.alterarNomeCachorro(amora, "Mel");
        System.out.println("Objeto amora depois de mudar o nome: "+ amora);

        System.out.println(gabriel); // Ao escrever "gabriel" no console, é executado o método toString() dentro da classe Pessoa
        System.out.println(victor);  // Ao escrever "victor"  no console, é executado o método toString() dentro da classe Pessoa

    }

}
