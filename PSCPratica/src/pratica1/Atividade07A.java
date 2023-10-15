package pratica1;

import java.util.Scanner;

public class Atividade07A {
	   public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Digite o valor do salário mínimo: ");
				double salarioMinimo = input.nextDouble();

				System.out.println("Digite o valor do salário do funcionário: ");
				double salarioFuncionario = input.nextDouble();

				double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
				System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");
			}
	    }
	}