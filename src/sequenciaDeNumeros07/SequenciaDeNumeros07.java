package sequenciaDeNumeros07;

import javax.swing.JOptionPane;

public class SequenciaDeNumeros07 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o segundo n�mero:"));

		sequenciaDeNumeros(numero1, numero2);

	}

	/**
	 * 
	 * Calcula o fatorial do n�mero resultado da subtra��o da soma dos n�meros pares
	 * pela soma dos n�meros �mpares existentes no intervalo informado pelo usu�rio.
	 * 
	 * @param numero1
	 * @param numero2
	 */

	public static void sequenciaDeNumeros(int numero1, int numero2) {
		int pares = 0;
		int impares = 0;
		if (numero1 > numero2) {
			int aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		} else if (numero1 == numero2) {
			System.out.println("Fatorial: 1");
			return;
		}

		for (; numero1 <= numero2; numero1++) {
			if (numero1 % 2 == 0) {
				pares += numero1;

			} else {
				impares += numero1;
			}
		}

		System.out.println("Fatorial: " + fatorial(pares - impares));

	}

	public static double fatorial(int numero) {
		if (numero <= 1) {

			return 1;

		} else {

			return fatorial(numero - 1) * numero;

		}
	}

}