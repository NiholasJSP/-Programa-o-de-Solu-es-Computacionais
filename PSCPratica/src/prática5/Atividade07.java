package prática5;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;

			System.out.println("Digite 10 números inteiros:");

			for (int i = 1; i <= 10; i++) {
			    System.out.print("Digite o número " + i + ": ");
			    int numero = input.nextInt();

			    if (numero > maior) {
			        maior = numero;
			    }

			    if (numero < menor) {
			        menor = numero;
			    }
			}

			System.out.println("O maior número é: " + maior);
			System.out.println("O menor número é: " + menor);
		}
    }
}