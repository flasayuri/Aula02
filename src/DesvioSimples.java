import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
		 *Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		/*Aqui devemos criar uma solu��o para verificar a idade do usu�rio*/
		
	//abaixo temos um teste l�gico que verifica se a idade � maior ou igual a 12.
		if (idade >= 12 ) {
		// todo o c�digo que estiver aqui dentro, s� vai rodar se o teste tiver resultado true
			System.out.println("Voc� pode jogar");
		}
		leitor.close();

	}

}
