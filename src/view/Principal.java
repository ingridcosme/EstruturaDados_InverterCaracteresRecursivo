/*
 *Crie uma fun��o recursiva que exiba o resultado da invers�o de uma cadeia de caracteres
 *(Exemplo: entrada=teste. sa�da=etset). Deve-se utilizar a fun��o SUBSTRING.
 */

package view;

import javax.swing.JOptionPane;

import controller.InversorController;

public class Principal {

	public static void main(String[] args) {
		InversorController inv = new InversorController();
		
		String carac = JOptionPane.showInputDialog(null, "Inversor de caracteres\n\n"
				+ "Digite uma sequ�ncia de caracteres:");
		
		String caracInvertido = inv.inverter(carac);
		System.out.printf("\nA sequ�ncia digitada '" +carac+ "' invertida fica:\n" +caracInvertido);
	}

}
