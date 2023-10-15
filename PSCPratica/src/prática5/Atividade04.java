package prática5;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        System.out.println("Digite as idades (insira um número negativo para encerrar):");

        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
				int idade = scanner.nextInt();

				if (idade < 0) {
				    break;
				}

				soma += idade;
			}
			contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi inserida.");
        }
    }
}

