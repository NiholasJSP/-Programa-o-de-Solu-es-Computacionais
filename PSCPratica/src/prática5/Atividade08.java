package prática5;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número inteiro:");
			int base = input.nextInt();

			System.out.println("Digite o segundo número inteiro (expoente):");
			int expoente = input.nextInt();

			if (expoente < 0) {
			    System.out.println("O expoente deve ser um número inteiro não negativo.");
			} else {
			    long resultado = 1;

			    for (int i = 1; i <= expoente; i++) {
			        resultado *= base;
			    }

			    System.out.println("O resultado da potência é: " + resultado);
			}
		}
    }
}