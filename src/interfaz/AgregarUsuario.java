package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgregarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarUsuario dialog = new AgregarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarUsuario() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(10, 11, 85, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Teléfono");
			lblNewLabel_1.setBounds(10, 36, 85, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Correo");
			lblNewLabel_2.setBounds(10, 61, 85, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(105, 8, 319, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(105, 33, 319, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(105, 58, 319, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Agregar");
			btnNewButton.setBounds(170, 186, 89, 23);
			getContentPane().add(btnNewButton);
		}
	}

}
