package pratica11;

import java.util.Scanner;

public class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        if (b < 0) {
            resultado = -resultado;
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            a = a - b;
            quociente++;
        }
        return quociente;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inteiro manipulador = new Inteiro();

        int escolha = 0;

        while (escolha != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 – Multiplicação");
            System.out.println("2 – Potência");
            System.out.println("3 – Divisão");
            System.out.println("4 – Par");
            System.out.println("5 – Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite dois números inteiros (separados em espaço):");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int resultadoMultiplicacao = manipulador.multiplicacao(a, b);
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                    break;
                case 2:
                    System.out.println("Digite a base e o expoente (separados em espaço):");
                    int base = scanner.nextInt();
                    int expoente = scanner.nextInt();
                    int resultadoPotencia = manipulador.potencia(base, expoente);
                    System.out.println("Resultado da potência: " + resultadoPotencia);
                    break;
                case 3:
                    System.out.println("Digite o dividendo e o divisor (separados em espaço):");
                    int dividendo = scanner.nextInt();
                    int divisor = scanner.nextInt();
                    int resultadoDivisao = manipulador.divisao(dividendo, divisor);
                    System.out.println("Resultado da divisão: " + resultadoDivisao);
                    break;
                case 4:
                    System.out.println("Digite um número inteiro :");
                    int num = scanner.nextInt();
                    boolean ehPar = manipulador.par(num);
                    System.out.println("O número é par? " + ehPar);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção não existente.");
                    break;
            }
        }
        scanner.close();
    }
}
