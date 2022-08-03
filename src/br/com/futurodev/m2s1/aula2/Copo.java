package br.com.futurodev.m2s1.aula2;

public class Copo {
    //Atributos
    public int capacidade = 0;

    // Métodos
    public String getEstado() {
        if (this.capacidade == 100) {
            return "Cheio";
        } else if (this.capacidade > 50) {
            return "Pela metade";
        } else if (this.capacidade > 0) {
            return "Quase vazio";
        } else {
            return "Vazio";
        }
    }
}
