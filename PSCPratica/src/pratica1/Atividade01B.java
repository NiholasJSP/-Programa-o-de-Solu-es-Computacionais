package pratica1;

import javax.swing.JOptionPane;

public class Atividade01B {

    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        double media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
    }
}