/*
 *Crie uma fun��o recursiva que exiba o resultado da invers�o de uma cadeia de caracteres
 *(Exemplo: entrada=teste. sa�da=etset). Deve-se utilizar a fun��o SUBSTRING.
 */

package controller;

public class InversorController {

	public InversorController() {
		super();
	}
	
	public String inverter(String carac) {
		String resultado;  //Recebe a sequ�ncia de caracteres invertida
		int posicaoN = carac.length()-1;  //Recebe o �ndice da �ltima posi��o
		
		//Condicao de parada
		if (posicaoN == 0) {  //posicaoN=0 => tamanho(carac)=1
			return carac.substring(0, 1);  //Caso trivial, quando tamanho(carac)=1, quando resta apenas o �ltimo elemento de carac
		} else {
			resultado =  carac.substring(posicaoN) + inverter(carac.substring(0, posicaoN));  //Chamada recursiva
			//resultado = substring com apenas �ltimo elemento de carac + chamada da fun��o com uma nova substring 
			//nova substring � composta pelo primeiro elemento at� o pen�ltimo elemento de carac (posicaoN-1)
		}
		
		return resultado;
	}

}
