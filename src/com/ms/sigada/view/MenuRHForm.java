package com.ms.sigada.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.Color;

public class MenuRHForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuRHForm frame = new MenuRHForm("");
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
	public MenuRHForm(String name) {
		setTitle("Menu RH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-vindo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 33, 414, 41);
		contentPane.add(lblNewLabel);
		
		JLabel userName = new JLabel(name);
		userName.setForeground(new Color(255, 255, 255));
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		userName.setFont(new Font("Tahoma", Font.BOLD, 20));
		userName.setBounds(10, 85, 414, 41);
		contentPane.add(userName);
		
		JButton btnFuncionario = new JButton("Funcion\u00E1rio");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnFuncionario.setBounds(78, 144, 126, 41);
		contentPane.add(btnFuncionario);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
              //  ManterAlunoForm page=new ManterAlunoForm());
               // page.setVisible(true);
			}
		});
		btnAluno.setBounds(229, 144, 126, 41);
		contentPane.add(btnAluno);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(157, 209, 126, 41);
		contentPane.add(btnSair);
	}
}
