package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgregarCategoria extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarCategoria dialog = new AgregarCategoria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarCategoria() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(10, 117, 75, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(95, 114, 329, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
	}

}
