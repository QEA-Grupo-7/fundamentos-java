import java.util.Scanner;

public class Desafio03 {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = teclado.nextInt();
		
		
		if(n1 > n2) {
			if(n1 > n3) {
				if(n2 < n3) {
					System.out.println("O menor numero é: " + n2);
				}else {
					System.out.println("O menor numero é: " + n3);
					
				}
				System.out.println("O maior numero é: " + n1);
			}else {
				if(n1 < n2) {
					System.out.println("O menos numero é: " + n1);
				}else {
					System.out.println("O menos numero é: " + n2);
				}
				System.out.println("O maior numero é: " + n3);
			}
		} else {
			if(n2 > n3) {
				if (n1 < n3) {
					System.out.println("O menor numero é: " + n1);
					
				} else {
					System.out.println("O menor numero é: " + n3);
				}
				System.out.println("O maior numero é: " + n2);
			} else {
				if (n1 < n2) {
					System.out.println("O menor numero é: " + n1);
				} else {
					System.out.println("O menor numero é: " + n2);
				}
				System.out.println("O maior numero é: " + n3);
			}
		}

		teclado.close();
	}
	

}
