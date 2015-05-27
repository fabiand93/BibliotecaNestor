package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelConsultarLibro<isEmpty> extends JPanel implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblInicial;
	private JLabel lblNombreAutor;
	private JLabel lblTituloLibro;
	 private JButton btnBuscar;

	private JTextField txtNombreAutor;
	private JTextField txtTituloLibro;
	
	@SuppressWarnings("unused")
	private JLabel lbli, lbln, image;
	

	/**
	 * Crea un JPanel con los Componentes
	 */

	public PanelConsultarLibro() {

		//LOGO YAMANTAKA
		JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/BienvenidoCliente.png")));

		lblInicial = new JLabel("Introduzca el libro a buscar");
		lblNombreAutor = new JLabel("Nombre del autor:");
		txtNombreAutor = new JTextField(10);
		lblTituloLibro = new JLabel("titulo del libro:");
		txtTituloLibro = new JTextField(12);
		

		

		
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
		panelDatos.add(lblNombreAutor, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(30, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtNombreAutor, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblTituloLibro, gbc);


		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtTituloLibro, gbc);


		 btnBuscar = new JButton("Buscar");
	        btnBuscar.addActionListener(this);
	   

		 gbc.gridx = 2;
	        gbc.gridy = 0;
	        gbc.gridwidth = 1;
	        gbc.gridheight = 1;
	        gbc.weightx = 0.0;
	        gbc.weighty = 1.0;
	        gbc.insets = new Insets(30, 3, 30, 3);
	        gbc.fill = GridBagConstraints.BOTH;
	        gbc.anchor = GridBagConstraints.WEST;
	        panelDatos.add(btnBuscar, gbc);
		

		panelDatos.setBackground(null);

		//CREACION Y POSICIONAMIENTO DEL PANEL DE BOTONES
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();

		
		

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
		lblNombreAutor.setFont(os);
		lblNombreAutor.setForeground(cTipografia);
		txtNombreAutor.setFont(os);
		
		lblTituloLibro.setFont(os);
		lblTituloLibro.setForeground(cTipografia);
		txtTituloLibro.setFont(os);
	

	
	
	
	
	
	
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(Logo, gbc1);

		gbc1.gridx = 0;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(panelDatos, gbc);

	
	
	
	
	
	
	
	
	
	
	
	
	}

	public JLabel getLblInicial() {
		return lblInicial;
	}

	public void setLblInicial(JLabel lblInicial) {
		this.lblInicial = lblInicial;
	}

	public JLabel getLblNombre() {
		return lblNombreAutor;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombreAutor = lblNombre;
	}

	public JLabel getLblNombreAutor() {
		return lblNombreAutor;
	}

	public void setLblNombreAutor(JLabel lblNombreAutor) {
		this.lblNombreAutor = lblNombreAutor;
	}

	public JLabel getLblTituloLibro() {
		return lblTituloLibro;
	}

	public void setLblTituloLibro(JLabel lblTituloLibro) {
		this.lblTituloLibro = lblTituloLibro;
	}

	public JTextField getTxtNombreAutor() {
		return txtNombreAutor;
	}

	public void setTxtNombreAutor(JTextField txtNombreAutor) {
		this.txtNombreAutor = txtNombreAutor;
	}

	public JTextField getTxtTituloLibro() {
		return txtTituloLibro;
	}

	public void setTxtTituloLibro(JTextField txtTituloLibro) {
		this.txtTituloLibro = txtTituloLibro;
	}

	public JLabel getLblApellido() {
		return lblTituloLibro;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblTituloLibro = lblApellido;
	}

	public JTextField getTxtNombre() {
		return txtNombreAutor;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombreAutor = txtNombre;
	}

	
	public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == btnBuscar) {
        	JOptionPane.showMessageDialog(null, "Buscar Libro",
        			  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

	}
}
}