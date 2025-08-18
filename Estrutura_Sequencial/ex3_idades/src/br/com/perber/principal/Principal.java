package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int idadePrimeira, idadeSegunda;
        double mediaIdade;
        String nomePrimeira, nomeSegunda;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        nomePrimeira = ler.next();

        System.out.println("Digite a idade da primeira pessoa: ");
        idadePrimeira = ler.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        nomeSegunda = ler.next();

        System.out.println("Digite a idade da segunda pessoa: ");
        idadeSegunda = ler.nextInt();


        mediaIdade = (idadePrimeira + idadeSegunda) / 2.0;



        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: " + nomePrimeira);
        System.out.println("Idade: " + idadePrimeira);

        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: " + nomeSegunda);
        System.out.println("Idade: " + idadeSegunda);

        System.out.println("A idade média de " + nomePrimeira + " e " + nomeSegunda + " é de: " + String.format("%.1f",mediaIdade));
    }
}
