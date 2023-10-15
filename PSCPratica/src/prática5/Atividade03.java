package prática5;

import java.util.Scanner;

public class Atividade03 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite um número natural:");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Insira um número natural positivo.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}