package prática8;

import java.util.Scanner;

public class Atividade6_4 {

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double[] vetor = new double[10];

			leitura(vetor, input);
			exibir(vetor);
		}
		
			public static void leitura(double[] vetor, Scanner input) { 
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o " + (i + 1) + "º número real: ");
				vetor[i] = input.nextDouble();
			}input.close();
			}
			
			public static void exibir(double[] vetor) {
			System.out.print("Elementos nas posições pares do vetor: ");
			for (int i = 1; i < 10; i += 2) {
				System.out.print(vetor[i] + " ");
			}
			System.out.println();

			
		}
	

}