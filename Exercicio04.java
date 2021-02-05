package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Variaveis
        int num1, num2, soma;
        Scanner teclado = new Scanner(System.in);

        //Entradas
        System.out.print("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = teclado.nextInt();

        //Processamento
        soma = (num1 + num2);

        //Saida
        System.out.print("A soma é " + soma);

        teclado.close();
    }
}
