package pratica1;

import java.util.Scanner;

public class Atividade10A {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o valor do raio da esfera: ");
			double raio = input.nextDouble();
			double pi = Math.PI;

			double comprimento = 2 * pi * raio;
			double area = pi * Math.pow(raio, 2);
			double volume = (3.0/4) * pi * Math.pow(raio, 3);

			System.out.println("O comprimento da esfera é: " + comprimento);
			System.out.println("A área da esfera é: " + area);
			System.out.println("O volume da esfera é: " + volume);
		}
    }
}