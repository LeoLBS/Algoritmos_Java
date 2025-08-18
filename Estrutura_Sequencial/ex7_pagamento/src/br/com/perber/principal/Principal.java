package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double pagamentoHora;
        int horasTrabalhadas;
        String nomeFuncionario;

        System.out.println("Informe o nome do Funcionario: ");
        nomeFuncionario = ler.nextLine();
        System.out.println("Informe o valor da hora: ");
        pagamentoHora = ler.nextDouble();
        System.out.println("Informe o total de horas: ");
        horasTrabalhadas = ler.nextInt();
        System.out.println("O pagamento para " + nomeFuncionario + " deve ser de: " + String.format("%.2f",(pagamentoHora * horasTrabalhadas)));

        ler.close();
    }
}
