package pratica1;

import javax.swing.JOptionPane;

public class Atividade08B {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa: "));

        double pesoAumentado = peso * 1.15; // aumenta em 15%
        double pesoReduzido = peso * 0.8; // reduz em 20%

        JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso será: " + pesoAumentado);
        JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso será: " + pesoReduzido);
    }
}