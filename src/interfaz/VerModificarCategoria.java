package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VerModificarCategoria extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerModificarCategoria dialog = new VerModificarCategoria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerModificarCategoria() {
		setBounds(100, 100, 262, 124);
		getContentPane().setLayout(null);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(77, 54, 89, 23);
		getContentPane().add(btnEditar);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 14, 75, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(56, 11, 184, 20);
		getContentPane().add(textField);
		setLocationRelativeTo(null);;
	}

}
