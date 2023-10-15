package pratica11;

import java.util.Scanner;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    public Produto() {
        this.id = ultimo_id++;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    public void reajustaPreco(double percentual) {
        this.preco *= (1 + percentual / 100);
    }

    public static int getUltimoId() {
        return ultimo_id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro produto:");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o preço do primeiro produto:");
        double preco1 = scanner.nextDouble();

        Produto produto1 = new Produto(nome1, preco1);

        scanner.nextLine();

        System.out.println("Informe o nome do segundo produto:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do segundo produto:");
        double preco2 = scanner.nextDouble();

        Produto produto2 = new Produto(nome2, preco2);

        produto1.exibe();

        produto2.exibe();

        System.out.println("Informe o percentual de reajuste para o primeiro produto:");
        double percentualReajuste = scanner.nextDouble();
        produto1.reajustaPreco(percentualReajuste);

        produto1.exibe();

        System.out.println("Último ID gerado: " + Produto.getUltimoId());
    }
}