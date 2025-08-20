package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double distancia1,distancia2,distancia3;

        System.out.println("Digite as tres distancias:");
        distancia1 = ler.nextDouble();
        distancia2 = ler.nextDouble();
        distancia3 = ler.nextDouble();

        if(distancia1 > distancia2 && distancia1 > distancia3){
            System.out.println("Maior: " + distancia1);
        } else if (distancia2 > distancia1 && distancia2 > distancia3) {
            System.out.println("Maior: " + distancia2);
        } else if (distancia3 > distancia1 && distancia3 > distancia2) {
            System.out.println("Maior: " + distancia3);
        }else {
            System.out.println("Maior: " + distancia1);
        }
    }
}
