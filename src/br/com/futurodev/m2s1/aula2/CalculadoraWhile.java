package br.com.futurodev.m2s1.aula2;

import java.util.Scanner;

public class CalculadoraWhile {


    public static void main(String[] args) {

        // Criar um laço de repetição e dar a opções para que o
        // usuário possa sair, assim o usuário pode realizar
        // várias operações sem sair da calculadora.
        Scanner entrada = new Scanner(System.in);
        String operacao;
        double numero1;
        double numero2;

        while (true) {

            System.out.print("Informe a operação matemática (+ - * /) ou digite \"sair\": ");
            operacao = entrada.next();

            if (operacao.equalsIgnoreCase("sair")) {
                return;
            }

            System.out.print("Informe o primeiro número: ");
            numero1 = entrada.nextDouble();
            System.out.print("Informe o segundo número: ");
            numero2 = entrada.nextDouble();

            switch (operacao) {
                case "+":
                    System.out.println("Soma: " + adicao(numero1, numero2));
                    break;
                case "-":
                    System.out.println("Subtracao: " + subtracao(numero1, numero2));
                    break;
                case "*":
                    System.out.println("Multiplicacao: " + multiplicacao(numero1, numero2));
                    break;
                case "/":
                    System.out.println("Divisao: " + divisao(numero1, numero2));
                    break;
                default:
                    System.out.println("Operação desconhecida!");
            }
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
