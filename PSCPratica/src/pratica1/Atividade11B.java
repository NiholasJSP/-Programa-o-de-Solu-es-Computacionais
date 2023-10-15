package pratica1;

import javax.swing.JOptionPane;

public class Atividade11B {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            result.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}