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

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlInfo;
	private JPanel pnlAutores;
	private JLabel label;
	private JLabel label_1;
	private JEditorPane dtrpnEsteProgramaProporciona;

	
	/**
	 * Create the frame.
	 */
	public Ayuda() {
		setTitle("Ayuda");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/help.png")));
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
					dtrpnEsteProgramaProporciona.setText("Esta usted en el login, si desea acceder a la aplicacion, introduzca su nombre de usuario, y despues pulse enter, tras esto, podra introducir su contrase\u00F1a, si de nuevo pulsa enter, la contrase\u00F1a y usuario se verificaran, y podra pulsar acceder al programa, en caso de error, por favor introduzca de nuevo el usuario y contrase\u00F1a, y asegurese de que estan correctas");
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
			{
				pnlAutores = new JPanel();
				pnlAutores.setToolTipText("");
				tabbedPane.addTab("Autores", new ImageIcon(Ayuda.class.getResource("/Presentacion/libro.png")), pnlAutores, null);
				GridBagLayout gbl_pnlAutores = new GridBagLayout();
				gbl_pnlAutores.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
				gbl_pnlAutores.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
				gbl_pnlAutores.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlAutores.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlAutores.setLayout(gbl_pnlAutores);
				{
					label = new JLabel("Jose antonio Arias Ramos");
					GridBagConstraints gbc_label = new GridBagConstraints();
					gbc_label.insets = new Insets(0, 0, 5, 5);
					gbc_label.gridx = 1;
					gbc_label.gridy = 1;
					pnlAutores.add(label, gbc_label);
				}
				{
					label_1 = new JLabel("David Utrilla Paton");
					GridBagConstraints gbc_label_1 = new GridBagConstraints();
					gbc_label_1.anchor = GridBagConstraints.WEST;
					gbc_label_1.insets = new Insets(0, 0, 5, 5);
					gbc_label_1.gridx = 1;
					gbc_label_1.gridy = 2;
					pnlAutores.add(label_1, gbc_label_1);
				}
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
