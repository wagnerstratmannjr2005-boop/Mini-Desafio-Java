package miniDesafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.print("Digite o Login: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals("admin") && senha.equals("1234")) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                tentativas++;
                System.out.println("Login ou senha incorreto");
                System.out.println("Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (tentativas == 3) {
            System.out.println("Sistema bloqueado");
        }

        scanner.close();
    }
}