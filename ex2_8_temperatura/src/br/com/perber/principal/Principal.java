package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String escolhaTemp;

        double tempCel, tempFah;

        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
        escolhaTemp = ler.nextLine();

        if(escolhaTemp.equals("F")){
            System.out.println("Digite a temperatura em Fahrenheit:");
            tempFah = ler.nextDouble();
            System.out.printf("Temperatura equivalente em Celsius: %.2f", ((tempFah - 32) / 1.8));
        } else if (escolhaTemp.equals("C")) {
            System.out.println("Digite a temperatura em Celsius:");
            tempCel = ler.nextDouble();
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", ((1.8 * tempCel) + 32));
        }
    }
}
