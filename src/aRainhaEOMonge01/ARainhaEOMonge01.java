package aRainhaEOMonge01;

import java.text.NumberFormat;

public class ARainhaEOMonge01 {

	public static void main(String[] args) {

		RainhaEOMonge();

	}

	/**
	 * Solução do desafio "A Rainha e o Monge" A quantidade cresce exponencialmente
	 * com razão dois.
	 * 
	 * Não há entradas. O método imprime na telaa evolução da exponencial de número
	 * de graus a cada casa de xadrez.
	 * 
	 * NumberFormat: CLasse usada para formatar a impressão dos grandes números.
	 * 
	 * 
	 */

	public static void RainhaEOMonge() {
		NumberFormat inteiro = NumberFormat.getInstance();

		double soma = 1;
		double quantidade = 1;
		for (int numeroDeCasas = 1; numeroDeCasas <= 64; numeroDeCasas++) {
			System.out.println("Casa: " + numeroDeCasas + " - Qtd: " + inteiro.format(quantidade) + " Soma: "
					+ inteiro.format(soma));

			quantidade *= 2;
			soma += quantidade;

		}

	}
}
