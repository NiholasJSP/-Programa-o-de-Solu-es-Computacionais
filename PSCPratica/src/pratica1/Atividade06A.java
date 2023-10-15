package pratica1;

import java.util.Scanner;

public class Atividade06A  {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a temperatura em Celsius: ");
			double celsius = input.nextDouble();

			double fahrenheit = (celsius * 1.8) + 32;
			System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		}
    }
}
