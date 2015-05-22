package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logica.Biblioteca;


public class PanelCliente extends JPanel implements ActionListener {

	private JLabel lbli, lbln, image;
	private JButton btnBuscarLibro;


	Biblioteca e = Biblioteca.getInstance();
		public PanelCliente() {

		//LOGO YAMANTAKA
		JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/admin.png")));

		//BOTON AGREGAR CLIENTE
		ImageIcon iconConsultarLibro = new ImageIcon(getClass().getResource("../Imagenes/libro.png"));
		ImageIcon iEscalaAC = new ImageIcon(iconConsultarLibro.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnBuscarLibro = new JButton(iEscalaAC);
		btnBuscarLibro.addActionListener(this);
		btnBuscarLibro.setBackground(null);
		btnBuscarLibro.setBorderPainted(false);

	
		//Sub-Panel
		JPanel panelDatos = new JPanel();

		//CAMBIO DE CONFIGURACION DE DISE�O DEL PANEL
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnBuscarLibro, gbc);

	
		//FONDO TRANSPARENTE AL PANEL DATOS
		panelDatos.setBackground(null);

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
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
		this.add(panelDatos, gbc1);

		// COLOR DEL FONDO
		this.setBackground(new Color(255, 194, 92));

		Font osb = new Font("Open Sans", Font.BOLD, 15); // Tipo de letra
		Font os = new Font("Open Sans", Font.PLAIN, 14);
	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == btnBuscarLibro) {
			VentanaConsultarLibro v2 = new VentanaConsultarLibro();
			



	}

}}

