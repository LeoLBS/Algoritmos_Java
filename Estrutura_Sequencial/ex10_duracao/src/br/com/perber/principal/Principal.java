package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int duracaoSegundos;

        System.out.println("Informe a duracao em segundos:");
        duracaoSegundos = ler.nextInt();
        System.out.println((duracaoSegundos / 3600) + ":" + ((duracaoSegundos % 3600) / 60) + ":" + ((duracaoSegundos % 3600) % 60));
    }
}
