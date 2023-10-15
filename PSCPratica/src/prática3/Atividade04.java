package prática3;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int totalSalario = 0;
			int totalFilhos = 0;
			int count = 0;

			while (true) {
			    System.out.println("Digite o salário (ou valor negativo para encerrar):");
			    int salario = input.nextInt();
			    if (salario < 0) {
			        break;
			    }

			    System.out.println("Digite o número de filhos:");
			    int filhos = input.nextInt();

			    totalSalario += salario;
			    totalFilhos += filhos;
			    count++;
			}

			if (count > 0) {
			    double mediaSalario = (double) totalSalario / count;
			    double mediaFilhos = (double) totalFilhos / count;

			    System.out.println("Média salarial da população: " + mediaSalario);
			    System.out.println("Média do número de filhos: " + mediaFilhos);
			} else {
			    System.out.println("Nenhum dado inserido.");
			}
		}
    }
}