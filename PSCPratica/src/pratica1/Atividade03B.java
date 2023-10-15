package pratica1;

import javax.swing.JOptionPane;

public class Atividade03B {

    public static void main(String[] args) {
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar em reais: "));
        double valorDolares = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares: "));

        double valorReais = cotacao * valorDolares;
        JOptionPane.showMessageDialog(null, "O valor em reais é: " + valorReais);
    }
}