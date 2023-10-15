package prática9;

import java.util.Scanner;

/**
 * Classe Retangulo para cálculos e exibição de informações sobre um retângulo.
 */
public class Retangulo {
    private float altura, largura;

    /**
     * Construtor da classe Retangulo.
     */
    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    /**
     * Obtém a altura do retângulo.
     * 
     * @return altura do retângulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     * 
     * @param alt altura do retângulo
     */
    public void setAltura(float alt) {
        altura = alt;
    }

    /**
     * Obtém a largura do retângulo.
     * 
     * @return largura do retângulo
     */
    public float getLargura() {
        return largura;
    }

    /**
     * Define a largura do retângulo.
     * 
     * @param larg largura do retângulo
     */
    public void setLargura(float larg) {
        largura = larg;
    }

    /**
     * Calcula a área do retângulo.
     * 
     * @return área do retângulo
     */
    public float calculaArea() {
        return altura * largura;
    }

    /**
     * Calcula o perímetro do retângulo.
     * 
     * @return perímetro do retângulo
     */
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    /**
     * Exibe as informações do retângulo.
     */
    public void exibe() {
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Área: " + calculaArea());
        System.out.println("Perímetro: " + calculaPerimetro());
    }

    public static void main(String Args[]) {
        Retangulo ret = new Retangulo();
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Informe a altura do retângulo: ");
			ret.setAltura(input.nextFloat());
			System.out.print("Informe a largura do retângulo: ");
			ret.setLargura(input.nextFloat());
		}
        System.out.println("Informações do Retângulo:");
        ret.exibe();
    }
}