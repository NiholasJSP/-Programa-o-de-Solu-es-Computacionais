package pratica1;

import javax.swing.JOptionPane;

public class Atividade02B {

	public static void main(String[] args) {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

		int idadeAtual = anoAtual - anoNascimento;
		JOptionPane.showMessageDialog(null, "A idade da pessoa no ano atual é: " + idadeAtual);

		int idade2050 = 2050 - anoNascimento;
		JOptionPane.showMessageDialog(null, "A idade que a pessoa terá em 2050 é: " + idade2050);
	}
}