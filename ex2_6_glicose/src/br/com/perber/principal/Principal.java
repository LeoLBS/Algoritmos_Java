package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valorGlicose;

        System.out.println("Digite a medida da glicose:");
        valorGlicose = ler.nextDouble();

        if (valorGlicose <= 100){
            System.out.println("Classificacao: Normal");
        }else if (valorGlicose > 100 && valorGlicose <= 140){
            System.out.println("Classificacao: Elevado");
        }else if (valorGlicose > 140 ) {
            System.out.println("Classificacao: Diabetes");
        }
    }
}
