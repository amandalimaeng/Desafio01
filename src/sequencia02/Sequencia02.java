package sequencia02;

import javax.swing.JOptionPane;

public class Sequencia02 {

	public static void main(String[] args) {

		double numero = Double
				.parseDouble(JOptionPane.showInputDialog("Por favor, digite um número para cálculo da sequência:"));

		sequencia(numero);

	}

	/**
	 * 
	 * @param numero: Double que definirá os passos da sequência a ser calculada
	 * 
	 */

	public static void sequencia(double numero) {
		Double a = 0.0;

		for (double i = 0; i < numero; i++) {
			a += (numero - i) / (i + 1);
		}

		System.out.printf("A = " + a);

	}

}
