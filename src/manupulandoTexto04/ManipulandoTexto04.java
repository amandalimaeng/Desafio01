package manupulandoTexto04;

import javax.swing.JOptionPane;

public class ManipulandoTexto04 {

	public static void main(String[] args) {
		String frase = (JOptionPane.showInputDialog("Por favor, digite uma frase qualquer:"));

		manipulandoTexto04(frase);
	}

	/**
	 * 
	 * @param frase: String de onde será contado a quantidade de letras "A". O
	 *               método consiste em tirar os espaços iniciais e finais da frase
	 *               com o trim(). Usando o split() dividimos a frase em um vetor
	 *               usando o esparados de espaço e contamos o tamanho desse vetor.
	 * 
	 */

	public static void manipulandoTexto04(String frase) {

		System.out.println("TOTAL DE PALAVRAS = " + frase.trim().split(" ").length);

	}

}
