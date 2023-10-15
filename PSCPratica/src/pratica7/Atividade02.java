package pratica7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade02 {
	  public static void main(String[] args) {
	        try {
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            int[][] matrizA = new int[2][2];
	            int[][] matrizB = new int[2][2];
	            int[][] matrizSoma = new int[2][2];

	            System.out.println("Digite os elementos da matriz A:");
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 2; j++) {
	                    System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
	                    matrizA[i][j] = Integer.parseInt(br.readLine());
	                }
	            }

	            System.out.println("Digite os elementos da matriz B:");
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 2; j++) {
	                    System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
	                    matrizB[i][j] = Integer.parseInt(br.readLine());
	                }
	            }

	            // Soma das matrizes
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 2; j++) {
	                    matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
	                }
	            }

	            System.out.println("Matriz resultante da soma:");
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 2; j++) {
	                    System.out.print(matrizSoma[i][j] + "\t");
	                }
	                System.out.println();
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro na leitura.");
	        }
	    }
	}
