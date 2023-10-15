package pratica1;

import java.util.Scanner;

public class Atividade03A {

	  public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Digite a cotação do dólar em reais: ");
				double cotacao = input.nextDouble();

				System.out.println("Digite o valor em dólares: ");
				double valorDolares = input.nextDouble();

				double valorReais = cotacao * valorDolares;
				System.out.println("O valor em reais é: " + valorReais);
			}
	    }
	}