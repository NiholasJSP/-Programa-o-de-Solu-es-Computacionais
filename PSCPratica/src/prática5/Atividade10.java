package prática5;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int contadorFeminino = 0;

			for (int i = 1; i <= 10; i++) {
			    System.out.println("Informe a idade da pessoa " + i + ":");
			    int idade = input.nextInt();

			    System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
			    char sexo = input.next().charAt(0);

			    if (sexo == 'F' || sexo == 'f') {
			        if (idade >= 20 && idade <= 40) {
			            contadorFeminino++;
			        }
			    }
			}

			System.out.println("O número de pessoas do sexo feminino entre 20 e 40 anos é: " + contadorFeminino);
		}
    }
}