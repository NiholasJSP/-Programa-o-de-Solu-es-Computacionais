package prática9;

import java.util.Scanner;

/**
 * Classe Funcionario para armazenar informações sobre um funcionário.
 */
public class Funcionario {
    String nome;
    int idade;
    String cargo;
    double salario;
    String telefone;
    String endereco;

    /**
     * Método para exibir todas as informações de um funcionário.
     */
    public void exibe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("------------------------------");
    }
}

/**
 * Classe Cadastro para armazenar e manipular o vetor de cadastro de funcionários.
 */
class Cadastro {
    Funcionario[] funcionarios;
    int indice;

    public Cadastro(int tamanho) {
        funcionarios = new Funcionario[tamanho];
        indice = 0;
    }

    /**
     * Método para cadastrar um funcionário no vetor de cadastro.
     * 
     * @param func Funcionário a ser cadastrado
     */
    public void cadastrarFuncionario(Funcionario func) {
        if (indice < funcionarios.length) {
            funcionarios[indice] = func;
            indice++;
        } else {
            System.out.println("O cadastro está cheio, não é possível adicionar mais funcionários.");
        }
    }

    /**
     * Método para imprimir todos os funcionários cadastrados.
     */
    public void imprimirCadastro() {
        for (int i = 0; i < indice; i++) {
            funcionarios[i].exibe();
        }
    }
}

/**
 * Classe Main para iniciar o algoritmo.
 */
class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o número de funcionários a serem cadastrados: ");
			int tamanhoCadastro = input.nextInt();

			Cadastro cadastro = new Cadastro(tamanhoCadastro);

			for (int i = 0; i < tamanhoCadastro; i++) {
			    Funcionario func = new Funcionario();
			    System.out.print("Nome: ");
			    func.nome = input.next();
			    System.out.print("Idade: ");
			    func.idade = input.nextInt();
			    System.out.print("Cargo: ");
			    func.cargo = input.next();
			    System.out.print("Salário: ");
			    func.salario = input.nextDouble();
			    System.out.print("Telefone: ");
			    func.telefone = input.next();
			    System.out.print("Endereço: ");
			    func.endereco = input.next();
			    cadastro.cadastrarFuncionario(func);
			}

			System.out.println("Lista de Funcionários:");
			cadastro.imprimirCadastro();
		}
    }
}