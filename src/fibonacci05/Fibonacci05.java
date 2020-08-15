package fibonacci05;

import javax.swing.JOptionPane;

public class Fibonacci05 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor, digite um número limite para a sequência de Fibonacci:"));

		fibonacci(numero);

	}

	/**
	 * Fibonacci, não necessita de explicações XD
	 * 
	 * @param numero
	 */

	public static void fibonacci(int numero) {

		for (int anterior = 1, posterior = 1, contador = 0; contador < numero; posterior += anterior, anterior = posterior
				- anterior, contador++) {
			System.out.print(anterior + " ");
		}

	}

}
