package br.com.futurodev.m2s1.aula3.objetos;

import java.util.ArrayList;
import java.util.List;

public class Time {

    // Atributos
    public String nome;
    public List<String> patrocinadores = new ArrayList<>();
    public List<String> jogadores      = new ArrayList<>();
    public List<String> equipeTecnica  = new ArrayList<>();
    public String mascote;
    public String uniforme;
    public String escudo;
    public String treinador;
    public String bandeira;
    public String hino;
    public String campo;

    // Métodos
    public List<String> contratarJogador(String jogador) {
        jogadores.add(jogador);
        return jogadores;
    }

    public List<String> contratarTodosJogadores(List<String> novosJogadores) {
        for (String jogador : novosJogadores) {
            jogadores.add(jogador);
        }
        return jogadores;
    }

    public List<String> escalacao() {
        return jogadores;
    }

    public void treinar() {
        System.out.println("Treinando...");
    }

    public void irCampo() {
        System.out.println("Se deslocando para o campo...");
    }

    private void organizarEquipamentos() {
        System.out.println("Equipamentos organizados...");
    }

    public void preparParaJogo() {
        organizarEquipamentos();
        irCampo();
        treinar();
    }

}
