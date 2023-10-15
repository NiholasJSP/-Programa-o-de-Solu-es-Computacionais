package pratica1;

import java.util.Scanner;

public class Atividade01A {
	 public static void main(final String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Digite a primeira nota: ");
				double nota1 = input.nextDouble();

				System.out.println("Digite a segunda nota: ");
				double nota2 = input.nextDouble();

				System.out.println("Digite a terceira nota: ");
				double nota3 = input.nextDouble();

				double media = (nota1 + nota2 + nota3) / 3;
				System.out.println("A média aritmética é: " + media);
	        }
	 }
}