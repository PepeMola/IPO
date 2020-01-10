package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Grupo_turistas;
import Dominio.Guia_turistico;
import Dominio.Hardcoded;
import Dominio.Turista;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nuevo_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDNI;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JTextField txtNumturistas;
	private JTextField textIntereses;
	private JTextField textTipo;
	private JLabel lblIntereses;
	private JLabel lblTipo;
	private JLabel lblDescripcion;
	private JTextField txtDescripcion;
	private JPanel pnlInfo;
	private JLabel lblInfo;
	private JButton btnAgregar;
	private JFrame f;
	/**
	 * Create the frame.
	 * @param t 
	 */
	public Nuevo_Cliente(Hardcoded h, Turista t) {
		f = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Nuevo_Cliente.class.getResource("/Presentacion/grupo_usuarios.png")));
		setTitle("Introducir Turistas");
		setBounds(100, 100, 452, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 39, -13, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 0;
		contentPane.add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 0;
		contentPane.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 1;
		contentPane.add(lblApellidos, gbc_lblApellidos);

		textApellido = new JTextField();
		GridBagConstraints gbc_textApellido = new GridBagConstraints();
		gbc_textApellido.gridwidth = 2;
		gbc_textApellido.insets = new Insets(0, 0, 5, 5);
		gbc_textApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellido.gridx = 2;
		gbc_textApellido.gridy = 1;
		contentPane.add(textApellido, gbc_textApellido);
		textApellido.setColumns(10);

		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 2;
		contentPane.add(lblDni, gbc_lblDni);

		textDNI = new JTextField();
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.gridwidth = 2;
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.gridx = 2;
		gbc_textDNI.gridy = 2;
		contentPane.add(textDNI, gbc_textDNI);
		textDNI.setColumns(10);

		JLabel lblEmail = new JLabel("e-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		contentPane.add(lblEmail, gbc_lblEmail);

		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 3;
		contentPane.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 4;
		contentPane.add(lblTelefono, gbc_lblTelefono);

		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.gridwidth = 2;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 2;
		gbc_textTelefono.gridy = 4;
		contentPane.add(textTelefono, gbc_textTelefono);
		textTelefono.setColumns(10);

		JLabel lblNewLabel = new JLabel("Num. Turistas:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		txtNumturistas = new JTextField();
		txtNumturistas.addKeyListener(new TxtNumturistasKeyListener());
		GridBagConstraints gbc_txtNumturistas = new GridBagConstraints();
		gbc_txtNumturistas.anchor = GridBagConstraints.WEST;
		gbc_txtNumturistas.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumturistas.gridx = 2;
		gbc_txtNumturistas.gridy = 5;
		contentPane.add(txtNumturistas, gbc_txtNumturistas);
		txtNumturistas.setColumns(10);

		lblIntereses = new JLabel("Intereses: ");
		GridBagConstraints gbc_lblIntereses = new GridBagConstraints();
		gbc_lblIntereses.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntereses.anchor = GridBagConstraints.EAST;
		gbc_lblIntereses.gridx = 1;
		gbc_lblIntereses.gridy = 6;
		contentPane.add(lblIntereses, gbc_lblIntereses);

		textIntereses = new JTextField();
		GridBagConstraints gbc_textIntereses = new GridBagConstraints();
		gbc_textIntereses.gridwidth = 2;
		gbc_textIntereses.insets = new Insets(0, 0, 5, 5);
		gbc_textIntereses.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIntereses.gridx = 2;
		gbc_textIntereses.gridy = 6;
		contentPane.add(textIntereses, gbc_textIntereses);
		textIntereses.setColumns(10);

		lblTipo = new JLabel("Tipo: ");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 7;
		contentPane.add(lblTipo, gbc_lblTipo);

		textTipo = new JTextField();
		GridBagConstraints gbc_textTipo = new GridBagConstraints();
		gbc_textTipo.gridwidth = 2;
		gbc_textTipo.insets = new Insets(0, 0, 5, 5);
		gbc_textTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTipo.gridx = 2;
		gbc_textTipo.gridy = 7;
		contentPane.add(textTipo, gbc_textTipo);
		textTipo.setColumns(10);

		lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 8;
		contentPane.add(lblDescripcion, gbc_lblDescripcion);

		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridwidth = 2;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 8;
		contentPane.add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		btnAgregar = new JButton("Agregar");
		btnAgregar.setSelectedIcon(null);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turista t = new Turista();
				Grupo_turistas gt = new Grupo_turistas();
				int codigo=JOptionPane.showConfirmDialog(contentPane, "¿Esta seguro de que quiere añadir el nuevo guia?", "Alerta", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (codigo==JOptionPane.YES_OPTION){
					t.setId_grupo(h.getGrupoTuristas().size()+1);
					t.setNombre(textNombre.getText());
					t.setApellido(textApellido.getText());
					t.setEmail(textEmail.getText());
					t.setDni(textDNI.getText());
					t.setTelefono(textTelefono.getText());
					gt.setId(h.getGrupoTuristas().size()+1);
					gt.setNum(txtNumturistas.getText());
					gt.setDescripcion(txtDescripcion.getText());
					gt.setTipo(textTipo.getText());
					gt.setIntereses(textIntereses.getText());
					h.setGrupoTuristas(gt);
					h.setTuristas(t);
					dispose();
				}
			}
		});

		pnlInfo = new JPanel();
		GridBagConstraints gbc_pnlInfo = new GridBagConstraints();
		gbc_pnlInfo.gridwidth = 2;
		gbc_pnlInfo.gridheight = 2;
		gbc_pnlInfo.insets = new Insets(0, 0, 5, 5);
		gbc_pnlInfo.fill = GridBagConstraints.BOTH;
		gbc_pnlInfo.gridx = 0;
		gbc_pnlInfo.gridy = 9;
		contentPane.add(pnlInfo, gbc_pnlInfo);

		lblInfo = new JLabel("");
		pnlInfo.add(lblInfo);
		btnAgregar.setToolTipText("Agrega el usuario introducido");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 2;
		gbc_btnAgregar.gridy = 9;
		contentPane.add(btnAgregar, gbc_btnAgregar);

		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setToolTipText("Vuelve al panel central");
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 3;
		gbc_btnAtras.gridy = 9;
		contentPane.add(btnAtras, gbc_btnAtras);
		if (t != null) {
			rellenarTuristas(h, t);
		}
	}

	private void rellenarTuristas(Hardcoded h, Turista t) {
		Grupo_turistas g = new Grupo_turistas();
		for (int i = 0; i < h.getGrupoTuristas().size(); i++) {
			if (h.getGrupoTuristas().get(i).getId() == t.getId_grupo()) {
				g = h.getGrupoTuristas().get(i);
			}
		}
		textNombre.setText(t.getNombre());
		textApellido.setText(t.getApellido());
		textEmail.setText(t.getEmail());
		textDNI.setText(t.getDni());
		textTelefono.setText(t.getTelefono());
	
		txtNumturistas.setText(g.getNum());
		txtDescripcion.setText(g.getDescripcion());
		textTipo.setText(g.getTipo());
		textIntereses.setText(g.getIntereses());
		
	}

	private class TxtNumturistasKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent arg0) {
			if (Integer.parseInt(txtNumturistas.getText())>=4 || Integer.parseInt(txtNumturistas.getText())<21) {
				btnAgregar.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(f, "Los grupos son de 4 a 20 personas,"
						+ "introduzca numero valido, por favor.","Error message", JOptionPane.ERROR_MESSAGE);
				txtNumturistas.requestFocus();
			}

		}
	}
}
