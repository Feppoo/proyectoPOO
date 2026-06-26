package interfaz;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class BorrarItem extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrarItem dialog = new BorrarItem();
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
	public BorrarItem() {
		setBounds(100, 100, 200, 200);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Se borrará el ítem");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 60, 164, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(46, 85, 89, 23);
		getContentPane().add(btnNewButton);

	}

}
