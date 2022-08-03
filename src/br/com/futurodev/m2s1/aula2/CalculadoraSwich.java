package br.com.futurodev.m2s1.aula2;

import java.util.Scanner;

public class CalculadoraSwich {


    public static void main(String[] args) {

        // Pedir ao usuário que informe 2 valores e qual operação deseja realizar.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a operação matemática (+ - * /): ");
        String operacao = entrada.next();

        System.out.print("Informe o primeiro número: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Informe o segundo número: ");
        double numero2 = entrada.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("Soma: "          + adicao(numero1, numero2));
                break;
            case "-":
                System.out.println("Subtracao: "     + subtracao(numero1, numero2));
                break;
            case "*":
                System.out.println("Multiplicacao: " + multiplicacao(numero1, numero2));
                break;
            case "/":
                System.out.println("Divisao: "       + divisao(numero1, numero2));
                break;
            default:
                System.out.println("Operação desconhecida!");
        }

    }

    private static double adicao(double valor1, double valor2) {
        return valor1 + valor2;
    }

    private static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private static double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }

}
