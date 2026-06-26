package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class VerModificarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerModificarUsuario dialog = new VerModificarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerModificarUsuario() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(10, 11, 71, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Teléfono");
			lblNewLabel_1.setBounds(10, 36, 71, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Correo");
			lblNewLabel_2.setBounds(10, 61, 71, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(91, 11, 333, 14);
			getContentPane().add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(91, 36, 333, 14);
			getContentPane().add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(91, 61, 333, 14);
			getContentPane().add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Préstamos abiertos");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(16, 100, 101, 14);
			getContentPane().add(lblNewLabel_6);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 122, 119, 128);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"C\u00F3digo"
					}
				) {
					Class[] columnTypes = new Class[] {
						Integer.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
				scrollPane.setViewportView(table);
			}
		}
		{
			JLabel lblNewLabel_7 = new JLabel("Ítems en préstamo");
			lblNewLabel_7.setBounds(229, 100, 90, 14);
			getContentPane().add(lblNewLabel_7);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(145, 125, 279, 125);
			getContentPane().add(scrollPane);
			{
				table_1 = new JTable();
				table_1.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"C\u00F3digo", "Nombre"
					}
				));
				scrollPane.setViewportView(table_1);
			}
		}
	}

}
