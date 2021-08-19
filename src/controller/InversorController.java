/*
 *Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
 *(Exemplo: entrada=teste. saída=etset). Deve-se utilizar a função SUBSTRING.
 */

package controller;

public class InversorController {

	public InversorController() {
		super();
	}
	
	public String inverter(String carac) {
		String resultado;  //Recebe a sequência de caracteres invertida
		int posicaoN = carac.length()-1;  //Recebe o índice da última posição
		
		//Condicao de parada
		if (posicaoN == 0) {  //posicaoN=0 => tamanho(carac)=1
			return carac.substring(0, 1);  //Caso trivial, quando tamanho(carac)=1, quando resta apenas o último elemento de carac
		} else {
			resultado =  carac.substring(posicaoN) + inverter(carac.substring(0, posicaoN));  //Chamada recursiva
			//resultado = substring com apenas último elemento de carac + chamada da função com uma nova substring 
			//nova substring é composta pelo primeiro elemento até o penúltimo elemento de carac (posicaoN-1)
		}
		
		return resultado;
	}

}
