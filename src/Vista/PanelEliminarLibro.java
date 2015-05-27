package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logica.Biblioteca;

public class PanelEliminarLibro extends JPanel implements ActionListener {


	Biblioteca e = Biblioteca.getInstance();

	JPanel pn = new JPanel();
	private JLabel lblIsbn;
	private JTextField txtIsbn;
	private JButton btnEliminar;
	private JButton  btnAtras;

	private VentanaEliminarLibro ventana;


	

	public PanelEliminarLibro(VentanaEliminarLibro ventana){
	this.ventana=ventana;	
		JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/eliminarLibro.png")));


		Font osb = new Font( "Open Sans",Font.BOLD,15); 
		Font os = new Font( "Open Sans",Font.PLAIN,14);


		Color marron = new Color(127, 52, 45);
		Color amarillo = new Color(255, 194, 92);

		lblIsbn = new JLabel("Codigo ISBN A ELIMINAR: ");
		lblIsbn.setForeground(marron);
		lblIsbn.setFont(os);

		txtIsbn = new JTextField(20);
		txtIsbn.setFont(os);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBackground(marron);
		btnEliminar.setForeground(amarillo);
		btnEliminar.setFont(osb);
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(this);


		pn.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		pn.add(lblIsbn, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		pn.add(txtIsbn, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(10, 3, 3, 3);
		gbc.fill = GridBagConstraints.EAST;
		pn.add(btnEliminar, gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(10, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		pn.add( btnAtras, gbc);


		pn.setBackground(null);


		this.add(pn);
		this.setForeground(marron);
		this.setBackground(amarillo);




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
		this.add(pn, gbc1);

		 btnAtras.setBackground(new Color(127, 52, 45));
		 btnAtras.setForeground(new Color(255, 194, 92));
		

	}


	public String getTxtId() {
		return txtIsbn.getText();
	}


	public void setTxtId(String txtId) {
		this.txtIsbn.setText(txtId);
	}	

	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==btnEliminar){
			String isbn= txtIsbn.getText();
			try {
				Biblioteca.getInstance().eliminarLibro(isbn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "El Libro se elimino correctamente correctamente");
		}
		if (evento.getSource() ==  btnAtras) {
			this.setVisible(false);
			this.setLayout(null);
			ventana.cerrar();
		}
		
	}
}