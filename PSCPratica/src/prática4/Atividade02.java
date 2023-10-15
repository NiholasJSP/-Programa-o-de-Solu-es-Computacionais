package prática4;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			double nota;
			double salario;
			char sexo;
			int idade;

			do {
			    System.out.println("Informe a nota (entre 0 e 10):");
			    nota = input.nextDouble();
			} while (nota < 0 || nota > 10);

			do {
			    System.out.println("Informe o salário (maior que 0):");
			    salario = input.nextDouble();
			} while (salario <= 0);

			do {
			    System.out.println("Informe o sexo (m ou f):");
			    sexo = input.next().charAt(0);
			} while (sexo != 'm' && sexo != 'f');

			do {
			    System.out.println("Informe a idade (entre 0 e 120):");
			    idade = input.nextInt();
			} while (idade < 0 || idade > 120);
		}

        System.out.println("Dados informados corretamente!");
    }
}