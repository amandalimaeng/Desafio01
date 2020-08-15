package maiorPalavra06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MaiorPalavra06 {

	public static void main(String[] args) {
		String frase = (JOptionPane.showInputDialog("Por favor, digite uma frase qualquer:"));

		maiorPalavra(frase);

	}

	/**
	 * Método para retornar a maior palavra encontrada numa frase digitada pelo
	 * usuário.
	 * 
	 * @param frase
	 */

	public static void maiorPalavra(String frase) {
		String[] palavras = frase.trim().split(" ");
		String palavraMaior = palavras[0];

		for (int i = 1; i < palavras.length; i++) {

			if (palavraMaior.length() < palavras[i].length()) {

				palavraMaior = palavras[i];
			}

		}

		System.out.println("Maior Palavra = " + palavraMaior);

	}

}
