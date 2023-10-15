package pratica1;

import java.util.Scanner;

public class Atividade04A {

	 public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Digite o salário atual do funcionário: ");
				double salarioAtual = input.nextDouble();

				double novoSalario = salarioAtual * 1.25; // aumento de 25%
				System.out.println("O novo salário do funcionário é: " + novoSalario);
			}
	    }
	}