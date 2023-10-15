package prática2;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o valor de a: ");
			double a = input.nextDouble();

			System.out.println("Digite o valor de b: ");
			double b = input.nextDouble();

			System.out.println("Digite o valor de c: ");
			double c = input.nextDouble();

			double delta = b * b - 4 * a * c;

			if (a == 0 && b == 0 && c == 0) {
			    System.out.println("Igualdade confirmada: 0 = 0");
			} else if (a == 0 && b == 0 && c != 0) {
			    System.out.println("Coeficientes informados incorretamente");
			} else if (a == 0 && b != 0) {
			    System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
			} else if (a != 0) {
			    System.out.println("Esta é uma equação de segundo grau.");
			    if (delta < 0) {
			        System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
			    } else if (delta == 0) {
			        double x = -b / (2 * a);
			        System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
			    } else {
			        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			        System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2);
			    }
			}
		}
    }
}