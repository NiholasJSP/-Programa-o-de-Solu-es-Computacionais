package pratica1;

import javax.swing.JOptionPane;

public class Atividade04B {
    public static void main(String[] args) {
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual do funcionário: "));

        double novoSalario = salarioAtual * 1.25; // aumento de 25%
        JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: " + novoSalario);
    }
}
