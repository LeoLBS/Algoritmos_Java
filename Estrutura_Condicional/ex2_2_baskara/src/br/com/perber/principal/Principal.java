package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double coefA, coefB, coefC, delta, x1, x2;

        System.out.println("Informe o coeficiente A:");
        coefA = ler.nextDouble();
        System.out.println("Informe o coeficiente B:");
        coefB = ler.nextDouble();
        System.out.println("Informe o coeficiente C:");
        coefC = ler.nextDouble();

        delta = Math.pow(coefB, 2) - (4 * coefA * coefC);

        x1 = ((-coefB + Math.sqrt(delta)) / (2 * coefA));

        x2 = ((-coefB - Math.sqrt(delta)) / (2 * coefA));

        if (delta >= 0) {
            System.out.println("X1: " + String.format("%.4f", x1));
            System.out.println("X2: " + String.format("%.4f", x2));
        }else {
            System.out.println("Esta equacao nao possui raizes reais!");
        }
    }
}
