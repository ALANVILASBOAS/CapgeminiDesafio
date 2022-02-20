package desafio;
import java.util.Scanner;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
//A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

public class Questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n=0,i=0,x=0;
		String space = " ";
		String asterisk = "*";
		
		System.out.print("\nVamos fazer uma escada com asteriscos :) !"
		+ "\nDigite a quantidade de asteriscos que a escada terá em sua base: \n");
		n=leia.nextInt(); //recebe o valor base
		
		
		x=n;
		for(i=0;i<=n;i++) {  //n - quantidade de vezes que o código irá se repetir
			
			System.out.print(space.repeat(x)); //Quantidade de espaços impresso. Começará com o mesmo valor inserido em n
			x--;	//diminuirá conforme o loop roda
			
			System.out.print(asterisk.repeat(i)+"\n"); //Quantidade de steriscos impressos
			
			}		
	}
}
