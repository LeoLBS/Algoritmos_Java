package br.com.perber.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double area, base, altura, perimetro, diagonal;

        System.out.println("Informe o valor da base: ");
        base = ler.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura = ler.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);
    }
}
