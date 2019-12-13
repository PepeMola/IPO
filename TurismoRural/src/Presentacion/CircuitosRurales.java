package Presentacion;

import java.awt.EventQueue;
import Persistencia.Usuario;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLayeredPane;

public class CircuitosRurales {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircuitosRurales window = new CircuitosRurales();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CircuitosRurales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPanel.setBorder(new TitledBorder(null, "Circuitos IPO Rurales S.L.", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(tabbedPanel, BorderLayout.CENTER);
		
		JLayeredPane layeredUsuario = new JLayeredPane();
		layeredUsuario.setToolTipText("Informacion Usuario actual");
		tabbedPanel.addTab("Usuario", null, layeredUsuario, null);
		
		JLayeredPane layeredHistorial = new JLayeredPane();
		layeredHistorial.setToolTipText("Historial de Circuitos");
		tabbedPanel.addTab("Historial", null, layeredHistorial, null);
		
		JLayeredPane layeredCircuitos = new JLayeredPane();
		layeredCircuitos.setToolTipText("Circuitos Disponibles");
		tabbedPanel.addTab("Circuitos", null, layeredCircuitos, null);
	}
}
