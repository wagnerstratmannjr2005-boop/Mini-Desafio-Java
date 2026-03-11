package miniDesafio;

import java.util.Scanner;
public class Desafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Login");
		String usuario = scanner.nextLine();
		
		System.out.println("Digite a senha");
		String senha = scanner.nextLine();
		
		if (usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Acesso Permitido");
			
		} else {
			System.out.println("Acesso Negado");
		}
		
		scanner.close();
			
	}

}
