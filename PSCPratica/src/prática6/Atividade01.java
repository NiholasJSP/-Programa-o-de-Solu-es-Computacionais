package prática6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade01 {
	
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            int[] numeros = new int[10];
            int somaPares = 0;

            for (int i = 0; i < 10; i++) {
                System.out.println("Digite o " + (i + 1) + "º número inteiro:");
                numeros[i] = Integer.parseInt(br.readLine());
                if (numeros[i] % 2 == 0) {
                    somaPares += numeros[i];
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

            System.out.println("A soma dos números pares é: " + somaPares);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura.");
        }
    }
}