package br.com.futurodev.m2s1.aula4;

import br.com.futurodev.m2s1.aula4.exemplos.Cachorro;

import java.util.Date;

public class MainCachorro {

    public static void main(String[] args) {

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

        // Executa as ações de cachorro
        amora.brincar("bolinha");
        scooby.dormir();
        amora.comer("osso");
        scooby.latir();
        amora.latir();
        scooby.brincar("corda");
        amora.brincar("corda");
        amora.dormir();
        scooby.dormir();

    }

}
