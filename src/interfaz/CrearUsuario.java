package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearUsuario dialog = new CrearUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearUsuario() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(53, 84, 60, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Teléfono:");
			lblNewLabel_1.setBounds(53, 109, 60, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Correo:");
			lblNewLabel_2.setBounds(53, 134, 60, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(123, 81, 267, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(123, 106, 267, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(123, 131, 267, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Agregar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(169, 200, 89, 23);
			getContentPane().add(btnNewButton);
		}
	}

}
