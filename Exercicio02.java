package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
    //Varíaveis
        int quantidade_minima, quantidade_maxima;
        float estoque_medio;
        Scanner teclado = new Scanner(System.in);

        //Entradas
        System.out.print("Informe a quantidade mínima: ");
        quantidade_minima = teclado.nextInt();

        System.out.print("Informe a quantidade maxima: ");
        quantidade_maxima = teclado.nextInt();

        //Processamento
        estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

        //Saída
        System.out.println("O estoque médio é " + estoque_medio);

        teclado.close();


    }
}
