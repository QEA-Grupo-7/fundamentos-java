import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		//Inicializar o Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Definindo os atributos
		String nome;
		int idade;
		float altura;
		int totalMaiorIdadeEAltura = 0;
		
		System.out.println("Digite o numero de usuarios que serao cadastrados: ");
		int quantidadePessoas = teclado.nextInt();
		
		//Estrutura de repetição para cadastrar os usuários
		for(int i =1; i <= quantidadePessoas; i++) {
			System.out.println("--------------");
			
			System.out.print("Nome: ");
			nome = teclado.next();
			
			System.out.print("Idade: ");
			idade = teclado.nextInt();
			
			System.out.print("Altura: ");
			
			altura = teclado.nextFloat();
			
			if(idade > 25 && altura > 1.75) {
				totalMaiorIdadeEAltura++;
			}
			
		}
		
		//Soma das pessoas maiores de 25 anos e maiores de 175cm
		System.out.println("-------------------------");
		System.out.println("O total de pessoas maiores de 25 anos e maiores de 1.75m é: " + totalMaiorIdadeEAltura);
		
		
		
		
		teclado.close();
	}

}
