package pratica1;

import javax.swing.JOptionPane;

public class Atividade05B {
    public static void main(String[] args) {
        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior do losango: "));
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor do losango: "));

        double area = (diagonalMaior * diagonalMenor) / 2;
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}
