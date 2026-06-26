package interfaz;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class BorrarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrarUsuario dialog = new BorrarUsuario();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public BorrarUsuario() {
		setBounds(100, 100, 200, 200);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Se borrará el usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 67, 164, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(48, 92, 89, 23);
		getContentPane().add(btnNewButton);

	}

}
