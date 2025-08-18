package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double  medidaA, medidaB, medidaC;

        System.out.println("Informe a medida A:");
        medidaA = ler.nextDouble();
        System.out.println("Informe a medida B:");
        medidaB = ler.nextDouble();
        System.out.println("Informe a medida C:");
        medidaC = ler.nextDouble();
        System.out.println("Area do quadrado: " + String.format("%.4f",(medidaA * medidaA)));
        System.out.println("Area do triangulo: " + String.format("%.4f",((medidaA * medidaB) / 2)));
        System.out.println("Area do trapezio: " + String.format("%.4f",(((medidaA + medidaB) * medidaC) / 2)));
    }
}
