package desafio;
import java.util.Scanner;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os.
//A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.

public class Questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n=0,i=0,x=0;
		String space = " ";
		
		System.out.print("\nVamos fazer uma escada com asteriscos :) !"
		+ "\nDigite a quantidade de asteriscos que a escada ter� em sua base: \n");
		n=leia.nextInt();
		x=n;
		
		for(i=1;i<=n;i++) {
			
			System.out.print(space.repeat(x));
			x--;	
			
			System.out.print("*".repeat(i)+"\n");
			
			}		
	}
}
