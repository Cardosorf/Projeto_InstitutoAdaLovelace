package com.ms.sigada.view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

import com.ms.sigada.controller.*;
import com.ms.sigada.model.Aluno;
import javax.swing.ImageIcon;
import java.awt.Insets;

public class ManterAlunoForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCompletoCadastro;
	private JTextField txtNomeResponsavel1Cadastro;
	private JTextField txtCPFCadastro;
	private JTextField txtDataDeNascimentoCadastro;
	private JTextField txtNomeResponsavel2Cadastro;
	private JTextField txtTelefoneResponsavel1Cadastro;
	private JTextField txtTelefoneResponsavel2Cadastro;
	private JTextField txtEndereco1Cadastro;
	private JTextField txtEndereco2Cadastro;
	private JTextField txtNomeCompletoConsulta;
	private JTextField txtCPFConsulta;
	private JTextField txtDataDeNascimentoConsulta;
	private JTextField txtNomeResponsavel1Consulta;
	private JTextField txtNomeResponsavel2Consulta;
	private JTextField txtTelefoneResponsavel1Consulta;
	private JTextField txtEndereco1Consulta;
	private JTextField txtTelefoneResponsavel2Consulta;
	private JTextField txtEndereco2Consulta;

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
					// ManterAlunoForm frame = new ManterAlunoForm("");
					// frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManterAlunoForm(String name) {
		String nomeArq;
		ManterAlunoForm frame = this;
		setUndecorated(true);
		setTitle("Manter Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 1400, 800);
		contentPane = new JPanel();
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ALUNOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(611, 19, 183, 87);
		contentPane.add(lblNewLabel);

		JButton btnSair = new JButton("");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSair.setOpaque(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBorderPainted(false);
		btnSair.setBounds(1338, 19, 41, 44);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Tem certeza que quer sair?", "Warning",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		JButton btnMinimizar = new JButton("");
		btnMinimizar.setOpaque(false);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setBorderPainted(false);
		btnMinimizar.setBounds(1276, 19, 41, 44);
		contentPane.add(btnMinimizar);
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});

		JTabbedPane panelAbas = new JTabbedPane(JTabbedPane.TOP);
		panelAbas.setBounds(5, 60, 1385, 726);
		contentPane.add(panelAbas);

		JPanel abaCadastrar = new JPanel();
		abaCadastrar.setBackground(Color.WHITE);
		file1 = new File("add24.png");
		path = file1.getAbsolutePath().replaceFirst("add24.png", "sigAdaForms/add24.png");
		panelAbas.addTab("  Cadastrar", new ImageIcon(path), abaCadastrar, null);
		abaCadastrar.setLayout(null);

		JLabel lblNomeCompletoCadastro = new JLabel("");
		file1 = new File("nome.jpg");
		path = file1.getAbsolutePath().replaceFirst("nome.jpg", "sigAdaForms/nome.jpg");
		lblNomeCompletoCadastro.setIcon(new ImageIcon(path));
		lblNomeCompletoCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeCompletoCadastro.setBounds(23, 22, 248, 37);
		abaCadastrar.add(lblNomeCompletoCadastro);

		txtNomeCompletoCadastro = new JTextField();
		txtNomeCompletoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeCompletoCadastro.setBounds(23, 59, 1309, 43);
		abaCadastrar.add(txtNomeCompletoCadastro);
		txtNomeCompletoCadastro.setColumns(10);

		JLabel lblCpfCadastro = new JLabel("");
		file1 = new File("cpf.png");
		path = file1.getAbsolutePath().replaceFirst("cpf.png", "sigAdaForms/cpf.png");
		lblCpfCadastro.setIcon(new ImageIcon(path));
		lblCpfCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCpfCadastro.setBounds(23, 123, 52, 37);
		abaCadastrar.add(lblCpfCadastro);

		txtCPFCadastro = new JTextField();
		txtCPFCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBounds(23, 161, 596, 43);
		abaCadastrar.add(txtCPFCadastro);

		JLabel lblDataDeNascimentoCadastro = new JLabel("");
		file1 = new File("datanasc.jpg");
		path = file1.getAbsolutePath().replaceFirst("datanasc.jpg", "sigAdaForms/datanasc.jpg");
		lblDataDeNascimentoCadastro.setIcon(new ImageIcon(path));
		lblDataDeNascimentoCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDataDeNascimentoCadastro.setBounds(715, 123, 315, 37);
		abaCadastrar.add(lblDataDeNascimentoCadastro);

		txtDataDeNascimentoCadastro = new JTextField();
		txtDataDeNascimentoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDataDeNascimentoCadastro.setColumns(10);
		txtDataDeNascimentoCadastro.setBounds(715, 161, 617, 43);
		abaCadastrar.add(txtDataDeNascimentoCadastro);

		JLabel lblNomeResponsavel1Cadastro = new JLabel("");
		file1 = new File("nomeresp1.jpg");
		path = file1.getAbsolutePath().replaceFirst("nomeresp1.jpg", "sigAdaForms/nomeresp1.jpg");
		lblNomeResponsavel1Cadastro.setIcon(new ImageIcon(path));
		lblNomeResponsavel1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel1Cadastro.setBounds(23, 225, 248, 37);
		abaCadastrar.add(lblNomeResponsavel1Cadastro);

		txtNomeResponsavel1Cadastro = new JTextField();
		txtNomeResponsavel1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel1Cadastro.setColumns(10);
		txtNomeResponsavel1Cadastro.setBounds(23, 268, 596, 43);
		abaCadastrar.add(txtNomeResponsavel1Cadastro);

		JLabel lblNomeResponsavel2Cadastro = new JLabel("");
		file1 = new File("nomeresp2.jpg");
		path = file1.getAbsolutePath().replaceFirst("nomeresp2.jpg", "sigAdaForms/nomeresp2.jpg");
		lblNomeResponsavel2Cadastro.setIcon(new ImageIcon(path));
		lblNomeResponsavel2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel2Cadastro.setBounds(715, 225, 326, 43);
		abaCadastrar.add(lblNomeResponsavel2Cadastro);

		txtNomeResponsavel2Cadastro = new JTextField();
		txtNomeResponsavel2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel2Cadastro.setColumns(10);
		txtNomeResponsavel2Cadastro.setBounds(713, 268, 619, 43);
		abaCadastrar.add(txtNomeResponsavel2Cadastro);

		JLabel lblTelefoneResponsavel1Cadastro = new JLabel("");
		file1 = new File("telresp1.jpg");
		path = file1.getAbsolutePath().replaceFirst("telresp1.jpg", "sigAdaForms/telresp1.jpg");
		lblTelefoneResponsavel1Cadastro.setIcon(new ImageIcon(path));
		lblTelefoneResponsavel1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel1Cadastro.setBounds(23, 347, 409, 37);
		abaCadastrar.add(lblTelefoneResponsavel1Cadastro);

		txtTelefoneResponsavel1Cadastro = new JTextField();
		txtTelefoneResponsavel1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel1Cadastro.setColumns(10);
		txtTelefoneResponsavel1Cadastro.setBounds(23, 381, 596, 43);
		abaCadastrar.add(txtTelefoneResponsavel1Cadastro);

		JLabel lblTelefoneResponsavel2Cadastro = new JLabel("");
		file1 = new File("telresp2.jpg");
		path = file1.getAbsolutePath().replaceFirst("telresp2.jpg", "sigAdaForms/telresp2.jpg");
		lblTelefoneResponsavel2Cadastro.setIcon(new ImageIcon(path));
		lblTelefoneResponsavel2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel2Cadastro.setBounds(715, 347, 361, 37);
		abaCadastrar.add(lblTelefoneResponsavel2Cadastro);

		txtTelefoneResponsavel2Cadastro = new JTextField();
		txtTelefoneResponsavel2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel2Cadastro.setColumns(10);
		txtTelefoneResponsavel2Cadastro.setBounds(715, 381, 617, 43);
		abaCadastrar.add(txtTelefoneResponsavel2Cadastro);

		JLabel lblEndereco1Cadastro = new JLabel("");
		file1 = new File("end1.jpg");
		path = file1.getAbsolutePath().replaceFirst("end1.jpg", "sigAdaForms/end1.jpg");
		lblEndereco1Cadastro.setIcon(new ImageIcon(path));
		lblEndereco1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco1Cadastro.setBounds(23, 445, 178, 37);
		abaCadastrar.add(lblEndereco1Cadastro);

		txtEndereco1Cadastro = new JTextField();
		txtEndereco1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco1Cadastro.setColumns(10);
		txtEndereco1Cadastro.setBounds(23, 481, 596, 43);
		abaCadastrar.add(txtEndereco1Cadastro);

		JLabel lblEndereco2Cadastro = new JLabel("");
		file1 = new File("end2.jpg");
		path = file1.getAbsolutePath().replaceFirst("end2.jpg", "sigAdaForms/end2.jpg");
		lblEndereco2Cadastro.setIcon(new ImageIcon(path));
		lblEndereco2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco2Cadastro.setBounds(713, 445, 168, 37);
		abaCadastrar.add(lblEndereco2Cadastro);

		txtEndereco2Cadastro = new JTextField();
		txtEndereco2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco2Cadastro.setColumns(10);
		txtEndereco2Cadastro.setBounds(713, 481, 619, 43);
		abaCadastrar.add(txtEndereco2Cadastro);

		JButton btnLimparCadastro = new JButton("");
		btnLimparCadastro.setMargin(new Insets(0, 0, 0, 0));
		nomeArq = "btnLimpar.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		btnLimparCadastro.setIcon(new ImageIcon(path));
		btnLimparCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCampos();
			}
		});
		btnLimparCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimparCadastro.setBorderPainted(false);
		btnLimparCadastro.setBounds(683, 619, 159, 43);
		abaCadastrar.add(btnLimparCadastro);

		JPanel abaConsultar = new JPanel();
		abaConsultar.setBackground(Color.WHITE);
		nomeArq = "lupa24.png";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		panelAbas.addTab("Consultar", new ImageIcon(path), abaConsultar, null);
		abaConsultar.setLayout(null);

		JLabel lblSelecionarAlunoConsulta = new JLabel("");
		nomeArq = "selaluno.png";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		lblSelecionarAlunoConsulta.setIcon(new ImageIcon(path));
		lblSelecionarAlunoConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelecionarAlunoConsulta.setBounds(20, 24, 248, 28);
		abaConsultar.add(lblSelecionarAlunoConsulta);

		JComboBox<String> comboBoxConsultarAluno = new JComboBox<String>();
		comboBoxConsultarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AlunoController controller = new AlunoController();
				Aluno aluno = new Aluno();

				Object matriculaTemp = comboBoxConsultarAluno.getSelectedItem();
				if (matriculaTemp == "" || matriculaTemp == null) {
					limpaCamposCadastro();
				}

				else {

					String temp = matriculaTemp.toString();
					System.out.println(matriculaTemp);
					String[] parts = temp.split("- ");
					temp = parts[1];
					aluno = controller.consultaAluno(Integer.parseInt(temp));

					txtNomeCompletoConsulta.setText(aluno.getNome());
					txtCPFConsulta.setText(aluno.getCPF());
					txtDataDeNascimentoConsulta.setText(aluno.getDataDeNascimento());
					txtNomeResponsavel1Consulta.setText(aluno.getNomeResponsavel1());
					txtNomeResponsavel2Consulta.setText(aluno.getNomeResponsavel2());
					txtTelefoneResponsavel1Consulta.setText(aluno.getTelefoneResponsavel1());
					txtTelefoneResponsavel2Consulta.setText(aluno.getTelefoneResponsavel2());
					txtEndereco1Consulta.setText(aluno.getEndereco1());
					txtEndereco2Consulta.setText(aluno.getEndereco2());
				}

			}

		});

		JButton btnSalvarCadastro = new JButton("");
		btnSalvarCadastro.setMargin(new Insets(0, 0, 0, 0));
		btnSalvarCadastro.setBorderPainted(false);
		nomeArq = "btnSalvar.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		btnSalvarCadastro.setIcon(new ImageIcon(path));
		btnSalvarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlunoController cadastro = new AlunoController();

				if (verificaCamposNulos()) {
					return;
				}

				if(!verifyCPF(txtCPFCadastro.getText())) {
					JOptionPane.showMessageDialog(null, "CPF inv�lido!");
					return;
				}
				
				else {
					
					if (cadastro.cadastraAluno(0, txtNomeCompletoCadastro.getText(),
							txtDataDeNascimentoCadastro.getText(), txtNomeResponsavel1Cadastro.getText(),
							txtNomeResponsavel2Cadastro.getText(), txtEndereco1Cadastro.getText(),
							txtEndereco2Cadastro.getText(), txtTelefoneResponsavel1Cadastro.getText(),
							txtTelefoneResponsavel2Cadastro.getText(), txtCPFCadastro.getText())) {
						JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
						limpaCampos();

						comboBoxConsultarAluno.removeAllItems();
						atualizaComboBox(comboBoxConsultarAluno);
					}

					else {
						JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar!");
					}
				}
			}
		});

		btnSalvarCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalvarCadastro.setBounds(497, 619, 159, 43);
		abaCadastrar.add(btnSalvarCadastro);

		comboBoxConsultarAluno.setBounds(261, 24, 468, 28);
		abaConsultar.add(comboBoxConsultarAluno);

		txtNomeCompletoConsulta = new JTextField();
		txtNomeCompletoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeCompletoConsulta.setColumns(10);
		txtNomeCompletoConsulta.setBounds(20, 100, 1306, 43);
		abaConsultar.add(txtNomeCompletoConsulta);

		txtCPFConsulta = new JTextField();
		txtCPFConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCPFConsulta.setColumns(10);
		txtCPFConsulta.setBounds(20, 202, 605, 43);
		abaConsultar.add(txtCPFConsulta);

		txtDataDeNascimentoConsulta = new JTextField();
		txtDataDeNascimentoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDataDeNascimentoConsulta.setColumns(10);
		txtDataDeNascimentoConsulta.setBounds(714, 202, 612, 43);
		abaConsultar.add(txtDataDeNascimentoConsulta);

		txtNomeResponsavel1Consulta = new JTextField();
		txtNomeResponsavel1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel1Consulta.setColumns(10);
		txtNomeResponsavel1Consulta.setBounds(20, 309, 605, 43);
		abaConsultar.add(txtNomeResponsavel1Consulta);

		txtNomeResponsavel2Consulta = new JTextField();
		txtNomeResponsavel2Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel2Consulta.setColumns(10);
		txtNomeResponsavel2Consulta.setBounds(712, 309, 614, 43);
		abaConsultar.add(txtNomeResponsavel2Consulta);

		txtTelefoneResponsavel1Consulta = new JTextField();
		txtTelefoneResponsavel1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel1Consulta.setColumns(10);
		txtTelefoneResponsavel1Consulta.setBounds(20, 422, 605, 43);
		abaConsultar.add(txtTelefoneResponsavel1Consulta);

		txtTelefoneResponsavel2Consulta = new JTextField();
		txtTelefoneResponsavel2Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel2Consulta.setColumns(10);
		txtTelefoneResponsavel2Consulta.setBounds(714, 422, 612, 43);
		abaConsultar.add(txtTelefoneResponsavel2Consulta);

		txtEndereco1Consulta = new JTextField();
		txtEndereco1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco1Consulta.setColumns(10);
		txtEndereco1Consulta.setBounds(20, 522, 605, 43);
		abaConsultar.add(txtEndereco1Consulta);

		txtEndereco2Consulta = new JTextField();
		txtEndereco2Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco2Consulta.setColumns(10);
		txtEndereco2Consulta.setBounds(712, 522, 614, 43);
		abaConsultar.add(txtEndereco2Consulta);

		JButton btnSalvarConsulta = new JButton("");
		btnSalvarConsulta.setMargin(new Insets(0, 0, 0, 0));
		btnSalvarConsulta.setBorderPainted(false);
		nomeArq = "btnSalvar.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		btnSalvarConsulta.setIcon(new ImageIcon(path));
		btnSalvarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AlunoController cadastro = new AlunoController();

				if (verificaCamposNulosConsultar()) {
					return;
				}
				
				if(!verifyCPF(txtCPFConsulta.getText())) {
					JOptionPane.showMessageDialog(null, "CPF inv�lido!");
					return;
				}

				else {
					Object matricula = comboBoxConsultarAluno.getSelectedItem();
					String temp = matricula.toString();
					System.out.println(matricula);
					String[] parts = temp.split("- ");
					temp = parts[1];
					System.out.println(temp);

				if (cadastro.alteraAluno(Integer.parseInt(temp), txtNomeCompletoConsulta.getText(),
							txtDataDeNascimentoConsulta.getText(), txtNomeResponsavel1Consulta.getText(),
							txtNomeResponsavel2Consulta.getText(), txtEndereco1Consulta.getText(),
							txtEndereco2Consulta.getText(), txtTelefoneResponsavel1Consulta.getText(),
							txtTelefoneResponsavel2Consulta.getText(), txtCPFConsulta.getText())) {
						JOptionPane.showMessageDialog(null, "Aluno editado com sucesso!");
						limpaCampos();

						comboBoxConsultarAluno.removeAllItems();
						atualizaComboBox(comboBoxConsultarAluno);
					}
				

				else {
						JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar!");
					}
				}
				
				
			}
		});
		btnSalvarConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalvarConsulta.setBounds(421, 621, 155, 51);
		abaConsultar.add(btnSalvarConsulta);

		JButton btnLimparConsulta = new JButton("");
		btnLimparConsulta.setMargin(new Insets(0, 0, 0, 0));
		nomeArq = "btnLimpar.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		btnLimparConsulta.setIcon(new ImageIcon(path));
		btnLimparConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCamposCadastro();
			}
		});
		btnLimparConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimparConsulta.setBorderPainted(false);
		btnLimparConsulta.setBounds(586, 621, 155, 51);
		abaConsultar.add(btnLimparConsulta);

		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuRHForm page = new MenuRHForm(name);
				page.setVisible(true);
			}
		});
		btnVoltar.setBounds(1209, 19, 41, 44);
		btnVoltar.setOpaque(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		contentPane.add(btnVoltar);

		atualizaComboBox(comboBoxConsultarAluno);

		JLabel label = new JLabel("");
		nomeArq = "nome.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label.setIcon(new ImageIcon(path));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(20, 63, 248, 37);
		abaConsultar.add(label);

		JLabel label_1 = new JLabel("");
		nomeArq = "cpf.png";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_1.setIcon(new ImageIcon(path));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(20, 164, 52, 37);
		abaConsultar.add(label_1);

		JLabel label_2 = new JLabel("");
		nomeArq = "datanasc.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_2.setIcon(new ImageIcon(path));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(712, 164, 315, 37);
		abaConsultar.add(label_2);

		JLabel label_3 = new JLabel("");
		nomeArq = "nomeresp2.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_3.setIcon(new ImageIcon(path));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(712, 266, 326, 43);
		abaConsultar.add(label_3);

		JLabel label_4 = new JLabel("");
		nomeArq = "telresp2.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_4.setIcon(new ImageIcon(path));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(712, 388, 361, 37);
		abaConsultar.add(label_4);

		JLabel label_5 = new JLabel("");
		nomeArq = "telresp1.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_5.setIcon(new ImageIcon(path));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(20, 388, 409, 37);
		abaConsultar.add(label_5);

		JLabel label_6 = new JLabel("");
		nomeArq = "nomeresp1.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_6.setIcon(new ImageIcon(path));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(20, 266, 248, 37);
		abaConsultar.add(label_6);

		JLabel label_7 = new JLabel("");
		nomeArq = "end1.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_7.setIcon(new ImageIcon(path));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(20, 486, 178, 37);
		abaConsultar.add(label_7);

		JLabel label_8 = new JLabel("");
		nomeArq = "end2.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);
		label_8.setIcon(new ImageIcon(path));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(710, 486, 168, 37);
		abaConsultar.add(label_8);


		JButton btnDeletarColsulta = new JButton("");
		btnDeletarColsulta.setMargin(new Insets(0, 0, 0, 0));
		btnDeletarColsulta.setBorderPainted(false);
		nomeArq = "btnDeletar.jpg";
		file1 = new File(nomeArq);
		path = file1.getAbsolutePath().replaceFirst(nomeArq, "sigAdaForms/" + nomeArq);

		
		btnDeletarColsulta.setIcon(new ImageIcon(path));
		
		btnDeletarColsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnDeletarColsulta.setBounds(755, 621, 155, 51);
		abaConsultar.add(btnDeletarColsulta);


		btnDeletarColsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeConsulta = txtNomeCompletoConsulta.getText();
				String cpfConsulta = txtCPFConsulta.getText();
				String dataNascConsulta = txtDataDeNascimentoConsulta.getText();
				String nomeResp1Consulta = txtNomeResponsavel1Consulta.getText();
				String nomeResp2Consulta = txtNomeResponsavel2Consulta .getText();
				String telResp1Consulta = txtTelefoneResponsavel1Consulta.getText();
				String telResp2Consulta = txtTelefoneResponsavel1Consulta.getText();
				String end1Consulta = txtEndereco1Consulta.getText();
				String end2Consulta = txtEndereco2Consulta.getText();

				
				if( nomeConsulta.equals("") || cpfConsulta.equals("") || dataNascConsulta.equals("") || nomeResp1Consulta.equals("") || 
				 telResp1Consulta.equals("") || end1Consulta.equals("")){
					JOptionPane.showMessageDialog(new JFrame(), "Nenhum aluno foi selecionado. Por favor, selecione um aluno.", "Erro",
					JOptionPane.ERROR_MESSAGE);
				}
				else{
					AlunoController control = new AlunoController();
					String dadosAluno[] = comboBoxConsultarAluno.getSelectedItem().toString().split("- ");

					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar o aluno " + nomeConsulta + " ?", "Warning",
					dialogButton);
					
					if (dialogResult == JOptionPane.YES_OPTION) {
						if(control.removeAluno(Integer.parseInt(dadosAluno[1]))){
							System.out.println(dadosAluno[1] + " oiii");
							JOptionPane.showMessageDialog(null, "O aluno "+nomeConsulta+" foi removido com sucesso!");
							limpaCampos();
							comboBoxConsultarAluno.removeAllItems();
							atualizaComboBox(comboBoxConsultarAluno);
						}
						else{
							JOptionPane.showMessageDialog(new JFrame(), "N�o foi poss�vel remover o aluno selecionado.", "Erro",
					JOptionPane.ERROR_MESSAGE);
						}
					}
				
				}
			
		}
});
		
		
		
		
		
		
		JLabel imagem = new JLabel("");
		file1 = new File("4.png");
		path = file1.getAbsolutePath().replaceFirst("4.png", "sigAdaForms/4.png");
		imagem.setIcon(new ImageIcon(path));
		imagem.setBounds(0, 0, 1400, 800);
		contentPane.add(imagem);

		
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

	private void atualizaComboBox(JComboBox<String> comboBoxConsultarAluno) {
		AlunoController controller = new AlunoController();
		Map<Integer, String> alunos = new TreeMap<>();
		alunos = controller.consultaTodosAlunos();

		comboBoxConsultarAluno.addItem("");
		for (Integer user : alunos.keySet()) {
			comboBoxConsultarAluno.addItem(alunos.get(user));
		}
	}

	public void limpaCampos() {
		txtNomeCompletoCadastro.setText("");
		txtDataDeNascimentoCadastro.setText("");
		txtTelefoneResponsavel1Cadastro.setText("");
		txtTelefoneResponsavel2Cadastro.setText("");
		txtNomeResponsavel1Cadastro.setText("");
		txtNomeResponsavel2Cadastro.setText("");
		txtEndereco1Cadastro.setText("");
		txtEndereco2Cadastro.setText("");
		txtCPFCadastro.setText("");
	}

	private void limpaCamposCadastro() {
		txtNomeCompletoConsulta.setText("");
		txtCPFConsulta.setText("");
		txtDataDeNascimentoConsulta.setText("");
		txtNomeResponsavel1Consulta.setText("");
		txtNomeResponsavel2Consulta.setText("");
		txtTelefoneResponsavel1Consulta.setText("");
		txtTelefoneResponsavel2Consulta.setText("");
		txtEndereco1Consulta.setText("");
		txtEndereco2Consulta.setText("");
	}

	private boolean verificaCamposNulos() {
		if (txtNomeCompletoCadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Nome Completo se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtDataDeNascimentoCadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Data de Nascimento se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtNomeResponsavel1Cadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Nome Responsável se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtEndereco1Cadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Endereço 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtTelefoneResponsavel1Cadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Telefone Responsável 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtCPFCadastro.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Telefone Responsável 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}	

		else {
			if (txtEndereco2Cadastro.getText().equals("")) {
				txtEndereco2Cadastro.setText("-");
			}
			if (txtTelefoneResponsavel2Cadastro.getText().equals("")) {
				txtTelefoneResponsavel2Cadastro.setText("-");
			}
			if (txtNomeResponsavel2Cadastro.getText().equals("")) {
				txtNomeResponsavel2Cadastro.setText("-");
			}
			
			return false;
		}
		
		

	}
	
	
	private boolean verifyCPF(String cpf) {
		int firstDigitValidity = 0;
		int secondDigitValidity = 0;
		int firstFactor = 10;
		int secondFactor = 11;

		if(cpf.length() < 11 || cpf.length() > 11) {
			return false;
		}
		
		
		for (char x : cpf.toCharArray()) {
			firstDigitValidity += Integer.parseInt(String.valueOf(x))*firstFactor;
			firstFactor--;
			if(firstFactor == 1)
				break;
		}
		
		for (char x : cpf.toCharArray()) {
			secondDigitValidity += Integer.parseInt(String.valueOf(x))*secondFactor;
			secondFactor--;
			if(secondFactor == 1)
				break;
		}
		
		
		firstDigitValidity = 11 - (firstDigitValidity % 11);
		secondDigitValidity = 11 - (secondDigitValidity % 11);
	
		if(firstDigitValidity > 9)
			firstDigitValidity = 0;
		
		if(secondDigitValidity > 9)
			secondDigitValidity = 0;

		if(firstDigitValidity == Character.getNumericValue(cpf.charAt(9)) && secondDigitValidity == Character.getNumericValue(cpf.charAt(10))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	private boolean verificaCamposNulosConsultar() {
		if (txtNomeCompletoConsulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Nome Completo se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtDataDeNascimentoConsulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Data de Nascimento se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtNomeResponsavel1Consulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Nome Responsável se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtEndereco1Consulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Endereço 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtTelefoneResponsavel1Consulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Telefone Responsável 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else if (txtCPFConsulta.getText().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Campo Telefone Responsável 1 se encontra vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}

		else {
			if (txtEndereco2Consulta.getText().equals("")) {
				txtEndereco2Consulta.setText("-");
			}
			if (txtTelefoneResponsavel2Consulta.getText().equals("")) {
				txtTelefoneResponsavel2Consulta.setText("-");
			}
			if (txtNomeResponsavel2Consulta.getText().equals("")) {
				txtNomeResponsavel2Consulta.setText("-");
			}
			return false;
		}

	}
}
