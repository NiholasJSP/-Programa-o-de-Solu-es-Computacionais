package pratica1;

import java.util.Scanner;

public class Atividade08A {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o peso da pessoa: ");
			double peso = input.nextDouble();

			double pesoAumentado = peso * 1.15; // aumenta em 15%
			double pesoReduzido = peso * 0.8; // reduz em 20%

			System.out.println("Se a pessoa engordar 15%, o novo peso será: " + pesoAumentado);
			System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + pesoReduzido);
		}
    }
}   