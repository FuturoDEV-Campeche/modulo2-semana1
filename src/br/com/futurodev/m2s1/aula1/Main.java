package br.com.futurodev.m2s1.aula1;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] argumentos) {

        System.out.println("Aplicação iniciada...");

        calcularIdade(getAnoUsuario());

    }

    private static int getAnoUsuario() {
        /*
         * Cria uma variável para utilizar a entrada de dados via console
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o ano do seu nascimento: ");
        int anoUsuario = entrada.nextInt(); // Aguarda o usuário digitar o ano
        return anoUsuario;
    }

    private static void calcularIdade(int anoNascimento) {
        int anoAtual = getAnoAtual(); // Função que pega o ano atual do sistema
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade);
    }

    private static int getAnoAtual() {
//      /*
//       * Pega a data atual do sistema e em seguida pega/extrai o ano da data atual
//       */
//      return Calendar.getInstance().get(Calendar.YEAR);
        Calendar calendar = Calendar.getInstance(); // Pega data/hora atual do sistema
        return calendar.get(Calendar.YEAR); // Pega/extrai o ano da data atual
    }

}
