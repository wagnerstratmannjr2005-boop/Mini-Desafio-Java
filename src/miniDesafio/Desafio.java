package miniDesafio;
import javax.swing.JOptionPane;


public class Desafio {

    public static void main(String[] args) {

        int tentativas = 0;
        String opcao = JOptionPane.showInputDialog("1 - Login\n2 - Sair");

        while (tentativas < 3) {

            String usuario = JOptionPane.showInputDialog("Digite seu Login: ");
            String senha = JOptionPane.showInputDialog("Digite a senha: ");

            if (usuario.equals("admin") && senha.equals("1234")) {
            	JOptionPane.showMessageDialog(null,"Acesso Permitido");
                break;
            } else {
                tentativas++;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
                JOptionPane.showMessageDialog(null, "Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (tentativas == 3) {
        	JOptionPane.showMessageDialog(null, "Sistema bloqueado");
        }

    }
}