package br.com.futurodev.m2s1.aula2;

public class CalculadoraInicial {


    public static void main(String[] args) {
        double numero1 = 10;
        double numero2 = 0;

        adicao(numero1, numero2);
        subtracao(numero1, numero2);
        multiplicacao(numero1, numero2);
        divisao(numero1, numero2);

    }

    private static void adicao(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println("Soma: " + resultado);
    }

    private static void subtracao(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        System.out.println("Subtração: " + resultado);
    }

    private static void multiplicacao(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        System.out.println("Multiplicação: " + resultado);
    }

    private static void divisao(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        System.out.println("Divisão: " + resultado);
    }

}
