package prática2;

import java.util.Scanner;

public class Atividade04 {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);

        // Recebendo os dados do indivíduo
        System.out.println("Digite o peso do indivíduo em kg: ");
        double peso = input.nextDouble();

        System.out.println("Digite a altura do indivíduo em metros: ");
        double altura = input.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Determinando a situação de peso de acordo com o IMC
        if (imc < 20) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("IMC fora da faixa considerada. Verifique os valores inseridos.");
        }
        // Seu código termina aqui
    }
}