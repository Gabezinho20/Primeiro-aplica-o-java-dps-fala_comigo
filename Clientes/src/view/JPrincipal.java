package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Cliente;
import model.ModeloTabela;

import javax.swing.JScrollPane;

public class JPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ArrayList<Cliente> clientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
					frame.setLocationRelativeTo(null);
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
	public JPrincipal() {
		clientes = new ArrayList<>();
		clientes.add(
				new Cliente("1", "João", "joao@gmail.com", "999.999.999-99", "99999-9999", "Não informado"));
		clientes.add(new Cliente("2", "Maria", "maria@gmail.com", "999.999.999-99", "99999-9999",
				"Não informado"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(44, 45, 117, 23);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(174, 46, 288, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 79, 628, 226);
		contentPane.add(scrollPane);

		ModeloTabela modeloTabela = new ModeloTabela(clientes);

		table = new JTable();
		table.setModel(modeloTabela);
		scrollPane.setViewportView(table);

	}
}
