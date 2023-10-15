package prática6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade03 {
	
	 public static void main(String[] args) {
	        try {
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            double[] numeros = new double[10];
	            double maior = Double.MIN_VALUE;
	            double menor = Double.MAX_VALUE;

	            for (int i = 0; i < 10; i++) {
	                System.out.println("Digite o " + (i + 1) + "º número real:");
	                numeros[i] = Double.parseDouble(br.readLine());
	                if (numeros[i] > maior) {
	                    maior = numeros[i];
	                }
	                if (numeros[i] < menor) {
	                    menor = numeros[i];
	                }
	            }

	            System.out.print("Vetor: [");
	            for (int i = 0; i < 10; i++) {
	                System.out.print(numeros[i]);
	                if (i < 9) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("]");

	            System.out.println("O maior número é: " + maior);
	            System.out.println("O menor número é: " + menor);
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro na leitura.");
	        }
	    }
	}
