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

    // Método construtor
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
        System.out.println(this.nome + ": Au au!");
    }

    public void comer(String comida) {
        System.out.println(this.nome + ": Comendo " + comida);
    }

    public void brincar(String brinquedo) {
        System.out.println(this.nome + ": Brincando com " + brinquedo);
    }

    public void dormir() {
        System.out.println(this.nome + ": zZZZzzzzzZZZZzzzzZZ....");
    }

    public void mudarNome(String novoNome) {
        this.nome = novoNome;
    }

    // Método que converte o objeto em String
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
