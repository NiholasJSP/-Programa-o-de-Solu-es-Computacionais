package prática5;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        	
        	
			System.out.println("Digite um número inteiro:");
			int numero = input.nextInt();

			System.out.println("Números ímpares até " + numero + ":");

			for (int i = 1; i <= numero; i++) {
			    if (i % 2 != 0) {
			        System.out.print(i + " ");
			    }
			}
        }
    }
}