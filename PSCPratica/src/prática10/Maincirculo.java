package prática10;

import java.util.Scanner;
public class Maincirculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		double raio;

		System.out.println("Digite as coordenadas e o raio do círculo:");
		System.out.print("Coordenada X: ");
		x = scanner.nextInt();
		System.out.print("Coordenada Y: ");
		y = scanner.nextInt();
		System.out.print("Raio: ");
		raio = scanner.nextDouble();

		Circulo circulo = new Circulo(x, y, raio);

		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1 - Mover");
			System.out.println("2 - Aumentar");
			System.out.println("3 - Imprimir");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Mover horizontalmente (Digite a quantidade de unidades): ");
				int movX = scanner.nextInt();
				System.out.print("Mover verticalmente (Digite a quantidade de unidades): ");
				int movY = scanner.nextInt();
				circulo.moveX(movX);
				circulo.moveY(movY);
				break;
			case 2:
				System.out.print("Aumentar o raio (Digite o fator de aumento): ");
				double aumento = scanner.nextDouble();
				circulo.aumenta(aumento);
				break;
			case 3:
				System.out.println("\nInformações do Círculo:\n" + circulo.exibe());
				break;
			case 4:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 4);

		scanner.close();
	}
}