package pratica1;

import javax.swing.JOptionPane;

public class Atividade06B {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));

        double fahrenheit = (celsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
