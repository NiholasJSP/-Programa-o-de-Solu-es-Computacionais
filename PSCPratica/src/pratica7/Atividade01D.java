package pratica7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade01D {
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

            // Trocando os elementos das diagonais
            for (int i = 0; i < 5; i++) {
                int temp = matriz[i][i];
                matriz[i][i] = matriz[i][4 - i];
                matriz[i][4 - i] = temp;
            }

            System.out.println("Matriz com diagonais trocadas:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura.");
        }
    }
}
