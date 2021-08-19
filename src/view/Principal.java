/*
 *Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
 *(Exemplo: entrada=teste. saída=etset). Deve-se utilizar a função SUBSTRING.
 */

package view;

import javax.swing.JOptionPane;

import controller.InversorController;

public class Principal {

	public static void main(String[] args) {
		InversorController inv = new InversorController();
		
		String carac = JOptionPane.showInputDialog(null, "Inversor de caracteres\n\n"
				+ "Digite uma sequência de caracteres:");
		
		String caracInvertido = inv.inverter(carac);
		System.out.printf("\nA sequência digitada '" +carac+ "' invertida fica:\n" +caracInvertido);
	}

}
