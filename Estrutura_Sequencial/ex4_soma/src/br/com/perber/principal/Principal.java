package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroUm, numeroDois;

        System.out.println("Digite o primeiro número: ");
        numeroUm = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        numeroDois = ler.nextInt();

        System.out.println("Soma = " + (numeroUm + numeroDois));
    }
}
