package prática5;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        	
			System.out.println("Informe um número para exibir sua tabuada de multiplicação:");
			int numero = input.nextInt();

			System.out.println("Tabuada de multiplicação de " + numero + ":");

			for (int i = 0; i <= 10; i++) {
			    System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}
    }
}