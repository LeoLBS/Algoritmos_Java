package br.com.perber.principla;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double comprimento, largura, valorMetro, area, valorTerreno;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        largura = ler.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = ler.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        valorMetro = ler.nextDouble();

        area = comprimento * largura;
        valorTerreno = valorMetro * area;

        System.out.println("Area do terreno é de: " + area);
        System.out.println("Valor do terro é de: " + valorTerreno);
    }
}
