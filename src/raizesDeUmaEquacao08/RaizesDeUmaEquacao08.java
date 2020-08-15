package raizesDeUmaEquacao08;

import javax.swing.JOptionPane;

public class RaizesDeUmaEquacao08 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'a' da equa��o:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'b' da equa��o:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'c' da equa��o:"));

		raizesDeUmaEquacao(a, b, c);

	}

	/**
	 * 
	 * @param a= primeiro �ndice da equa��o
	 * @param b  = segundo �ndice da equa��o
	 * @param c  = terceiro �ndice da equa��o
	 */

	private static void raizesDeUmaEquacao(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Equa��o sem ra�zes reais");
		} else if (delta == 0) {
			double raiz = -b / 2 * a;
			System.out.println("Raiz da equa��o: " + raiz);
		} else {
			double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
			double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("Primeira raiz: " + raiz1);
			System.out.println("Segunda raiz: " + raiz2);

		}

	}

}
