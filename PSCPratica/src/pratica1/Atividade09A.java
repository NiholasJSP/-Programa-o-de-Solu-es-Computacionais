package pratica1;

import java.util.Scanner;

public class Atividade09A {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o valor do primeiro cateto: ");
			double cateto1 = input.nextDouble();

			System.out.println("Digite o valor do segundo cateto: ");
			double cateto2 = input.nextDouble();

			double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
			System.out.println("O valor da hipotenusa é: " + hipotenusa);
		}
    }
}
