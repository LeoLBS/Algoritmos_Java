package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Informe o primeiro:");
        num1 = ler.nextInt();
        System.out.println("Informe o segundo:");
        num2 = ler.nextInt();
        System.out.println("Informe o terceiro:");
        num3 = ler.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("Menor: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("Menor: " + num2);
        }else if(num3 < num1 && num3 < num2){
            System.out.println("Menor: " + num3);
        }else{
            System.out.println("Iguais: " + num1);
        }
    }
}

