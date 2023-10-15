package prática2;

import java.util.Scanner;

public class Atividade10 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar os dois números.");
        System.out.println("2 - Multiplicar os dois números.");
        System.out.println("3 - Subtrair o número maior pelo número menor.");
        System.out.println("4 - Dividir o primeiro número pelo segundo.");

        int opcao = input.nextInt();
        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 3:
                if (num1 == num2) {
                    resultado = 0;
                } else if (num1 > num2) {
                    resultado = num1 - num2;
                } else {
                    resultado = num2 - num1;
                }
                System.out.println("Resultado da subtração do maior pelo menor: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Impossível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}