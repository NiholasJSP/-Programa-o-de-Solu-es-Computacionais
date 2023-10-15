package prática3;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Digite a matrícula do aluno (ou valor negativo para encerrar):");
            try (Scanner scanner = new Scanner(System.in)) {
				int matricula = scanner.nextInt();
				if (matricula < 0) {
				    break;
				}

				System.out.println("Digite as três notas do aluno separadas por espaço:");
				double nota1 = scanner.nextDouble();
				double nota2 = scanner.nextDouble();
				double nota3 = scanner.nextDouble();

				double media = (nota1 + nota2 + nota3) / 3;

				if (media >= 70) {
				    System.out.println("Aluno aprovado. Média: " + media);
				} else if (media >= 60) {
				    System.out.println("Aluno em recuperação. Média: " + media);
				} else {
				    System.out.println("Aluno reprovado. Média: " + media);
				}
			}
        }
    }
}