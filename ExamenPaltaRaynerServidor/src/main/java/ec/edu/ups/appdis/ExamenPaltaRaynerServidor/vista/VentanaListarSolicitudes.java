package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;

public class VentanaListarSolicitudes {

	private JFrame frmSolicitudesEnvios;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListarSolicitudes window = new VentanaListarSolicitudes();
					window.frmSolicitudesEnvios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaListarSolicitudes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSolicitudesEnvios = new JFrame();
		frmSolicitudesEnvios.setTitle("SOLICITUDES ENVIOS");
		frmSolicitudesEnvios.setBounds(100, 100, 734, 472);
		frmSolicitudesEnvios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSolicitudesEnvios.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(204, 204, 255));
		table.setBounds(547, 74, -537, 336);
		frmSolicitudesEnvios.getContentPane().add(table);
	}
}
