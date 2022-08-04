package br.com.futurodev.m2s1.aula3;

import br.com.futurodev.m2s1.aula3.objetos.Time;

public class OrientacaoObjeto {

    public static void main(String[] args) {

        Time futuroDev = new Time();
        futuroDev.nome = "FuturoDev";

        System.out.println("Nome do time: " + futuroDev.nome);

    }

}
