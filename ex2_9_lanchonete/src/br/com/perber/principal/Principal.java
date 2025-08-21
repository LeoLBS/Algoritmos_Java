package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigoProduto, quantidadeComprada;

        System.out.println("Codigo do produto comprado:");
        codigoProduto = ler.nextInt();
        System.out.println("Quantidade comprada:");
        quantidadeComprada = ler.nextInt();


        switch (codigoProduto){
            case 1:
                System.out.printf("Valor a pagar: R$ %.2f", ((double) quantidadeComprada * 5));
                break;
            case 2:
                System.out.printf("Valor a pagar: R$ %.2f", ((double)quantidadeComprada * 3.50));
                break;
            case 3:
                System.out.printf("Valor a pagar: R$ %.2f", ((double)quantidadeComprada * 4.80));
                break;
            case 4:
                System.out.printf("Valor a pagar: R$ %.2f", ((double)quantidadeComprada * 8.90));
                break;
            case 5:
                System.out.printf("Valor a pagar: R$ %.2f", ((double)quantidadeComprada * 7.32));
                break;
        }
    }
}
