package prática2;

import java.util.Scanner;

public class Atividade13 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite o tipo de apartamento (1 para Apto Simples, 2 para Apto Duplo): ");
        int tipoApartamento = input.nextInt();

        System.out.println("Digite a quantidade de dias em que o hóspede esteve hospedado: ");
        int numeroDias = input.nextInt();

        double valorDiaria;

        if (tipoApartamento == 1) {
            if (numeroDias < 10) {
                valorDiaria = 100.00;
            } else if (numeroDias >= 10 && numeroDias <= 15) {
                valorDiaria = 90.00;
            } else {
                valorDiaria = 80.00;
            }
        } else if (tipoApartamento == 2) {
            if (numeroDias < 10) {
                valorDiaria = 140.00;
            } else if (numeroDias >= 10 && numeroDias <= 15) {
                valorDiaria = 120.00;
            } else {
                valorDiaria = 100.00;
            }
        } else {
            System.out.println("Opção de tipo de apartamento inválida.");
            return;
        }

        double totalPagar = numeroDias * valorDiaria;

        System.out.println("Total a ser pago: R$ " + totalPagar);
    }
}