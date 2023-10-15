package prática8;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de preços que deseja somar: ");
		int num = input.nextInt();

		double soma = somarPrecos(num, input);

		System.out.println("A soma dos preços é: " + soma);

		input.close();
	}

	public static double somarPrecos(int num, Scanner input) {
		double soma = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print("Digite o preço do " + i + " produto: ");
			double preco = input.nextDouble();
			soma += preco;
		}

		return soma;
	}

}