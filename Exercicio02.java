package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
       //Varíaveis
       int num1, num2, soma, multiplicacao;
       Scanner teclado = new Scanner(System.in);

       //Entradas
        System.out.println("Informe o Primeiro Número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o Segundo Número: ");
        num2 = teclado.nextInt();

        //Processamento
        soma = num1 + num2;
        multiplicacao = soma * num1;

        //Saída
        System.out.println("O resultado da multiplicação é " + multiplicacao);

        teclado.close();

    }
}
