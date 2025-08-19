package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantidadeProduto;
        double valorProduto, valorRecebido;

        System.out.println("Preço unitário do produto:");
        valorProduto = ler.nextDouble();
        System.out.println("Quantidade comprada:");
        quantidadeProduto = ler.nextInt();
        System.out.println("Dinheiro recebido:");
        valorRecebido = ler.nextDouble();

        if((valorProduto * quantidadeProduto) > valorRecebido){
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + ((valorProduto * quantidadeProduto) - valorRecebido) + " REAIS");
        }else{
            System.out.println("Troco: " + (valorRecebido - (valorProduto * quantidadeProduto)));
        }
    }
}
