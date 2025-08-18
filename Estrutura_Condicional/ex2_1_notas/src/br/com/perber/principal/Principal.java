package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Informe a primeira nota:");
        nota1 = ler.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = ler.nextDouble();

        System.out.println("Nota final: " + String.format("%.1f", nota1 + nota2));
        if ((nota1 + nota2) < 60){
            System.out.println("Reprovado!");
        }
    }
}
