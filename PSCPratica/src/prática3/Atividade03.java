package prática3;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int totalAudiencia = 0;
			int canal;
			int pessoasAssistindo;

			while (true) {
			    System.out.println("Digite o número do canal (ou 0 para encerrar):");
			    canal = input.nextInt();
			    if (canal == 0) {
			        break;
			    }

			    System.out.println("Digite o número de pessoas assistindo ao canal:");
			    pessoasAssistindo = input.nextInt();
			    totalAudiencia += pessoasAssistindo;

			    switch (canal) {
			        case 2:
			        case 4:
			        case 5:
			        case 7:
			        case 12:
			            double percentual = (pessoasAssistindo * 100.0) / totalAudiencia;
			            System.out.println("O percentual de audiência do canal " + canal + " é: " + percentual + "%");
			            break;
			        default:
			            System.out.println("Canal inválido. Por favor, insira um número de canal válido.");
			            break;
			    }
			}
		}
    }
}