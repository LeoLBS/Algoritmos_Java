package br.com.perber.principal;

import java.util.Scanner;

public class Principla {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorUnitarioProduto, valorRecebido;
        int quantidadeCompra;

        System.out.println("Informe o preço unitario do produto: ");
        valorUnitarioProduto = ler.nextDouble();
        System.out.println("Informe a quantidade de produto comprada: ");
        quantidadeCompra = ler.nextInt();
        System.out.println("Informe o valor recebido: ");
        valorRecebido = ler.nextDouble();
        System.out.println("Troco: " + (valorRecebido - (quantidadeCompra * valorUnitarioProduto)));
    }
}
