package br.com.perber.principal;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio;

        System.out.println("Informe o valor do raio do circulo: ");
        raio = ler.nextDouble();
        System.out.println("Area = " + String.format("%.3f",(Math.PI * Math.pow(raio, 2))));
    }
}
