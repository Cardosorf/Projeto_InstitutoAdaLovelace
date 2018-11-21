package com.ms.sigada.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ms.sigada.controller.LoginController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setBackground(Color.GRAY);
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginController validar = new LoginController();
				String senha = new String(textSenha.getPassword());
				String usuario  = new String(textNome.getText());
				
				if(!validar.consultaUsuario(usuario, Integer.parseInt(senha))) {
					JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos");
				}else {
					dispose();
                    MenuRHForm page=new MenuRHForm(textNome.getText());
                    page.setVisible(true);
				}
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(489, 187, 373, 70);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.BOLD, 25));
		textNome.setBounds(489, 255, 373, 56);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(489, 343, 373, 91);
		contentPane.add(lblNewLabel);
		
		textSenha = new JPasswordField();
		textSenha.setFont(new Font("Tahoma", Font.BOLD, 25));
		textSenha.setBounds(489, 419, 373, 56);
		contentPane.add(textSenha);
		btnLogin.setBounds(453, 552, 218, 45);
		contentPane.add(btnLogin);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  int dialogButton = JOptionPane.YES_NO_OPTION;
	          int dialogResult = JOptionPane.showConfirmDialog (null, "Tem certeza que quer sair?","Warning",dialogButton);
	          if(dialogResult == JOptionPane.YES_OPTION){
	                System.exit(0);
	          }
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSair.setBounds(700, 552, 218, 45);
		contentPane.add(btnSair);
	}
}
