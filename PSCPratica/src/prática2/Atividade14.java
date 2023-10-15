package prática2;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um comando do git(clone/fetch/pull):");
		String comando = input.next();
		
		switch(comando){
		case "clone":
			System.out.println("git clone:");
			System.out.println("Faz uma cópia de uma repositótio para o nov.");
			System.out.println("Exemplo: git clone https://github.com");
			;break;
		case "fetch":
			System.out.println("git fech:");
			System.out.println("Mostra as mudanças e como elas afetam as suas mudanças locais.");
			System.out.println("Exemplo: git fetch --all");
			;break;
		case "pull":
			System.out.println("git pull:");
			System.out.println("Busca e baixa os conteúdos de repositórios remotos e faz a atualização no seu repositótio local.");
			System.out.println("Exemplo: git pull origin main");
			;break;
		default:
			System.out.println("Comando invalido!");
			;break;
		}
	}

}