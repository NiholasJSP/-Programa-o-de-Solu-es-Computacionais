package prática2;

import java.util.Scanner;

public class Atividade03 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        // Recebendo as notas do aluno
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Verificando a situação do aluno de acordo com a média
        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("Média inválida. Certifique-se de que as notas estão no intervalo de 0 a 10.");
        }
        // Seu código termina aqui
    }
}