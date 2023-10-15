package prática4;

import javax.swing.JOptionPane;

public class Principal2 {
    public static void main (String args[]) {
        String entrada;
        int numero1, numero2, soma;
        int resp;
        do {
            entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
            numero1 = Integer.parseInt(entrada);
            entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
            numero2 = Integer.parseInt(entrada);
            soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
            resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        } while (resp == JOptionPane.YES_OPTION);
        System.exit(0);
    }
}