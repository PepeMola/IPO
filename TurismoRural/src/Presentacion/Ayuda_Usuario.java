package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Ayuda_Usuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlInfo;
	private JEditorPane dtrpnEsteProgramaProporciona;

	
	/**
	 * Create the frame.
	 */
	public Ayuda_Usuario() {
		setTitle("Ayuda para el Usuario");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/help.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centrarPantalla();/*Contiene el setBounds del frame*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			contentPane.add(tabbedPane, BorderLayout.CENTER);
			{
				pnlInfo = new JPanel();
				tabbedPane.addTab("Informacion", new ImageIcon(Ayuda.class.getResource("/Presentacion/usuario.png")), pnlInfo, null);
				GridBagLayout gbl_pnlInfo = new GridBagLayout();
				gbl_pnlInfo.columnWidths = new int[]{0, 0, 0, 0, 0};
				gbl_pnlInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
				gbl_pnlInfo.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
				gbl_pnlInfo.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlInfo.setLayout(gbl_pnlInfo);
				{
					dtrpnEsteProgramaProporciona = new JEditorPane();
					dtrpnEsteProgramaProporciona.setEditable(false);
					dtrpnEsteProgramaProporciona.setText("Esta usted en la ventana del usuario, aqui se le muestran sus datos, y ademas podr\u00E1 seleccionar cualquier pesta\u00F1a para acceder a tablas, o para a\u00F1adir/modificar/eliminar turistas entre otros.");
					GridBagConstraints gbc_dtrpnEsteProgramaProporciona = new GridBagConstraints();
					gbc_dtrpnEsteProgramaProporciona.gridheight = 5;
					gbc_dtrpnEsteProgramaProporciona.gridwidth = 4;
					gbc_dtrpnEsteProgramaProporciona.insets = new Insets(0, 0, 5, 5);
					gbc_dtrpnEsteProgramaProporciona.fill = GridBagConstraints.BOTH;
					gbc_dtrpnEsteProgramaProporciona.gridx = 0;
					gbc_dtrpnEsteProgramaProporciona.gridy = 0;
					pnlInfo.add(dtrpnEsteProgramaProporciona, gbc_dtrpnEsteProgramaProporciona);
				}
				tabbedPane.setEnabledAt(0, true);
			}
		}
	}

	private void centrarPantalla() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension sizePantalla = pantalla.getScreenSize();

		int alturaPantalla = sizePantalla.height;
		int anchoPantalla = sizePantalla.width;

		setBounds(anchoPantalla/3, alturaPantalla/3, anchoPantalla/4, alturaPantalla/3);
	}
	
}
