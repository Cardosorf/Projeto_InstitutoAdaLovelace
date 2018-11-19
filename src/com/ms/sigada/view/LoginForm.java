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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
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
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(136, 38, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(136, 61, 157, 36);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(136, 107, 48, 23);
		contentPane.add(lblNewLabel);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(136, 141, 157, 36);
		contentPane.add(textSenha);
		btnNewButton.setBounds(111, 188, 214, 23);
		contentPane.add(btnNewButton);
	}
}
