import java.util.Scanner;

public class Desafio02 {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo, senha;
		
		System.out.println("Insira o codigo de acesso: ");
		codigo = teclado.nextInt();
		
		
		if(codigo == 1234) {
			
			System.out.println("Insira sua senha de acesso: ");
			senha = teclado.nextInt();
			
			if(senha == 9999) {
				System.out.println("Acesso permitido!!");
				
			}else {
				System.out.println("Senha incorreta");
				
			}
			
		}else {
			System.out.println("Usuário inválido");
		}
		
		
		
		teclado.close();
	}

}
