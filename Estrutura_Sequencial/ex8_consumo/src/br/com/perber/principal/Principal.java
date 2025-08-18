package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int distanciaPercorrida;
        double combustivelGasto;

        System.out.println("Informe a distancia percorrida:");
        distanciaPercorrida = ler.nextInt();
        System.out.println("Informe o combustivel gasto:");
        combustivelGasto = ler.nextDouble();
        System.out.println("Consumo medio: " + String.format("%.3f", (distanciaPercorrida / combustivelGasto)));
        ler.close();
    }
}
