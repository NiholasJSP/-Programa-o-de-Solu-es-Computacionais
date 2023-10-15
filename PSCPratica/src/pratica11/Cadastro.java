package pratica11;


import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Pessoa> cadastro = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        cadastro.add(pessoa);
    }

    public void imprimirCadastro() {
        for (Pessoa pessoa : cadastro) {
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoa;
                System.out.println("Nome: " + pf.getNome() + ", CPF: " + pf.getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                System.out.println("Nome: " + pj.getNome() + ", CNPJ: " + pj.getCNPJ());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        PessoaFisica pf = new PessoaFisica();
        System.out.println("Informe o nome da pessoa física:");
        String nomePF = scanner.nextLine();
        pf.setNome(nomePF);
        System.out.println("Informe o CPF:");
        String cpf = scanner.nextLine();
        pf.setCPF(cpf);
        cadastro.cadastrarPessoa(pf);

        PessoaJuridica pj = new PessoaJuridica();
        System.out.println("Informe o nome da pessoa jurídica:");
        String nomePJ = scanner.nextLine();
        pj.setNome(nomePJ);
        System.out.println("Informe o CNPJ:");
        String cnpj = scanner.nextLine();
        pj.setCNPJ(cnpj);
        cadastro.cadastrarPessoa(pj);

        cadastro.imprimirCadastro();

        scanner.close();
    }
}