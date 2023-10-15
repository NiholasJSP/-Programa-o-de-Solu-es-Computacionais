package prática5;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        int contadorMasculino = 0;
        int contadorFeminino = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o peso da pessoa " + i + " em kg:");
            Scanner scanner2 = new Scanner(System.in);
            
			try (Scanner scanner = scanner2) {
				double peso = scanner.nextDouble();

				System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
				char sexo = scanner2.next().charAt(0);

				if (sexo == 'M' || sexo == 'm') {
				    if (peso >= 60 && peso <= 80) {
				        contadorMasculino++;
				    }
				} else if (sexo == 'F' || sexo == 'f') {
				    if (peso >= 50 && peso <= 70) {
				        contadorFeminino++;
				    }
				}
			}
        }

        System.out.println("O número de pessoas do sexo masculino com peso entre 60 e 80 kg é: " + contadorMasculino);
        System.out.println("O número de mulheres com peso entre 50 e 70 kg é: " + contadorFeminino);
    }
}