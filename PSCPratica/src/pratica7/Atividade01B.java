package pratica7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade01B {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            int[][] matriz = new int[5][5];

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
                    matriz[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("Elementos em que o índice da linha é par e o índice da coluna é ímpar:");
            for (int i = 0; i < 5; i += 2) {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 != 0) {
                        System.out.print(matriz[i][j] + " ");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura.");
        }
    }
}