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
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class VentanaMain {

	private JFrame framePrincipal;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tableReportesUsuario;
	private JTable tableReportesItem;
	private JTable tableReportesCategoria;
	private JTable tableReportesTipo;
	private JTextField textField;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnFinPres;
	private JCheckBox chckbxFinPres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMain window = new VentanaMain();
					window.framePrincipal.setVisible(true);
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
		framePrincipal = new JFrame();
		framePrincipal.setBounds(100, 100, 600, 400);
		framePrincipal.setLocationRelativeTo(null);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabPrincipal = new JTabbedPane(JTabbedPane.TOP);
		framePrincipal.getContentPane().add(tabPrincipal, BorderLayout.CENTER);
		
		JPanel panelReportes = new JPanel();
		tabPrincipal.addTab("Reportes", null, panelReportes, null);
		panelReportes.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabReportes = new JTabbedPane(JTabbedPane.TOP);
		panelReportes.add(tabReportes, BorderLayout.CENTER);
		
		JPanel panelReportesUsuario = new JPanel();
		tabReportes.addTab("Por usuario", null, panelReportesUsuario, null);
		panelReportesUsuario.setLayout(null);
		
		JScrollPane scrollReportesUsuario = new JScrollPane();
		scrollReportesUsuario.setBounds(10, 11, 554, 283);
		panelReportesUsuario.add(scrollReportesUsuario);
		
		tableReportesUsuario = new JTable();
		scrollReportesUsuario.setViewportView(tableReportesUsuario);
		
		JPanel panelReportesItem = new JPanel();
		tabReportes.addTab("Por ítem", null, panelReportesItem, null);
		panelReportesItem.setLayout(null);
		
		JScrollPane scrollReportesItem = new JScrollPane();
		scrollReportesItem.setBounds(10, 11, 554, 283);
		panelReportesItem.add(scrollReportesItem);
		
		tableReportesItem = new JTable();
		scrollReportesItem.setViewportView(tableReportesItem);
		
		JPanel panelReportesCategoria = new JPanel();
		tabReportes.addTab("Por categoría", null, panelReportesCategoria, null);
		panelReportesCategoria.setLayout(null);
		
		JScrollPane scrollReportesCategoria = new JScrollPane();
		scrollReportesCategoria.setBounds(10, 11, 554, 283);
		panelReportesCategoria.add(scrollReportesCategoria);
		
		tableReportesCategoria = new JTable();
		scrollReportesCategoria.setViewportView(tableReportesCategoria);
		
		JPanel panelReportesTipo = new JPanel();
		tabReportes.addTab("Por tipo", null, panelReportesTipo, null);
		panelReportesTipo.setLayout(null);
		
		JScrollPane scrollReportesTipo = new JScrollPane();
		scrollReportesTipo.setBounds(10, 11, 554, 283);
		panelReportesTipo.add(scrollReportesTipo);
		
		tableReportesTipo = new JTable();
		scrollReportesTipo.setViewportView(tableReportesTipo);
		
		JPanel panelPrestamos = new JPanel();
		tabPrincipal.addTab("Préstamos", null, panelPrestamos, null);
		panelPrestamos.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabPrestamos = new JTabbedPane(JTabbedPane.TOP);
		panelPrestamos.add(tabPrestamos, BorderLayout.CENTER);

		JPanel panPrestamosCrearPrestamo = new JPanel();
		tabPrestamos.addTab("Crear préstamo", null, panPrestamosCrearPrestamo, null);
		panPrestamosCrearPrestamo.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("A nombre de: ");
		lblNewLabel_1.setBounds(10, 11, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 7, 465, 22);
		panPrestamosCrearPrestamo.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Se prestará:");
		lblNewLabel_2.setBounds(10, 49, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Crear préstamo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(439, 261, 125, 33);
		panPrestamosCrearPrestamo.add(btnNewButton);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(99, 49, 465, 201);
		panPrestamosCrearPrestamo.add(scrollPane_4);
		
		JList list = new JList();
		scrollPane_4.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("Incluir alerta?");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 114, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nota: Esto no");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 128, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("es editable");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 139, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("      Sí       No");
		lblNewLabel_7.setBounds(10, 160, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_7);
		
		JRadioButton rdbtnIncluirAlertaSi = new JRadioButton("");
		buttonGroup.add(rdbtnIncluirAlertaSi);
		rdbtnIncluirAlertaSi.setBounds(20, 181, 21, 23);
		panPrestamosCrearPrestamo.add(rdbtnIncluirAlertaSi);
		
		JRadioButton rdbtnIncluirAlertaNo = new JRadioButton("");
		buttonGroup.add(rdbtnIncluirAlertaNo);
		rdbtnIncluirAlertaNo.setSelected(true);
		rdbtnIncluirAlertaNo.setBounds(55, 181, 21, 23);
		panPrestamosCrearPrestamo.add(rdbtnIncluirAlertaNo);
		
		JLabel lblNewLabel_8 = new JLabel("Repetir?");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 229, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_8);
		
		JRadioButton rdbtnRepetirSi = new JRadioButton("");
		buttonGroup_1.add(rdbtnRepetirSi);
		rdbtnRepetirSi.setBounds(20, 271, 21, 23);
		panPrestamosCrearPrestamo.add(rdbtnRepetirSi);
		
		JRadioButton rdbtnRepetirNo = new JRadioButton("");
		buttonGroup_1.add(rdbtnRepetirNo);
		rdbtnRepetirNo.setSelected(true);
		rdbtnRepetirNo.setBounds(55, 271, 21, 23);
		panPrestamosCrearPrestamo.add(rdbtnRepetirNo);
		
		JLabel lblNewLabel_7_1 = new JLabel("      Sí        No");
		lblNewLabel_7_1.setBounds(10, 250, 79, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_9 = new JLabel("Cada:");
		lblNewLabel_9.setBounds(109, 270, 34, 14);
		panPrestamosCrearPrestamo.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(146, 267, 95, 20);
		panPrestamosCrearPrestamo.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Minutos", "Horas"}));
		comboBox_2.setBounds(251, 266, 125, 22);
		panPrestamosCrearPrestamo.add(comboBox_2);
		
		JPanel panPrestamosRetornarItems = new JPanel();
		tabPrestamos.addTab("Retornar ítems", null, panPrestamosRetornarItems, null);
		panPrestamosRetornarItems.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Del préstamo:");
		lblNewLabel_1_1.setBounds(10, 11, 79, 14);
		panPrestamosRetornarItems.add(lblNewLabel_1_1);
		
		JButton btnDevolvertems = new JButton("Devolver ítems");
		btnDevolvertems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDevolvertems.setBounds(439, 261, 125, 33);
		panPrestamosRetornarItems.add(btnDevolvertems);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 7, 465, 22);
		panPrestamosRetornarItems.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Se devolverá:");
		lblNewLabel_3.setBounds(10, 49, 79, 14);
		panPrestamosRetornarItems.add(lblNewLabel_3);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(99, 49, 465, 201);
		panPrestamosRetornarItems.add(scrollPane_5);
		
		JList list_1 = new JList();
		scrollPane_5.setViewportView(list_1);
		
		JPanel panPrestamosFinalizar = new JPanel();
		tabPrestamos.addTab("Finalizar préstamo", null, panPrestamosFinalizar, null);
		panPrestamosFinalizar.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Elija el préstamo a finalizar:");
		lblNewLabel_10.setBounds(10, 11, 136, 14);
		panPrestamosFinalizar.add(lblNewLabel_10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 36, 554, 22);
		panPrestamosFinalizar.add(comboBox_3);
		
		JLabel lblNewLabel_11 = new JLabel("Advertencia");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(239, 115, 87, 22);
		panPrestamosFinalizar.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Una vez se finalice el préstamo, todos los ítems incluidos en el mismo quedarán disponibles para futuros");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(37, 148, 507, 14);
		panPrestamosFinalizar.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("préstamos, así como su alerta correspondiente se desactivará. Se recomienda ejecutar esta acción solo");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(37, 166, 509, 14);
		panPrestamosFinalizar.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("en préstamos vacíos. Los préstamos finalizados no se pueden recuperar.");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(37, 184, 507, 14);
		panPrestamosFinalizar.add(lblNewLabel_14);
		
		btnFinPres = new JButton("Finalizar préstamo");
		btnFinPres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFinPres.setSelected(false);
				btnFinPres.setEnabled(false);
			}
		});
		btnFinPres.setEnabled(false);

		btnFinPres.setBounds(214, 249, 143, 23);
		panPrestamosFinalizar.add(btnFinPres);
		
		chckbxFinPres = new JCheckBox("Entiendo y deseo continuar");
		chckbxFinPres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFinPres.setEnabled(true);
			}
		});
		chckbxFinPres.setBounds(195, 206, 182, 23);
		panPrestamosFinalizar.add(chckbxFinPres);
		
		JPanel panelAdmin = new JPanel();
		tabPrincipal.addTab("Administrador", null, panelAdmin, null);
		panelAdmin.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabAdmin = new JTabbedPane(JTabbedPane.TOP);
		panelAdmin.add(tabAdmin, BorderLayout.CENTER);
		
		JPanel panAdminPersonas = new JPanel();
		tabAdmin.addTab("Personas", null, panAdminPersonas, null);
		panAdminPersonas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personas Registradas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 554, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panAdminPersonas.add(lblNewLabel);
		
		JButton btnPersonasAgregar = new JButton("Agregar");
		btnPersonasAgregar.setBounds(55, 271, 89, 23);

		panAdminPersonas.add(btnPersonasAgregar);
		
		JButton btnPersonasVerModificar = new JButton("Ver/Modificar");

		btnPersonasVerModificar.setBounds(154, 271, 116, 23);
		panAdminPersonas.add(btnPersonasVerModificar);
		
		JButton btnPersonasBorrar = new JButton("Borrar");

		btnPersonasBorrar.setBounds(420, 271, 89, 23);
		panAdminPersonas.add(btnPersonasBorrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 554, 225);
		panAdminPersonas.add(scrollPane);
		
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
		
		JPanel panAdminItems = new JPanel();
		tabAdmin.addTab("Ítems", null, panAdminItems, null);
		panAdminItems.setLayout(null);
		
		JLabel lbltemsRegistrados = new JLabel("Ítems Registrados");
		lbltemsRegistrados.setHorizontalAlignment(SwingConstants.CENTER);
		lbltemsRegistrados.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbltemsRegistrados.setBounds(10, 11, 554, 25);
		panAdminItems.add(lbltemsRegistrados);
		
		JButton btnPersonasAgregar_1 = new JButton("Agregar");
		btnPersonasAgregar_1.setBounds(55, 271, 89, 23);
		panAdminItems.add(btnPersonasAgregar_1);
		
		JButton btnPersonasVerModificar_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1.setBounds(154, 271, 116, 23);
		panAdminItems.add(btnPersonasVerModificar_1);
		
		JButton btnPersonasBorrar_1 = new JButton("Borrar");
		btnPersonasBorrar_1.setBounds(420, 271, 89, 23);
		panAdminItems.add(btnPersonasBorrar_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 35, 554, 225);
		panAdminItems.add(scrollPane_1);
		
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
		
		JPanel panAdminCategorias = new JPanel();
		tabAdmin.addTab("Categorías", null, panAdminCategorias, null);
		panAdminCategorias.setLayout(null);
		
		JButton btnPersonasAgregar_1_1 = new JButton("Agregar");
		btnPersonasAgregar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPersonasAgregar_1_1.setBounds(55, 271, 89, 23);
		panAdminCategorias.add(btnPersonasAgregar_1_1);
		
		JButton btnPersonasVerModificar_1_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1_1.setBounds(154, 271, 116, 23);
		panAdminCategorias.add(btnPersonasVerModificar_1_1);
		
		JButton btnPersonasBorrar_1_1 = new JButton("Borrar");
		btnPersonasBorrar_1_1.setBounds(420, 271, 89, 23);
		panAdminCategorias.add(btnPersonasBorrar_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 554, 249);
		panAdminCategorias.add(scrollPane_2);
		
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
		
		JPanel panAdminTipos = new JPanel();
		tabAdmin.addTab("Tipos", null, panAdminTipos, null);
		panAdminTipos.setLayout(null);
		
		JButton btnPersonasAgregar_1_1_1 = new JButton("Agregar");
		btnPersonasAgregar_1_1_1.setBounds(55, 271, 89, 23);
		panAdminTipos.add(btnPersonasAgregar_1_1_1);
		
		JButton btnPersonasVerModificar_1_1_1 = new JButton("Ver/Modificar");
		btnPersonasVerModificar_1_1_1.setBounds(154, 271, 116, 23);
		panAdminTipos.add(btnPersonasVerModificar_1_1_1);
		
		JButton btnPersonasBorrar_1_1_1 = new JButton("Borrar");
		btnPersonasBorrar_1_1_1.setBounds(420, 271, 89, 23);
		panAdminTipos.add(btnPersonasBorrar_1_1_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 554, 249);
		panAdminTipos.add(scrollPane_3);
		
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
