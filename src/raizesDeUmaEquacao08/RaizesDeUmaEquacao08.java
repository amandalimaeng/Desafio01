package raizesDeUmaEquacao08;

import javax.swing.JOptionPane;

public class RaizesDeUmaEquacao08 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'a' da equação:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'b' da equação:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o 'c' da equação:"));

		raizesDeUmaEquacao(a, b, c);

	}

	/**
	 * 
	 * @param a= primeiro índice da equação
	 * @param b  = segundo índice da equação
	 * @param c  = terceiro índice da equação
	 */

	private static void raizesDeUmaEquacao(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Equação sem raízes reais");
		} else if (delta == 0) {
			double raiz = -b / 2 * a;
			System.out.println("Raiz da equação: " + raiz);
		} else {
			double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
			double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("Primeira raiz: " + raiz1);
			System.out.println("Segunda raiz: " + raiz2);

		}

	}

}
