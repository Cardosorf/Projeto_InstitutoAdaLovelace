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
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.Color;

import com.ms.sigada.view.*;
import javax.swing.ImageIcon;

public class MenuRHForm extends JFrame {

	private JPanel contentPane;
    static Point compCoords;
    
    static File file1;
	static private String path;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//frame.setVisible(true);
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
		MenuRHForm frame  = this;
		setResizable(false);
		setUndecorated(true);
		setTitle("Menu RH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userName = new JLabel(name);
		userName.setForeground(new Color(255, 255, 255));
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		userName.setFont(new Font("Tahoma", Font.BOLD, 30));
		userName.setBounds(143, 511, 414, 41);
		contentPane.add(userName);
		
		JButton btnFuncionario = new JButton("");
		btnFuncionario.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFuncionario.setOpaque(false);
		btnFuncionario.setContentAreaFilled(false);
		btnFuncionario.setBorderPainted(false);
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JButton btnSair = new JButton("");
		btnSair.setOpaque(false);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSair.setContentAreaFilled(false);
		btnSair.setBorderPainted(false);
		btnSair.setBounds(1334, 23, 41, 44);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  int dialogButton = JOptionPane.YES_NO_OPTION;
	          int dialogResult = JOptionPane.showConfirmDialog (null, "Tem certeza que quer sair?","Warning",dialogButton);
	          if(dialogResult == JOptionPane.YES_OPTION){
	                System.exit(0);
	          }
			}
		});
		
		JButton btnMinimizar = new JButton("");
		btnMinimizar.setOpaque(false);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setBorderPainted(false);
		btnMinimizar.setBounds(1277, 23, 41, 44);
		contentPane.add(btnMinimizar);
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
			});
		
		btnFuncionario.setBounds(697, 363, 298, 298);
		contentPane.add(btnFuncionario);
		
		JButton btnAluno = new JButton("");
		btnAluno.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAluno.setOpaque(false);
		btnAluno.setContentAreaFilled(false);
		btnAluno.setBorderPainted(false);
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                ManterAlunoForm page=new ManterAlunoForm(name);
                page.setVisible(true);
			}
		});
		btnAluno.setBounds(1075, 363, 298, 298);
		contentPane.add(btnAluno);
		
		JLabel Imagem = new JLabel("");
		file1 = new File("2.png");
		path = file1.getAbsolutePath().replaceFirst("2.png","sigAdaForms/2.png");
		Imagem.setIcon(new ImageIcon(path));
		Imagem.setBounds(0, 0, 1400, 800);
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
