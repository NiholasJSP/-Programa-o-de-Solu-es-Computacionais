package prática5;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int soma = 0;
			int quantidadePessoas = 10;

			for (int i = 1; i <= quantidadePessoas; i++) {
			    System.out.print("Digite a idade da pessoa " + i + ": ");
			    int idade = input.nextInt();
			    soma += idade;
			}

			double media = (double) soma / quantidadePessoas;
			System.out.println("A média das idades é: " + media);
		}
    }
}