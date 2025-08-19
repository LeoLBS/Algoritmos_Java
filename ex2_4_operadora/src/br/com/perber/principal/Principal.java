package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantidadeMinutoGasto;

        System.out.println("Digite a quantidade de minutos:");
        quantidadeMinutoGasto = ler.nextInt();

        if(quantidadeMinutoGasto > 100){
            System.out.println("Valor a pagar: R$ " + (50 + ((quantidadeMinutoGasto - 100) * 2)));
        }else{
            System.out.println("Valor a pagar: R$ 50,00");
        }
    }
}