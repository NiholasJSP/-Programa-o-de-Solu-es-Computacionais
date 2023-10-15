package prática2;

import java.util.Scanner;

public class Atividade08 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 5): ");
        int codigo = input.nextInt();

        double preco;

        switch (codigo) {
            case 1:
                preco = 99.99;
                System.out.println("Produto: Sapato, Preço: R$ " + preco);
                break;
            case 2:
                preco = 103.89;
                System.out.println("Produto: Bolsa, Preço: R$ " + preco);
                break;
            case 3:
                preco = 49.98;
                System.out.println("Produto: Camisa, Preço: R$ " + preco);
                break;
            case 4:
                preco = 89.72;
                System.out.println("Produto: Calça, Preço: R$ " + preco);
                break;
            case 5:
                preco = 97.35;
                System.out.println("Produto: Blusa, Preço: R$ " + preco);
                break;
            default:
                System.out.println("Código de produto inválido.");
        }
    }
}