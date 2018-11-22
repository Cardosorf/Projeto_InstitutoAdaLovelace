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
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JPasswordField textSenha;
	static LoginForm frame;
    static Point compCoords;
	
	static File file1 = new File("1.png");
	static private String path = file1.getAbsolutePath().replaceFirst("1.png", "sigAdaForms/1.png");
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginForm();
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
		setUndecorated(true);
		setBackground(Color.GRAY);
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 1384, 761);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setOpaque(false);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
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
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.BOLD, 25));
		textNome.setBounds(792, 255, 564, 50);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textSenha = new JPasswordField();
		textSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					LoginController validar = new LoginController();
					String senha = new String(textSenha.getPassword());
					String usuario = new String(textNome.getText());
					if (!validar.consultaUsuario(usuario, Integer.parseInt(senha))) {
						JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos");
					} else {
						dispose();
						MenuRHForm page = new MenuRHForm(textNome.getText());
						page.setVisible(true);
					}

				}
			}
		});
		textSenha.setFont(new Font("Tahoma", Font.BOLD, 25));
		textSenha.setBounds(792, 383, 564, 50);
		contentPane.add(textSenha);
		btnLogin.setBounds(792, 523, 564, 76);
		contentPane.add(btnLogin);
		
		JButton btnSair = new JButton("");
		btnSair.setOpaque(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBorderPainted(false);
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
		btnSair.setBounds(1330, 5, 41, 44);
		contentPane.add(btnSair);
		
		JButton btnMinimizar = new JButton("");
		btnMinimizar.setBounds(1268, 5, 41, 44);
		btnMinimizar.setOpaque(false);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setBorderPainted(false);
		contentPane.add(btnMinimizar);
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
			
		});
		JLabel Imagem = new JLabel("");
		Imagem.setIcon(new ImageIcon(path));
		Imagem.setBounds(0, 0, 1384, 761);
		contentPane.add(Imagem);
	
		compCoords = null;
        contentPane.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
                compCoords = null;
            }

            public void mousePressed(MouseEvent e) {
                compCoords = e.getPoint();
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseClicked(MouseEvent e) {
            }
        });
        contentPane.addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e) {
            }

            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                frame.setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
            }
        });
	
}
	}
