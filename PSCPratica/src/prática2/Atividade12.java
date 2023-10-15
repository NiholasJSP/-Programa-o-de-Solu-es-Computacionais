package prática2;

import java.util.Scanner;

public class Atividade12 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite a idade do cliente: ");
        int idade = input.nextInt();

        System.out.println("Digite o sexo do cliente (M para masculino, F para feminino): ");
        char sexo = input.next().charAt(0);

        double mensalidade;

        if (sexo == 'M') {
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.00;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.00;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'F') {
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.00;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else {
            System.out.println("Opção de sexo inválida.");
            return;
        }

        System.out.println("Mensalidade a ser paga: R$ " + mensalidade);
    }
}