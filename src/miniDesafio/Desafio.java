package miniDesafio;

import javax.swing.*;
import java.awt.event.*;

public class Desafio {

    static int tentativas = 0;

    public static void main(String[] args) {

        JFrame janela = new JFrame("Sistema de Login");
        janela.setSize(300,200);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelUsuario = new JLabel("Login:");
        labelUsuario.setBounds(20,20,80,25);
        janela.add(labelUsuario);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(100,20,150,25);
        janela.add(campoUsuario);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(20,60,80,25);
        janela.add(labelSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(100,60,150,25);
        janela.add(campoSenha);

        JButton botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(40,110,90,30);
        janela.add(botaoLogin);

        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.setBounds(150,110,100,30);
        janela.add(botaoCancelar);

        botaoLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                if(usuario.equals("admin") && senha.equals("1234")) {

                    JOptionPane.showMessageDialog(null,"Acesso Permitido");
                    System.exit(0);

                } else {

                    tentativas++;

                    JOptionPane.showMessageDialog(null,
                            "Login ou senha incorretos\nTentativas restantes: " + (3 - tentativas));

                    if(tentativas == 3) {

                        JOptionPane.showMessageDialog(null,"Sistema Bloqueado");
                        System.exit(0);
                    }
                }
            }
        });

        botaoCancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        janela.setVisible(true);
    }
}