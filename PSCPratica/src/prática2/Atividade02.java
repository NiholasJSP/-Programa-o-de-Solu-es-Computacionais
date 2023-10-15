package prática2;

import java.util.Scanner;

public class Atividade02 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        // Recebendo os lados do triângulo
        System.out.println("Digite o valor do primeiro lado: ");
        double lado1 = input.nextDouble();

        System.out.println("Digite o valor do segundo lado: ");
        double lado2 = input.nextDouble();

        System.out.println("Digite o valor do terceiro lado: ");
        double lado3 = input.nextDouble();

        // Verificando o tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é Isósceles");
        } else {
            System.out.println("O triângulo é Escaleno");
        }
        // Seu código termina aqui
    }
}