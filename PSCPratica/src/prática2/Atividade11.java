package prática2;

import java.util.Scanner;

public class Atividade11 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite o número de diárias: ");
        int numeroDiarias = input.nextInt();

        double precoDiaria = 500.00;
        double taxaServicos;

        if (numeroDiarias < 15) {
            taxaServicos = 15.00;
        } else if (numeroDiarias == 15) {
            taxaServicos = 10.00;
        } else {
            taxaServicos = 5.00;
        }

        double totalPagar = numeroDiarias * (precoDiaria + taxaServicos);

        System.out.println("Total a ser pago pelo cliente: R$ " + totalPagar);
    }
}