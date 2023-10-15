package pratica7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade03 {
	public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            int[][] matrixA = new int[2][2];
            int[][] matrixB = new int[2][2];
            int[][] resultMatrix = new int[2][2];

            System.out.println("Digite os elementos da matriz A:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
                    matrixA[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("Digite os elementos da matriz B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
                    matrixB[i][j] = Integer.parseInt(br.readLine());
                }
            }

            // Multiplicação das matrizes
            resultMatrix[0][0] = (matrixA[0][0] * matrixB[0][0]) + (matrixA[0][1] * matrixB[1][0]);
            resultMatrix[0][1] = (matrixA[0][0] * matrixB[0][1]) + (matrixA[0][1] * matrixB[1][1]);
            resultMatrix[1][0] = (matrixA[1][0] * matrixB[0][0]) + (matrixA[1][1] * matrixB[1][0]);
            resultMatrix[1][1] = (matrixA[1][0] * matrixB[0][1]) + (matrixA[1][1] * matrixB[1][1]);

            // Imprime a matriz resultante
            System.out.println("Matriz resultante da multiplicação:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura.");
            e.printStackTrace();
        }
    }
}
