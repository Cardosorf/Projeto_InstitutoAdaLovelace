package com.ms.sigada.view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

import com.ms.sigada.controller.*;

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
	private JTextField txtTelefoneResponsavel2;
	private JTextField txtEndereco2Consulta;
	private JLabel lblTelefoneResponsavel1Consulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManterAlunoForm frame = new ManterAlunoForm("");
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
	public ManterAlunoForm(String name) {
		setResizable(false);
		setTitle("Manter Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane btnVoltar = new JTabbedPane(JTabbedPane.TOP);
		btnVoltar.setBounds(5, 21, 1264, 665);
		contentPane.add(btnVoltar);
		
		JPanel abaCadastrar = new JPanel();
		btnVoltar.addTab("Cadastrar", null, abaCadastrar, null);
		abaCadastrar.setLayout(null);
		
		JLabel lblNomeCompletoCadastro = new JLabel("Nome Completo");
		lblNomeCompletoCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeCompletoCadastro.setBounds(23, 22, 248, 37);
		abaCadastrar.add(lblNomeCompletoCadastro);
		
		txtNomeCompletoCadastro = new JTextField();
		txtNomeCompletoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeCompletoCadastro.setBounds(23, 59, 1213, 43);
		abaCadastrar.add(txtNomeCompletoCadastro);
		txtNomeCompletoCadastro.setColumns(10);
		
		JLabel lblCpfCadastro = new JLabel("CPF");
		lblCpfCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCpfCadastro.setBounds(23, 123, 52, 37);
		abaCadastrar.add(lblCpfCadastro);
		
		txtCPFCadastro = new JTextField();
		txtCPFCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBounds(23, 161, 508, 43);
		abaCadastrar.add(txtCPFCadastro);
		
		JLabel lblDataDeNascimentoCadastro = new JLabel("Data de Nascimento");
		lblDataDeNascimentoCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDataDeNascimentoCadastro.setBounds(677, 123, 315, 37);
		abaCadastrar.add(lblDataDeNascimentoCadastro);
		
		txtDataDeNascimentoCadastro = new JTextField();
		txtDataDeNascimentoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDataDeNascimentoCadastro.setColumns(10);
		txtDataDeNascimentoCadastro.setBounds(677, 161, 559, 43);
		abaCadastrar.add(txtDataDeNascimentoCadastro);
		
		JLabel lblNomeResponsavel1Cadastro = new JLabel("Nome Respons\u00E1vel 1");
		lblNomeResponsavel1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel1Cadastro.setBounds(23, 233, 326, 37);
		abaCadastrar.add(lblNomeResponsavel1Cadastro);
		
		txtNomeResponsavel1Cadastro = new JTextField();
		txtNomeResponsavel1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel1Cadastro.setColumns(10);
		txtNomeResponsavel1Cadastro.setBounds(23, 268, 508, 43);
		abaCadastrar.add(txtNomeResponsavel1Cadastro);
		
		JLabel lblNomeResponsavel2Cadastro = new JLabel("Nome Respons\u00E1vel 2");
		lblNomeResponsavel2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel2Cadastro.setBounds(677, 225, 326, 43);
		abaCadastrar.add(lblNomeResponsavel2Cadastro);
		
		txtNomeResponsavel2Cadastro = new JTextField();
		txtNomeResponsavel2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel2Cadastro.setColumns(10);
		txtNomeResponsavel2Cadastro.setBounds(675, 268, 561, 43);
		abaCadastrar.add(txtNomeResponsavel2Cadastro);
		
		JLabel lblTelefoneResponsavel1Cadastro = new JLabel("Telefone Respons\u00E1vel 1");
		lblTelefoneResponsavel1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel1Cadastro.setBounds(23, 347, 409, 37);
		abaCadastrar.add(lblTelefoneResponsavel1Cadastro);
		
		txtTelefoneResponsavel1Cadastro = new JTextField();
		txtTelefoneResponsavel1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel1Cadastro.setColumns(10);
		txtTelefoneResponsavel1Cadastro.setBounds(23, 381, 508, 43);
		abaCadastrar.add(txtTelefoneResponsavel1Cadastro);
		
		JLabel lblTelefoneResponsavel2Cadastro = new JLabel("Telefone Respons\u00E1vel 2");
		lblTelefoneResponsavel2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel2Cadastro.setBounds(677, 347, 361, 37);
		abaCadastrar.add(lblTelefoneResponsavel2Cadastro);
		
		txtTelefoneResponsavel2Cadastro = new JTextField();
		txtTelefoneResponsavel2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel2Cadastro.setColumns(10);
		txtTelefoneResponsavel2Cadastro.setBounds(677, 381, 559, 43);
		abaCadastrar.add(txtTelefoneResponsavel2Cadastro);
		
		JLabel lblEndereco1Cadastro = new JLabel("Endere\u00E7o 1");
		lblEndereco1Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco1Cadastro.setBounds(23, 445, 178, 37);
		abaCadastrar.add(lblEndereco1Cadastro);
		
		txtEndereco1Cadastro = new JTextField();
		txtEndereco1Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco1Cadastro.setColumns(10);
		txtEndereco1Cadastro.setBounds(23, 481, 508, 43);
		abaCadastrar.add(txtEndereco1Cadastro);
		
		JLabel lblEndereco2Cadastro = new JLabel("Endere\u00E7o 2");
		lblEndereco2Cadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco2Cadastro.setBounds(675, 445, 168, 37);
		abaCadastrar.add(lblEndereco2Cadastro);
		
		txtEndereco2Cadastro = new JTextField();
		txtEndereco2Cadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco2Cadastro.setColumns(10);
		txtEndereco2Cadastro.setBounds(675, 481, 561, 43);
		abaCadastrar.add(txtEndereco2Cadastro);
		
		JButton btnSalvarCadastro = new JButton("Salvar");
		btnSalvarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlunoController cadastro = new AlunoController();
				if(cadastro.cadastraAluno(0, txtNomeCompletoCadastro.getText(), txtDataDeNascimentoCadastro.getText(),
						txtNomeResponsavel1Cadastro.getText(), txtNomeResponsavel2Cadastro.getText(), txtEndereco1Cadastro.getText(), txtEndereco2Cadastro.getText(),
						txtTelefoneResponsavel1Cadastro.getText(), txtTelefoneResponsavel2Cadastro.getText(), txtCPFCadastro.getText())) {
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
					limpaCampos();
				}else {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar!");
				}
			}
		});
		btnSalvarCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalvarCadastro.setBounds(421, 570, 159, 55);
		abaCadastrar.add(btnSalvarCadastro);
		
		JButton btnLimparCadastro = new JButton("Limpar");
		btnLimparCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCampos();
			}
		});
		btnLimparCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimparCadastro.setBounds(635, 570, 159, 55);
		abaCadastrar.add(btnLimparCadastro);
		
		JPanel abaConsultar = new JPanel();
		btnVoltar.addTab("Consultar", null, abaConsultar, null);
		abaConsultar.setLayout(null);
		
		JLabel lblSelecionarAlunoConsulta = new JLabel("Selecionar Aluno");
		lblSelecionarAlunoConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelecionarAlunoConsulta.setBounds(21, 40, 178, 28);
		abaConsultar.add(lblSelecionarAlunoConsulta);
		
		JComboBox<String> comboBoxConsultarAluno = new JComboBox<String>();
		comboBoxConsultarAluno.setBounds(209, 43, 235, 28);
		abaConsultar.add(comboBoxConsultarAluno);
		
		JLabel lblNomeCompletoConsulta = new JLabel("Nome Completo");
		lblNomeCompletoConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeCompletoConsulta.setBounds(21, 79, 248, 37);
		abaConsultar.add(lblNomeCompletoConsulta);
		
		txtNomeCompletoConsulta = new JTextField();
		txtNomeCompletoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeCompletoConsulta.setColumns(10);
		txtNomeCompletoConsulta.setBounds(21, 116, 1213, 43);
		abaConsultar.add(txtNomeCompletoConsulta);
		
		JLabel lblCPFConsulta = new JLabel("CPF");
		lblCPFConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCPFConsulta.setBounds(21, 180, 52, 37);
		abaConsultar.add(lblCPFConsulta);
		
		txtCPFConsulta = new JTextField();
		txtCPFConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCPFConsulta.setColumns(10);
		txtCPFConsulta.setBounds(21, 218, 508, 43);
		abaConsultar.add(txtCPFConsulta);
		
		JLabel lblDataDeNascimentoConsulta = new JLabel("Data de Nascimento");
		lblDataDeNascimentoConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDataDeNascimentoConsulta.setBounds(675, 180, 315, 37);
		abaConsultar.add(lblDataDeNascimentoConsulta);
		
		txtDataDeNascimentoConsulta = new JTextField();
		txtDataDeNascimentoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtDataDeNascimentoConsulta.setColumns(10);
		txtDataDeNascimentoConsulta.setBounds(675, 218, 559, 43);
		abaConsultar.add(txtDataDeNascimentoConsulta);
		
		JLabel lblNomeResponsavel1Consulta = new JLabel("Nome Respons\u00E1vel 1");
		lblNomeResponsavel1Consulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel1Consulta.setBounds(21, 290, 326, 37);
		abaConsultar.add(lblNomeResponsavel1Consulta);
		
		txtNomeResponsavel1Consulta = new JTextField();
		txtNomeResponsavel1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel1Consulta.setColumns(10);
		txtNomeResponsavel1Consulta.setBounds(21, 325, 508, 43);
		abaConsultar.add(txtNomeResponsavel1Consulta);
		
		JLabel lblNomeResponsavel2 = new JLabel("Nome Respons\u00E1vel 2");
		lblNomeResponsavel2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeResponsavel2.setBounds(675, 282, 326, 43);
		abaConsultar.add(lblNomeResponsavel2);
		
		txtNomeResponsavel2Consulta = new JTextField();
		txtNomeResponsavel2Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNomeResponsavel2Consulta.setColumns(10);
		txtNomeResponsavel2Consulta.setBounds(673, 325, 561, 43);
		abaConsultar.add(txtNomeResponsavel2Consulta);
		
		lblTelefoneResponsavel1Consulta = new JLabel("Telefone Respons\u00E1vel 1");
		lblTelefoneResponsavel1Consulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel1Consulta.setBounds(21, 404, 409, 37);
		abaConsultar.add(lblTelefoneResponsavel1Consulta);
		
		txtTelefoneResponsavel1Consulta = new JTextField();
		txtTelefoneResponsavel1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel1Consulta.setColumns(10);
		txtTelefoneResponsavel1Consulta.setBounds(21, 438, 508, 43);
		abaConsultar.add(txtTelefoneResponsavel1Consulta);
		
		JLabel lblTelefoneResponsavel2Consulta = new JLabel("Telefone Respons\u00E1vel 2");
		lblTelefoneResponsavel2Consulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefoneResponsavel2Consulta.setBounds(675, 404, 361, 37);
		abaConsultar.add(lblTelefoneResponsavel2Consulta);
		
		txtTelefoneResponsavel2 = new JTextField();
		txtTelefoneResponsavel2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTelefoneResponsavel2.setColumns(10);
		txtTelefoneResponsavel2.setBounds(675, 438, 559, 43);
		abaConsultar.add(txtTelefoneResponsavel2);
		
		JLabel lblEndereco1Consulta = new JLabel("Endere\u00E7o 1");
		lblEndereco1Consulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco1Consulta.setBounds(21, 502, 178, 37);
		abaConsultar.add(lblEndereco1Consulta);
		
		txtEndereco1Consulta = new JTextField();
		txtEndereco1Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco1Consulta.setColumns(10);
		txtEndereco1Consulta.setBounds(21, 538, 508, 43);
		abaConsultar.add(txtEndereco1Consulta);
		
		JLabel lblEndereco2Consulta = new JLabel("Endere\u00E7o 2");
		lblEndereco2Consulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereco2Consulta.setBounds(673, 502, 168, 37);
		abaConsultar.add(lblEndereco2Consulta);
		
		txtEndereco2Consulta = new JTextField();
		txtEndereco2Consulta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEndereco2Consulta.setColumns(10);
		txtEndereco2Consulta.setBounds(673, 538, 561, 43);
		abaConsultar.add(txtEndereco2Consulta);
		
		JButton btnSalvarConsulta = new JButton("Salvar");
		btnSalvarConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalvarConsulta.setBounds(443, 603, 138, 39);
		abaConsultar.add(btnSalvarConsulta);
		
		JButton btnLimparConsulta = new JButton("Limpar");
        btnLimparConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnLimparConsulta.setBounds(606, 603, 138, 39);
        abaConsultar.add(btnLimparConsulta);

        JButton btnNewButton = new JButton("Voltar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				dispose();
                MenuRHForm page=new MenuRHForm(name);
                page.setVisible(true);
            }
        });
        btnNewButton.setBounds(1180, 0, 89, 23);
        contentPane.add(btnNewButton);
        
        AlunoController controller = new AlunoController();
        Map<Integer, String> alunos = new TreeMap<>();
        alunos = controller.consultaTodosAlunos();
        for(Integer user : alunos.keySet()) {
        	comboBoxConsultarAluno.addItem(alunos.get(user));
        	System.out.println(alunos.get(user));
        }
	
	
	}
	
	public void limpaCampos(){
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
}
