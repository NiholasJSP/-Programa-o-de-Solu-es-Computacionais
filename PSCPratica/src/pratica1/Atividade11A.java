package pratica1;

import java.util.Scanner;

public class Atividade11A {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int numero = input.nextInt();

			for (int i = 0; i <= 10; i++) {
			    System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}
    }
}