package prática5;

import java.util.Scanner;

public class Atividade02 {

	 private static Scanner input;

	public static void main(String[] args) {
	        input = new Scanner(System.in);

	        System.out.println("Digite o primeiro número inteiro positivo:");
	        int numero1 = input.nextInt();

	        System.out.println("Digite o segundo número inteiro positivo, maior que o primeiro:");
	        int numero2 = input.nextInt();

	        if (numero1 > 0 && numero2 > 0 && numero2 > numero1) {
	            for (int i = numero1 + 1; i < numero2; i++) {
	                System.out.print(i + " ");
	            }
	        } else {
	            System.out.println("Por favor, insira dois números inteiros positivos, sendo o segundo maior que o primeiro.");
	        }
	    }
	}