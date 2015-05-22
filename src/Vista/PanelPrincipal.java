package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class PanelPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblRol, lblUsuario, lblContrasena, image;
	private JTextField txtUsuario;
	private JComboBox<String> rol;
	private JPasswordField pssContrasena;
	
	private ImageIcon imagen;
		
	public PanelPrincipal(){
		

		lblRol = new JLabel("Rol: ");
		rol = new JComboBox<String>();

		
		lblUsuario = new JLabel("Usuario: ");
		txtUsuario = new JTextField(13);
		lblContrasena = new JLabel("Contraseña: ");
		pssContrasena = new JPasswordField(20);
		imagen = new ImageIcon(getClass().getResource("../imagenes/libro.png"));
		image = new JLabel(imagen);

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(lblUsuario, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(txtUsuario, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(lblContrasena, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
//		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(pssContrasena, gbc);

		panelDatos.setBackground(null);	

		JPanel panelimagen = new JPanel();
		panelimagen.setLayout(new GridBagLayout());
		
		GridBagConstraints img = new GridBagConstraints();
		img.gridx = 0;
		img.gridy = 0;
		img.gridwidth = 1;
		img.gridheight = 1;
		img.weightx = 0.0;
		img.weighty = 1.0;
		img.insets = new Insets(7, 3, 3, 3);
		img.fill = GridBagConstraints.NONE;
		img.anchor = GridBagConstraints.CENTER;
		panelimagen.add(image, img);
		panelimagen.setBackground(null);	

		Font os = new Font( "Open Sans",Font.PLAIN,14);
		
		lblRol.setForeground(new Color(127, 52, 45));
		lblRol.setFont(os);
		lblRol = new JLabel ("ROL: ");
		rol = new JComboBox<String>();
		rol.addItem("ADMINISTRADOR");
		rol.addItem("CLIENTE");
		
		lblUsuario.setFont(os);	
		lblUsuario.setForeground(new Color(127, 52, 45));
		txtUsuario.setFont(os);
		
		lblContrasena.setForeground(new Color(127, 52, 45));
		lblContrasena.setFont(os);
		pssContrasena.setFont(os);


		

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelDatos.add(rol, gbc);

		GridBagConstraints pn = new GridBagConstraints();
		pn.gridx = 0;
		pn.gridy = 0;
		pn.gridwidth = 1;
		pn.gridheight = 1;
		pn.weightx = 0.0;
		pn.weighty = 1.0;
		pn.insets = new Insets(7, 3, 3, 3);
		pn.fill = GridBagConstraints.BOTH;
		pn.anchor = GridBagConstraints.CENTER;
		this.add(panelimagen, pn);

		GridBagConstraints pn1 = new GridBagConstraints();
		pn1.gridx = 1;
		pn1.gridy = 0;
		pn1.gridwidth = 1;
		pn1.gridheight = 1;
		pn1.weightx = 0.0;
		pn1.weighty = 1.0;
		pn1.insets = new Insets(7, 3, 3, 3);
		pn1.fill = GridBagConstraints.BOTH;
		pn1.anchor = GridBagConstraints.CENTER;
		this.add(panelDatos, pn1);
	}


	public String getTxtUsuario() {
		return txtUsuario.getText();
	}

	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario.setText(txtUsuario);
	}

	
	@SuppressWarnings("deprecation")
	public String getTxtContrasena() {
		return pssContrasena.getText();
	}

	/**
	 * M�todo para sustituir el valor de txtContrase�a
	 * @param txtContrase�a valor original ingresado en el JTextField
	 */
	public void setTxtContrasena(String txtContrasena) {
		String c = new String(txtContrasena);
		this.pssContrasena.setText(c);
	}


	public JComboBox<String> getRol() {
		return rol;
	}


	public void setRol(JComboBox<String> rol) {
		this.rol = rol;
	}

	
}	