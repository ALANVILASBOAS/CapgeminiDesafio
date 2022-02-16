package desafio;
import java.util.Scanner;
import java.util.regex.*;

/* Débora se inscreveu em uma rede social para se manter em contato com seus
amigos. A página de cadastro exigia o preenchimento dos campos de nome e
senha, porém a senha precisa ser forte. O site considera uma senha forte
quando ela satisfaz os seguintes critérios: 
* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial.
* Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem
certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que
informe qual é o número mínimo de caracteres que devem ser adicionados para
uma string qualquer ser considerada segura.

Observações:
*Em alguns casos com a expressão usada, regex pode ser necessário,
importei ele caso precisar pra efeito de teste.*/

public class Questao2 {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	String nome = null;
	String senha = null;
	
	System.out.println("Digite seu nome:");
	nome=leia.nextLine();
	
	System.out.println("Digite sua senha: ");
	senha=leia.nextLine();
	
	while (true) {
	if (senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}"))
		{
		System.out.println("A senha está forte! Cadastro completo.");
		break;
		} else {
			System.out.println("A senha está fraca.\nUma senha forte precisa de pelo menos:\n"
			+ "6 caracteres | 1 número | 1 letra minúscula | 1 letra maiúscula | 1 Caractere especial\n"
			+ "Digite a senha novamente: ");
			senha=leia.nextLine();
		}

	}
	
}
}

