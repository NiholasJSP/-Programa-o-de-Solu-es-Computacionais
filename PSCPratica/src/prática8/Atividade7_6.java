package prática8;

import java.util.Scanner;

public class Atividade7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas = 2;
        int colunas = 2;

        int[][] matriz1 = leitura(input, linhas, colunas, "Digite os elementos da primeira matriz:");
        int[][] matriz2 = leitura(input, linhas, colunas, "Digite os elementos da segunda matriz:");

        int[][] Resultado = Multiplicar(matriz1, matriz2, linhas, colunas);

        System.out.println("Resultado da Matriz:");
        exibir(Resultado);

        input.close();
    }

    public static int[][] leitura(Scanner input, int linhas, int colunas, String mensagem) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println(mensagem);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        return matriz;
    }

    public static int[][] Multiplicar(int[][] matriz1, int[][] matriz2, int linhas, int colunas) {
        int[][] Resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < colunas; k++) {
                	Resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return Resultado;
    }

    public static void exibir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}