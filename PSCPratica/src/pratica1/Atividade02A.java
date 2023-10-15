package pratica1;

import java.util.Scanner;

public class Atividade02A {

	 public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Digite o ano de nascimento: ");
				int anoNascimento = input.nextInt();

				System.out.println("Digite o ano atual: ");
				int anoAtual = input.nextInt();

				int idadeAtual = anoAtual - anoNascimento;
				System.out.println("A idade da pessoa no ano atual é: " + idadeAtual);

				int idade2050 = 2050 - anoNascimento;
				System.out.println("A idade que a pessoa terá em 2050 é: " + idade2050);
			}
	    }
	}