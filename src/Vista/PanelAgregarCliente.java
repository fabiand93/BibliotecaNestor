package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

import javax.swing.*;

import Logica.Biblioteca;
import Logica.UsuarioCliente;
import Logica.InventarioCliente;




public class PanelAgregarCliente extends JPanel implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextArea txtArea;

	private JLabel lblInicial;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblId;
	private JLabel lblNombreUsuario;
	private JLabel lblPassword;
    
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNombreUsuario;
	private JTextField txtPassword;
	
    private JButton btnAgregar, btnCancelar, btnAtras;
	
	private VentanaAdministrador ventanaAdministrador;
	

	public PanelAgregarCliente() {
		
		
		
		



		lblInicial = new JLabel("Introduzca los datos del Cliente");
		lblId = new JLabel("ID:");
		txtId = new JTextField(10);
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField(10);
		lblApellido = new JLabel("Apellido:");
		txtApellido = new JTextField(10);
		lblNombreUsuario = new JLabel("Nombre de Usuario:");
		txtNombreUsuario = new JTextField(10);
		lblPassword = new JLabel("Password: ");
		txtPassword = new JTextField(10);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		 btnAtras = new JButton("Atras");
		 btnAtras.addActionListener(this);

		//CREACION Y POSICIONAMIENTO DEL PANEL DE DATOS



		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();



		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(30, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblId, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(30, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtId, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblNombre, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtNombre, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblApellido, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
	    panelDatos.add(txtApellido, gbc);







		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblNombreUsuario, gbc);

		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtNombreUsuario, gbc);

		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblPassword, gbc);

		gbc.gridx = 1;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtPassword, gbc);

		panelDatos.setBackground(null);

		//CREACION Y POSICIONAMIENTO DEL PANEL DE BOTONES
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();

		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(30, 3, 3, 3);
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnAgregar, gbc1);

		gbc1.gridx = 1;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(30, 3, 3, 3);
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.anchor = GridBagConstraints.WEST;
		panelBotones.add( btnAtras, gbc1);

		panelBotones.setBackground(null);

		this.add(lblInicial);
		this.add(panelDatos);
		this.add(panelBotones);
		this.setBackground(new Color(255, 194, 92));

		Color cTipografia = new Color(127, 52, 45);
		Font osb = new Font("Open Sans", Font.BOLD, 15);
		Font os = new Font("Open Sans", Font.PLAIN, 14);
		lblInicial.setFont(osb);
		lblInicial.setForeground(cTipografia);
		lblId.setForeground(cTipografia);
		lblId.setFont(os);
		txtId.setFont(os);
		lblNombre.setFont(os);
		lblNombre.setForeground(cTipografia);
		txtNombre.setFont(os);
		lblApellido.setForeground(cTipografia);
		lblApellido.setFont(os);
		txtApellido.setFont(os);
		



		lblNombreUsuario.setFont(os);
		lblNombreUsuario.setForeground(cTipografia);
		txtNombreUsuario.setFont(os);
		lblPassword.setFont(os);
		lblPassword.setForeground(cTipografia);
		txtPassword.setFont(os);

		btnAgregar.setFont(osb);
		btnAgregar.setBackground(new Color(127, 52, 45));
		btnAgregar.setForeground(new Color(255, 194, 92));
		 btnAtras.setFont(osb);
		 btnAtras.setBackground(new Color(127, 52, 45));
		 btnAtras.setForeground(new Color(255, 194, 92));
		btnAgregar.setToolTipText("Confirma la informacion"); //Muestra informacion del elemento con el cursor

	}

	public JLabel getLblInicial() {
		return lblInicial;
	}

	public void setLblInicial(JLabel lblInicial) {
		this.lblInicial = lblInicial;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblId() {
		return lblId;
	}

	public void setLblId(JLabel lblId) {
		this.lblId = lblId;
	}

	public JLabel getLblNombreUsuario() {
		return lblNombreUsuario;
	}

	public void setLblNombreUsuario(JLabel lblNombreUsuario) {
		this.lblNombreUsuario = lblNombreUsuario;
	}

	public JLabel getLblPassword() {
		return lblPassword;
	}

	public void setLblPassword(JLabel lblPassword) {
		this.lblPassword = lblPassword;
	}

	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public void setTxtNombre(String txtNombre) {
		this.txtNombre.setText(txtNombre);
	}

	public String getTxtApellido() {
		return txtApellido.getText();
	}

	public void setTxtApellido(String txtApellido) {
		this.txtApellido.setText(txtApellido);
	}

	public  String getTxtId() {
		return txtId.getText();
	}

	public void setTxtId(String txtId) {
		this.txtId.setText(txtId);
	}


	public String getTxtNombreUsuario() {
		return txtNombreUsuario.getText();
	}

	public void setTxtNombreUsuario(String txtNombreUsuario) {
		this.txtNombreUsuario.setText(txtNombreUsuario);
	}

	public String getTxtPassword() {
		return txtPassword.getText();
	}

	public void setTxtPassword(String txtPassword) {
		this.txtPassword.setText(txtPassword);
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnRestablecer() {
		return  btnAtras;
	}

	public void setBtnRestablecer(JButton btnRestablecer) {
		this. btnAtras = btnRestablecer;
	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() ==  btnAtras) {
			
			this.setVisible(false);
			ventanaAdministrador.setVisible(true);
			
		
				
			

		}
		if (evento.getSource() == btnAgregar) {
			String id = txtId.getText();
			String nombre = txtNombre.getText();
			String apellido = txtApellido.getText();
			String usuario =txtNombreUsuario.getText();
			String contrasena = txtPassword.getText(); 
			try {
				Biblioteca.getInstance().agregarCliente(id,nombre, apellido,  usuario, contrasena);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
			setTxtNombre(null);
			setTxtApellido(null);
			setTxtId(null);
			setTxtNombreUsuario(null);
			setTxtPassword(null);
			
		}
	}
}

