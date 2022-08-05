package br.com.futurodev.m2s1.aula4.exemplos;

import java.util.Date;

public class Cachorro {

    // Atributos
    private String nome;
    private String raca;
    private String corPelo;
    private String tamanhoPelo;
    private String porte;
    private double peso;
    private Date dataNascimento;
    private String sexo;

    public Cachorro(
            String nome, String raca, String corPelo,
            String tamanhoPelo, String porte, double peso,
            Date dataNascimento, String sexo
    ) {
        this.nome = nome;
        this.raca = raca;
        this.corPelo = corPelo;
        this.tamanhoPelo = tamanhoPelo;
        this.porte = porte;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    // Ações
    public void latir() {
        System.out.println("Au au!");
    }

    public void comer(String comida) {
        System.out.println("Comendo " + comida);
    }

    public void brincar(String brinquedo) {
        System.out.println("Brincando com " + brinquedo);
    }

    public void dormir() {
        System.out.println("zZZZzzzzzZZZZzzzzZZ....");
    }

}
