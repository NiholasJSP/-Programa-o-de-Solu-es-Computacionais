package pratica1;

import javax.swing.JOptionPane;

public class Atividade07B {
    public static void main(String[] args) {
        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo: "));
        double salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário do funcionário: "));

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        JOptionPane.showMessageDialog(null, "O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}