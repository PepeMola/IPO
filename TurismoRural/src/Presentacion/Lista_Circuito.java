package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollBar;
import java.awt.GridBagConstraints;
import java.awt.ScrollPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Circuito extends JInternalFrame {
	private JTable mitabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Circuito frame = new Lista_Circuito();
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
	public Lista_Circuito() {
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setBounds(100, 100, 450, 300);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.SOUTH);
		
		JButton btnEliminarCircuito = new JButton("Eliminar Circuito");
		toolBar.add(btnEliminarCircuito);
		
		JButton btnAnadirCircuitp = new JButton("A\u00F1adir CIrcuitp");
		toolBar.add(btnAnadirCircuitp);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		panel.add(textArea, gbc_textArea);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPreferredSize(new Dimension(50, 120));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);
		
		ScrollPane scrollPane_1 = new ScrollPane();
		getContentPane().add(scrollPane_1, BorderLayout.CENTER);
		
		mitabla = new JTable();
		mitabla.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Ciudad-Real", "Puerta de Toledo", "Bar el Estudiante", "H&M,Mango,Pull&Bear", "-"},
				{"2", "Puertollano", "Fuente Agria", "El Bomba", "Sprinfield", null},
			},
			new String[] {
				"ID", "Localidades", "Monumentos", "Restaurantes", "Tiendas", "Puntos de interes"
			}
		));
		getContentPane().add(mitabla, BorderLayout.WEST);

	}

}
