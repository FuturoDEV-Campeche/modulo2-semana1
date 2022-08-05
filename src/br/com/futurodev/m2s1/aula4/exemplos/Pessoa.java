package br.com.futurodev.m2s1.aula4.exemplos;

import java.util.Date;

public class Pessoa {

    // Características / Atributos
    private String nome; //*
    private String nomeSocial;
    private Date dataNascimento = new Date();
    private String cpf; //*
    private String genero; //*
    private String corPele; //*
    private String nacionalidade = "Brasileiro";

    private String corCabelo;
    private String estadoCivil = "Solteiro";
    private double altura; //*
    private double peso; //*
    private String endereco;
    private Cachorro cachorro;

    // Método construtor
    public Pessoa(
            String nome, String cpf,
            String genero, String corPele,
            double altura, double peso
    ) {
        this.nome    = nome;
        this.cpf     = cpf;
        this.genero  = genero;
        this.corPele = corPele;
        this.altura  = altura;
        this.peso    = peso;
    }

    public void adotar(Cachorro cao) {
        cachorro = cao;
    }

    public void alterarNomeCachorro(Cachorro cachorro, String novoNome) {
        // Aqui está sendo manipulado o parâmetro cachorro ao invés do cachorro da própria pessoa (não está utilizando "this")
        cachorro.mudarNome(novoNome);
    }

    // Método que converte o objeto em String
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", corPele='" + corPele + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", corCabelo='" + corCabelo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", endereco='" + endereco + '\'' +
                ", cachorro=" + cachorro +
                '}';
    }

}
