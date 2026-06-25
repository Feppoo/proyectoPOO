package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ventanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JButton btnPrestamos = new JButton("Préstamos");
		btnPrestamos.setBounds(142, 149, 89, 23);
		getContentPane().add(btnPrestamos);
		
		JButton btnAdministracion = new JButton("Administración");
		btnAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdministracion.setBounds(130, 242, 116, 23);
		getContentPane().add(btnAdministracion);
		
		JButton btonReportes = new JButton("Reportes");
		btonReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btonReportes.setBounds(142, 183, 89, 23);
		getContentPane().add(btonReportes);
		
		JLabel labelMenuPrincipal = new JLabel("Menúm principal");
		labelMenuPrincipal.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		labelMenuPrincipal.setBounds(104, 54, 168, 39);
		getContentPane().add(labelMenuPrincipal);

	}
}
