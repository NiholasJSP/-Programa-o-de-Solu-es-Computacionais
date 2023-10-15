package prática5;

import java.util.Scanner;

public class Atividade05 {
	 private static Scanner input;

	public static void main(String[] args) {
	        input = new Scanner(System.in);

	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;

	        System.out.println("Digite os números inteiros (digite um valor não numérico para encerrar):");

	        while (input.hasNextInt()) {
	            int numero = input.nextInt();

	            if (numero > maior) {
	                maior = numero;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum número válido foi inserido.");
	        } else {
	            System.out.println("O maior número é: " + maior);
	            System.out.println("O menor número é: " + menor);
	        }
	    }
	}
