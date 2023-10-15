package prática3;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int nota;
			int faltas;
			int countA = 0; // Contador de alunos com nota >= 90
			int countB = 0; // Contador de alunos reprovados
			int maiorNota = 0;
			int menorNota = 100;
			int somaNotas = 0;
			int countTotal = 0;

			while (true) {
			    System.out.println("Digite a nota final (ou valor negativo para encerrar):");
			    nota = input.nextInt();
			    if (nota < 0) {
			        break;
			    }

			    System.out.println("Digite o total de faltas:");
			    faltas = input.nextInt();

			    if (nota >= 90) {
			        countA++;
			    }

			    if (nota < 70 || faltas >= 20) {
			        countB++;
			    }

			    if (nota > maiorNota) {
			        maiorNota = nota;
			    }

			    if (nota < menorNota) {
			        menorNota = nota;
			    }

			    somaNotas += nota;
			    countTotal++;
			}

			System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + countA);
			System.out.println("Quantidade de alunos reprovados: " + countB);
			System.out.println("Maior nota: " + maiorNota);
			System.out.println("Menor nota: " + menorNota);

			if (countTotal > 0) {
			    double media = (double) somaNotas / countTotal;
			    System.out.println("Média de notas da turma: " + media);
			} else {
			    System.out.println("Nenhuma nota informada.");
			}
		}
    }
}