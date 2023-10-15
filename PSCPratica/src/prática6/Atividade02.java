package prática6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade02 {
	
	 public static void main(String[] args) {
	        try {
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            double[] numeros = new double[10];
	            StringBuilder posicoesNegativas = new StringBuilder();

	            for (int i = 0; i < 10; i++) {
	                System.out.println("Digite o " + (i + 1) + "º número real:");
	                numeros[i] = Double.parseDouble(br.readLine());
	                if (numeros[i] < 0) {
	                    posicoesNegativas.append(i).append(" ");
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

	            if (posicoesNegativas.length() > 0) {
	                System.out.println("Posições com números negativos: " + posicoesNegativas.toString());
	            } else {
	                System.out.println("Não há números negativos no vetor.");
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro na leitura.");
	        }
	    }
	}
