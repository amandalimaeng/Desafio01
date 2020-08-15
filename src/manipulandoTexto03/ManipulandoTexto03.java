package manipulandoTexto03;

import javax.swing.JOptionPane;

public class ManipulandoTexto03 {

	public static void main(String[] args) {
		String frase = (JOptionPane.showInputDialog("Por favor, digite uma frase qualquer:"));

		manipulandoTexto03(frase);

	}

	/**
	 * 
	 * @param frase: String de onde será contado a quantidade de letras "A".
	 * 
	 */

	public static void manipulandoTexto03(String frase) {
		int letrasEncontradas = 0;

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (String.valueOf(letra).equalsIgnoreCase("a")) {
				letrasEncontradas += 1;

			}
		}

		System.out.println("TOTAL DE A = " + letrasEncontradas);

	}

}
