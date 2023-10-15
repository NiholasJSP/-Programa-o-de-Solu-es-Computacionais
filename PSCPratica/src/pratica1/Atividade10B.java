package pratica1;

import javax.swing.JOptionPane;

public class Atividade10B {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da esfera: "));
        double pi = Math.PI;

        double comprimento = 2 * pi * raio;
        double area = pi * Math.pow(raio, 2);
        double volume = (3.0/4) * pi * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "O comprimento da esfera é: " + comprimento);
        JOptionPane.showMessageDialog(null, "A área da esfera é: " + area);
        JOptionPane.showMessageDialog(null, "O volume da esfera é: " + volume);
    }
}