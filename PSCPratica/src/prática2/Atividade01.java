package prática2;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        try (// Seu código começa aqui
		Scanner input = new Scanner(System.in)) {
			// Recebendo as notas do aluno
			System.out.println("Digite a primeira nota: ");
			double nota1 = input.nextDouble();

			System.out.println("Digite a segunda nota: ");
			double nota2 = input.nextDouble();

			// Calculando a média
			double media = (nota1 + nota2) / 2;

			// Verificando a situação do aluno
			if (media >= 7) {
			    System.out.println("Aprovado");
			} else {
			    System.out.println("Reprovado");
			}
			// Seu código termina aqui
		}
    }
}