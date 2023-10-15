package prática2
;
import java.util.Scanner;

public class Atividade05 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite um valor para x: ");
        double x = input.nextDouble();
        double result;

        if (x < -2) {
            result = 2 * x + 2;
        } else if (x >= -2 && x < 3) {
            result = 3;
        } else {
            result = -x;
        }

        System.out.println("O valor da função para x = " + x + " é: " + result);
    }
}