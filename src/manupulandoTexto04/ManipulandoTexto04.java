package manupulandoTexto04;

import javax.swing.JOptionPane;

public class ManipulandoTexto04 {

	public static void main(String[] args) {
		String frase = (JOptionPane.showInputDialog("Por favor, digite uma frase qualquer:"));

		manipulandoTexto04(frase);
	}

	/**
	 * 
	 * @param frase: String de onde ser� contado a quantidade de letras "A". O
	 *               m�todo consiste em tirar os espa�os iniciais e finais da frase
	 *               com o trim(). Usando o split() dividimos a frase em um vetor
	 *               usando o esparados de espa�o e contamos o tamanho desse vetor.
	 * 
	 */

	public static void manipulandoTexto04(String frase) {

		System.out.println("TOTAL DE PALAVRAS = " + frase.trim().split(" ").length);

	}

}
