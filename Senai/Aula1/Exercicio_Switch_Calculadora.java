/*
 
 Crie um algoritmo com Switch que exiba as seguintes 
 opções e realize a operação de dois números 
 conforme a escolha do usuário:
		1 – Adição
		2 – Subtração
		3 – Multiplicação
		4 – Divisão

 
 */

package Senai.Aula1;

import javax.swing.JOptionPane;

public class Exercicio_Switch_Calculadora {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite umas das opções a seguir: \n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao\n", "Leia com atencao!", JOptionPane.QUESTION_MESSAGE));
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));
		
		//switch = Selecione
		switch(opcao) {
		
			//Case - Caso
			case 1: {
				
				//1 - Adicao
				resultado = numero1 + numero2;
				System.out.printf("%d + %d = %d", numero1, numero2, resultado);
				
				//Interrompe
				break;
				
			}
			
			case 2: {
				
				//2 – Subtração
				resultado = numero1 - numero2;
				System.out.printf("%d + %d = %d", numero1, numero2, resultado);
				
				break;
				
			}
			
			case 3: {
				
				//3 – Multiplicação
				resultado = numero1 * numero2;
				System.out.printf("%d * %d = %d", numero1, numero2, resultado);
				
				break;
				
			}
			
			case 4: {
				
				//4 – Divisão
				resultado = numero1 / numero2;
				System.out.printf("%d / %d = %d", numero1, numero2, resultado);
				
				break;
				
			}
			
			//Outro Caso
			default: {
				
				System.out.println("Opcao Invalida!");
				
			}
		
		}
		
	}

}
