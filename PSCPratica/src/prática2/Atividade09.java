package prática2;

import java.util.Scanner;

public class Atividade09 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Escolha um planeta (Mercurio, Venus, Terra, Marte, Jupiter, Saturno, Urano, Neptune, Plutao):");
        String planeta = input.nextLine();

        double g;
        switch (planeta) {
            case "Mercurio":
                g = 3.7;
                break;
            case "Venus":
                g = 8.8;
                break;
            case "Terra":
                g = 9.8;
                break;
            case "Marte":
                g = 3.8;
                break;
            case "Jupiter":
                g = 26.4;
                break;
            case "Saturno":
                g = 11.5;
                break;
            case "Urano":
                g = 9.3;
                break;
            case "Neptune":
                g = 12.2;
                break;
            case "Plutao":
                g = 0.6;
                break;
            default:
                System.out.println("Planeta não encontrado.");
                return;
        }

        System.out.println("Digite a velocidade inicial (v0) em m/s:");
        double v0 = input.nextDouble();

        System.out.println("Digite o instante de tempo (t) em segundos:");
        double t = input.nextDouble();

        double v_t = v0 - g * t;
        double h_t = (v0 * t) - (g * t * t) / 2;

        System.out.println("Velocidade v(t): " + v_t + " m/s");
        System.out.println("Altura h(t): " + h_t + " m");
    }
}