package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class VentanaMain {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMain window = new VentanaMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelReportes = new JPanel();
		tabbedPane.addTab("Reportes", null, panelReportes, null);
		panelReportes.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPrestamos = new JPanel();
		tabbedPane.addTab("Préstamos", null, panelPrestamos, null);
		panelPrestamos.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		panelPrestamos.add(tabbedPane_2, BorderLayout.CENTER);
		
		JPanel panPresCrear = new JPanel();
		tabbedPane_2.addTab("Crear préstamo", null, panPresCrear, null);
		panPresCrear.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("A nombre de: ");
		lblNewLabel_1.setBounds(10, 11, 79, 14);
		panPresCrear.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 7, 465, 22);
		panPresCrear.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Se prestará:");
		lblNewLabel_2.setBounds(10, 49, 79, 14);
		panPresCrear.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Crear préstamo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(457, 261, 107, 33);
		panPresCrear.add(btnNewButton);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(99, 49, 465, 201);
		panPresCrear.add(scrollPane_4);
		
		JList list = new JList();
		scrollPane_4.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("Incluir alerta?");
		lblNewLabel_4.setBounds(10, 114, 79, 14);
		panPresCrear.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nota: Esto no");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 128, 79, 14);
		panPresCrear.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("es editable");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 139, 79, 14);
		panPresCrear.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("  Sí            No");
		lblNewLabel_7.setBounds(10, 174, 79, 14);
		panPresCrear.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 195, 21, 23);
		panPresCrear.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBounds(55, 195, 21, 23);
		panPresCrear.add(rdbtnNewRadioButton_1);
		
		JPanel panPresRetornarItems = new JPanel();
		tabbedPane_2.addTab("Retornar ítems", null, panPresRetornarItems, null);
		panPresRetornarItems.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Del préstamo:");
		lblNewLabel_1_1.setBounds(10, 11, 79, 14);
		panPresRetornarItems.add(lblNewLabel_1_1);
		
		JButton btnDevolvertems = new JButton("Devolver ítems");
		btnDevolvertems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDevolvertems.setBounds(457, 261, 107, 33);
		panPresRetornarItems.add(btnDevolvertems);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 7, 465, 22);
		panPresRetornarItems.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Se devolverá:");
		lblNewLabel_3.setBounds(10, 49, 79, 14);
		panPresRetornarItems.add(lblNewLabel_3);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(99, 49, 465, 201);
		panPresRetornarItems.add(scrollPane_5);
		
		JList list_1 = new JList();
		scrollPane_5.setViewportView(list_1);
		
		JPanel panPresFin = new JPanel();
		tabbedPane_2.addTab("Finalizar préstamo", null, panPresFin, null);
		
		JPanel panelAdmin = new JPanel();
		tabbedPane.addTab("Administrador", null, panelAdmin, null);
		panelAdmin.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panelAdmin.add(tabbedPane_1, BorderLayout.CENTER);
		
		JPanel panAdmPers = new JPanel();
		tabbedPane_1.addTab("Personas", null, panAdmPers, null);
		panAdmPers.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personas Registradas");
		lblNewLabel.setBounds(213, 11, 148, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panAdmPers.add(lblNewLabel);
		
		JButton btnPersonasAgregar = new JButton("Agregar");
		btnPersonasAgregar.setBounds(55, 271, 89, 23);
		btnPersonasAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panAdmPers.add(btnPersonasAgregar);
		
		JButton btnPersonasVerModificar = new JButton("Ver/Modificar");
		btnPersonasVerModificar.setBounds(154, 271, 116, 23);
		panAdmPers.add(btnPersonasVerModificar);
		
		JButton btnPersonasBorrar = new JButton("Borrar");
		btnPersonasBorrar.setBounds(420, 271, 89, 23);
		panAdmPers.add(btnPersonasBorrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 554, 225);
		panAdmPers.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Tel\u00E9fono", "E-mail"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panAdmItems = new JPanel();
		tabbedPane_1.addTab("Ítems", null, panAdmItems, null);
		panAdmItems.setLayout(null);
		
		JLabel lbltemsRegistrados = new JLabel("Ítems Registrados");
		lbltemsRegistrados.setHorizontalAlignment(SwingConstants.CENTER);
		lbltemsRegistrados.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbltemsRegistrados.setBounds(220, 11, 148, 25);
		panAdmItems.add(lbltemsRegistrados);
		
		JButton btnPersonasAgregar_1 = new JButton("Agregar");
		btnPersonasAgregar_1.setBounds(55, 271, 89, 23);
		panAdmItems.add(btnPersonasAgregar_1);
		
		JButton btnPersonasVerModificar_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1.setBounds(154, 271, 116, 23);
		panAdmItems.add(btnPersonasVerModificar_1);
		
		JButton btnPersonasBorrar_1 = new JButton("Borrar");
		btnPersonasBorrar_1.setBounds(420, 271, 89, 23);
		panAdmItems.add(btnPersonasBorrar_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 35, 554, 225);
		panAdmItems.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombre", "En pr\u00E9stamo?"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JPanel panAdmCateg = new JPanel();
		tabbedPane_1.addTab("Categorías", null, panAdmCateg, null);
		panAdmCateg.setLayout(null);
		
		JButton btnPersonasAgregar_1_1 = new JButton("Agregar");
		btnPersonasAgregar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPersonasAgregar_1_1.setBounds(55, 271, 89, 23);
		panAdmCateg.add(btnPersonasAgregar_1_1);
		
		JButton btnPersonasVerModificar_1_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1_1.setBounds(154, 271, 116, 23);
		panAdmCateg.add(btnPersonasVerModificar_1_1);
		
		JButton btnPersonasBorrar_1_1 = new JButton("Borrar");
		btnPersonasBorrar_1_1.setBounds(420, 271, 89, 23);
		panAdmCateg.add(btnPersonasBorrar_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 554, 249);
		panAdmCateg.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Categor\u00EDas"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(table_2);
		
		JPanel panAdmTipos = new JPanel();
		tabbedPane_1.addTab("Tipos", null, panAdmTipos, null);
		panAdmTipos.setLayout(null);
		
		JButton btnPersonasAgregar_1_1_1 = new JButton("Agregar");
		btnPersonasAgregar_1_1_1.setBounds(55, 271, 89, 23);
		panAdmTipos.add(btnPersonasAgregar_1_1_1);
		
		JButton btnPersonasVerModificar_1_1_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1_1_1.setBounds(154, 271, 116, 23);
		panAdmTipos.add(btnPersonasVerModificar_1_1_1);
		
		JButton btnPersonasBorrar_1_1_1 = new JButton("Borrar");
		btnPersonasBorrar_1_1_1.setBounds(420, 271, 89, 23);
		panAdmTipos.add(btnPersonasBorrar_1_1_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 554, 249);
		panAdmTipos.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tipos"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_3.setViewportView(table_3);
	}
}
