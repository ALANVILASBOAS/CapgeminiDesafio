package desafio;
import java.util.Scanner;
import java.util.regex.*;

/* D�bora se inscreveu em uma rede social para se manter em contato com seus
amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e
senha, por�m a senha precisa ser forte. O site considera uma senha forte
quando ela satisfaz os seguintes crit�rios: 
* Possui no m�nimo 6 caracteres.
* Cont�m no m�nimo 1 digito.
* Cont�m no m�nimo 1 letra em min�sculo.
* Cont�m no m�nimo 1 letra em mai�sculo.
* Cont�m no m�nimo 1 caractere especial.
* Os caracteres especiais s�o: !@#$%^&*()-+
D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem
certeza se � uma senha forte. Para ajudar D�bora, construa um algoritmo que
informe qual � o n�mero m�nimo de caracteres que devem ser adicionados para
uma string qualquer ser considerada segura.

Observa��es:
*Em alguns casos com a express�o usada, regex pode ser necess�rio,
importei ele caso precisar pra efeito de teste.*/

public class Questao2 {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	String nome = ""; 
	String senha = "";
	
	System.out.println("--- Vamos completar o cadastro ---");
	System.out.println("Digite seu nome:");
	nome=leia.nextLine();
	
	System.out.println("Digite sua senha: ");
	senha=leia.nextLine();
	
	
	
	/* 
	  verifica:
	   (?=.*[0-9]) - se tem numeros
	   (?=.*[a-z]) - se tem letras minusculas
	   (?=.*[A-Z]) - se tem letras maiusculas
	      (?=.*[]) - se h� algum dos caracteres que est� dentro dos colchetes
	          {6,} - Se tem ao menos 6 caracteres no total
	 */
	while (true) { 
	if (senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()�[{}]:;',?/*~$^+=<>]).{6,}"))
		{
		
		   	//se a senha preencher todos os requisitos, imprima:
		System.out.println("A senha est� forte!\nCadastro do usu�rio: "+nome+"\nFinalizado.");
		break;
		   //se n�o, informe ao usu�rio o que � necess�rio para preencher os requisitos,
		   //e solicite a senha novamente.
		} else {
			System.out.println("A senha est� fraca.\nUma senha forte precisa de pelo menos:\n"
			+ "6 caracteres | 1 n�mero | 1 letra min�scula | 1 letra mai�scula | 1 Caractere especial\n"
			+ "Digite a senha novamente: ");
			senha=leia.nextLine();
		}
	}
}
}

