package prática6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade04 {

	 public static void main(String[] args) {
	        try {
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            double[] numeros = new double[10];

	            for (int i = 0; i < 10; i++) {
	                System.out.println("Digite o " + (i + 1) + "º número real:");
	                numeros[i] = Double.parseDouble(br.readLine());
	            }

	            System.out.print("Elementos nas posições pares: ");
	            for (int i = 0; i < 10; i += 2) {
	                System.out.print(numeros[i] + " ");
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro na leitura.");
	        }
	    }
	}
