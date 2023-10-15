package prática2;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe o primeiro lado em cm: ");
			double a = input.nextDouble();

			System.out.println("Informe o segundo lado em cm: ");
			double b = input.nextDouble();

			System.out.println("Informe o terceiro lado em cm: ");
			double c = input.nextDouble();

			boolean condition1 = Math.abs(b - c) < a && a < b + c;
			boolean condition2 = Math.abs(a - c) < b && b < a + c;
			boolean condition3 = Math.abs(a - b) < c && c < a + b;

			System.out.println("|" + b + " - " + c + "| < " + a + " < " + b + " + " + c);
			System.out.println(Math.abs(b - c) + " < " + a + " < " + (b + c) + " (" + condition1 + ")");
			System.out.println("|" + a + " - " + c + "| < " + b + " < " + a + " + " + c);
			System.out.println(Math.abs(a - c) + " < " + b + " < " + (a + c) + " (" + condition2 + ")");
			System.out.println("|" + a + " - " + b + "| < " + c + " < " + a + " + " + b);
			System.out.println(Math.abs(a - b) + " < " + c + " < " + (a + b) + " (" + condition3 + ")");

			if (condition1 && condition2 && condition3) {
			    System.out.println("Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
			} else {
			    System.out.println("Resposta: os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
			}
		}
    }
}