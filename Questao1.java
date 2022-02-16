package desafio;
import java.util.Scanner;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
//A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

public class Questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n=0,i=0,x=0;
		String space = " ";
		
		System.out.print("\nVamos fazer uma escada com asteriscos :) !"
		+ "\nDigite a quantidade de asteriscos que a escada terá em sua base: \n");
		n=leia.nextInt();
		x=n;
		
		for(i=1;i<=n;i++) {
			
			System.out.print(space.repeat(x));
			x--;	
			
			System.out.print("*".repeat(i)+"\n");
			
			}		
	}
}
